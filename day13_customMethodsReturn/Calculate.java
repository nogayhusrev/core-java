package day13_customMethodsReturn;

public class Calculate {
    public static void main(String[] args) {

        double num1=123,num2=1241;
        System.out.println(sum(num1,num2,'+'));
    }

    public static double sum(double num1,double num2, char op){

        switch (op){
            case '+':
                return num1+num2;
            case '*':
                return  num1*num2;
            case '/':
                if(num1!=0)
                    return 0;
                else
                    return num1/num2;
            case '-':
                return num1-num2;

        }
            return 0;
    }
}
