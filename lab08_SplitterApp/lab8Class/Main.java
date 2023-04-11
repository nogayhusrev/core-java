package lab08_SplitterApp.lab8Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the budget splitter");


        //User DB
        ArrayList<User> userList=prepareUserList(scanner);
        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count: " + userList.size());



        String [] optionList = prepareOptionList();


        while (true) {
            System.out.println("What would you like to do?");

            for (int i = 0; i < optionList.length; i++) {
                System.out.println("(" + (i + 1) + ")" + optionList[i]);
            }


            int request = scanner.nextInt();

            switch (request - 1) {
                case 0:
                    // 0:Make Expense
                    //Ask expense name, amount, user

                    Expense expense = new Expense();

                    System.out.println("Expense name:");
                    expense.expenseName= scanner.next();

                    System.out.println("Expense amount:");
                    expense.amount = scanner.nextInt();

                    System.out.println("Which user made this expense? Just type user id:");


                    //show all users: id:0 name: Ozzy
                    for(User user : userList){
                        System.out.println("id: " + userList.indexOf(user) + ", name: " + user.name);
                    }

                    int userId = scanner.nextInt();
                    User user = userList.get(userId);

                    expense.user = user.name;

                    expenseList.add(expense);


                    break;
                case 1:
                    //1:List Specific Person Expense
                    System.out.println("Please provide user name that you would like to search");
                    String userName=scanner.next();
                    
                    User myUser=null;
                    for (User usr:userList) {
                        if (usr.name.equals(userName)){
                            myUser=usr;
                        }
                    }

                    int userExpenseAmount = 0;
                    int expenseCount=0;

                    if (myUser==null){
                        System.out.println("User is not exist");
                    }else {
                        for(int i = 0;i<expenseList.size();i++){
                            if(myUser.name.equals(expenseList.get(i).user)){
                                expenseCount++;
                                userExpenseAmount+=expenseList.get(i).amount;
                                System.out.println(expenseCount + " - Expense name:" + expenseList.get(i).expenseName + " Amount:" + expenseList.get(i).amount + ", Expense by:" + expenseList.get(i).user);
                            }
                        }
                    }

                    System.out.println(myUser.name + " spent $ " + userExpenseAmount);

                    //0 - expense amount : 100, expense by :0zzy
                    //1 - expense amount : 100, expense by :0zzy
                    //ozzy spent $ 200


                    break;
                case 2:
                    //2:List All Expenses

                    for(int i = 0;i<expenseList.size();i++){
                        System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                    }

                    break;
                case 3:
                    //3:Make Split

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for(Split split : splitList){

                        totalAmount += split.amount;
                    }

                    makeSplit(totalAmount,splitList);

                    break;
                case 4:
                    //4:Lİst All Users

                    for (User usr:userList){
                        System.out.println(usr.name + "-" + usr.email );
                    }


                    break;
                case 5:
                    //5:Close The Budget
                    System.exit(0);

            }
        }




    }

    private static void makeSplit(double totalAmount, ArrayList<Split> splitList) {
        double amount = totalAmount /splitList.size();


        //total 300
        //each person : 100

        for(Split split : splitList){

            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " need to give " + (-1 * (split.amount-amount)));
            }

        }

    }

    private static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {
        ArrayList<Split> splitList = new ArrayList<>();

        for(Expense expense : expenseList){

            Split split = existSplitList(expense.user,splitList);

            if(split != null){
                split.amount += expense.amount;

            }else{
                Split willbeAdded = new Split();
                willbeAdded.userName = expense.user;
                willbeAdded.amount = expense.amount;
                splitList.add(willbeAdded);
            }
        }

        return splitList;
    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for(Split split : splitList){
            if(split.userName.equals(userName)){
                return split;
            }
        }

        return null;   //break till 3:30 (5 review)

    }

    private static String[] prepareOptionList() {

         /*
        Creating options
        0:Make Expense
        1:List Specific Person Expense
        2:List All Expenses
        3:Make Split
        4:Lİst All Users
        5:Close The Budget
        */

        String [] optionList = {"Make Expense","List Specific Person Expense","List All Expenses","Make Split","Lİst All Users","Close The Budget"};

        return optionList;
    }

    private static ArrayList<User> prepareUserList(Scanner scanner) {

        //Ask how many ppl in the budget planner?
        System.out.println("How many people will split the budget");
        int userCount= scanner.nextInt();

        ArrayList<User> userList= new ArrayList<>();

        for (int i = 0;i< userCount; i++){

            User user = new User();
            System.out.println("Name:");
            user.name = scanner.next();
            System.out.println("Email:");
            user.email = scanner.next();

            userList.add(user);
        }
        return userList;
    }
}
