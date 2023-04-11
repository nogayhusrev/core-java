package day19_array;

public class ClassMates2 {

    public static void main(String[] args){

        String[] arr={"java", "c++", "c#", "pyhton"};

        for (int i=0;i<arr.length;i++){
            String name=arr[i];
            String reverseName="";

            for (int j=name.length()-1;j>=0;j--){
                reverseName+=name.charAt(j);
            }
            System.out.println("reverseName = " + reverseName);
        }



    }
}


/*

2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */