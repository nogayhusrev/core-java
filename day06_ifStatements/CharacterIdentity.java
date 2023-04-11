package day06_ifStatements;
public class CharacterIdentity {
    public static void main(String[] args) {
        char ch='+';

        if(Character.isLetter(ch)){
            System.out.println("Letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }


    }
}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table


 */