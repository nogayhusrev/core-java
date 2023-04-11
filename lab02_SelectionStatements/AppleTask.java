package lab02_SelectionStatements;

public class AppleTask {

    public static void main(String[] args) {

        int apple1 = 20;
        int apple2 = 10;
        int apple3 = 10;
        int apple4 = 10;
        int apple5 = 10;
        int apple6 = 10;
        int apple7 = 10;

        int sum1 = apple1 + apple2 + apple3;
        int sum2 = apple4 + apple5 + apple6;

        if(sum1 == sum2){
            System.out.println("Found it ! Apple 7(" + apple7 + "gr) is heavier than others");
        }else{
            if(sum1>sum2){
                if(apple1 == apple2){
                    System.out.println("Found it ! Apple 3(" + apple3 + "gr) is heavier than others");
                }else{
                    if(apple1>apple2){
                        System.out.println("Found it ! Apple 1(" + apple1 + "gr) is heavier than others");
                    }else{
                        System.out.println("Found it ! Apple 2(" + apple2 + "gr) is heavier than others");
                    }
                }
            }else{  ///sum2>sum1
                if(apple4 == apple5){
                    System.out.println("Found it ! Apple 6(" + apple6 + "gr) is heavier than others");
                }else{
                    if(apple4>apple5){
                        System.out.println("Found it ! Apple 4(" + apple4 + "gr) is heavier than others");
                    }else{
                        System.out.println("Found it ! Apple 5(" + apple5 + "gr) is heavier than others");
                    }
                }

            }
        }


    }
}
