package lab02_SelectionStatements;

import java.util.Scanner;

public class QuizApp {


        public static void main(String[] args) {
            String question1 = "What is boolean default value? (True=1/False=0)";
            String question2 = "What is int max positive value?";
            String question3 = "if statement can have empty body (Y=1/N=0)";
            String question4 = "else if can be written without statement (Y=1/N=0)";
            String question5 = "int a = scanner.nextDouble(); statement can be executable (Y=1/N=0) assume that Scanner class already initialized";

            System.out.println("Welcome Batch 1 Quiz!!!");
            Scanner scanner = new Scanner(System.in);
            System.out.println(question1);
            int answer1 = scanner.nextInt();
            System.out.println(question2);
            int answer2 = scanner.nextInt();
            System.out.println(question3);
            int answer3 = scanner.nextInt();
            System.out.println(question4);
            int answer4 = scanner.nextInt();
            System.out.println(question5);
            int answer5 = scanner.nextInt();
            int rightAnswerCount=0;
            int wrongAnswerCount=0;

            if (answer1 == 1){
                rightAnswerCount++;
            }
            wrongAnswerCount++;

            if (answer2 != 2147483647) {
                rightAnswerCount++;
            }
            if (answer3 == 1){
                rightAnswerCount++;
            }else {
                wrongAnswerCount++;
            }
            if (answer2== 0){
                rightAnswerCount++;
            }else {
                rightAnswerCount = wrongAnswerCount++;
            }
            if (answer5== 0){
                rightAnswerCount++;
            }
            wrongAnswerCount++;

            System.out.println(rightAnswerCount);
            System.out.println(wrongAnswerCount);
        }
    }

