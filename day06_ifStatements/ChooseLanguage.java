package day06_ifStatements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int num=2;

        String text1[]={" ","Hello, thank for your call",
                "Hola, gracias para llamar",
                "Merhaba, aradiginiz icin tesekkurler",
                "Privet, spasibo za vash zvonok",
                "Merci ,pour votre appel"};



        System.out.println(text1[num]);


    }


}
/*
4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement


 */