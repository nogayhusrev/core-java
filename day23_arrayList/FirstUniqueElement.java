package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);


        for (Integer element : list) { // 1

            int frequency = 0;
            for (Integer each : list) {
                if(each == element){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
                break; // exiting the loop, in order to return the first unique element only
            }

        }



    }

}

/*
3. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */
