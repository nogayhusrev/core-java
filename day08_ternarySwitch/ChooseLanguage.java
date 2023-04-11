package day08_ternarySwitch;

public class ChooseLanguage {

    public static void main(String[] args) {
        int num=3;
        String for1="Hello, thank for your call",
                for2="Hola, gracias para llamar",
                for3=" Merhaba, aradiginiz icin tesekkurler",
                for4="Privet, spasibo za vash zvonok",
                for5="Merci ,pour votre appel";

        System.out.println(((num==1)?for1:
                                ((num==2)?for2:
                                        ((num==3)?for3:
                                                ((num==4)?for4:
                                                        ((num==5)?for5:"Invalid Info"))))));
        System.out.println("-------------------------------");
        String result="Invalid Info";



        switch (num){
            case 1: result=for1;break;
            case 2: result=for2;break;
            case 3: result=for3;break;
            case 4: result=for5;break;
            case 5: result=for5;break;
            default: System.out.println(result);
        }

    }
}
/*
5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement

 */