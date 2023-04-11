package day21_multiDimensionalArray;

public class IteratingMulti {

    public static void main(String[] args) {
        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (int a0=0;a0<array.length;a0++){
            for (int a1=0;a1<array[a0].length;a1++){
                for (int a2=0;a2<array[a0][a1].length;a2++){
                    for (int a3=0;a3<array[a0][a1][a2].length;a3++){
                        for (int a4=0;a4<array[a0][a1][a2][a3].length;a4++){
                            for (int a5=0;a5<array[a0][a1][a2][a3][a4].length;a5++){
                                for (int a6=0;a6<array[a0][a1][a2][a3][a4][a5].length;a6++){
                                    for (int a7=0;a7<array[a0][a1][a2][a3][a4][a5][a6].length;a7++){
                                        for (int a8=0;a8<array[a0][a1][a2][a3][a4][a5][a6][a7].length;a8++){
                                            for (int a9=0;a9<array[a0][a1][a2][a3][a4][a5][a6][a7][a8].length;a9++){
                                                System.out.println(array[a0][a1][a2][a3][a4][a5][a6][a7][a8][a9] + " ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("-----------------------");


        for (String[][][][][][][][][] each9DArray : array) {
            for (String[][][][][][][][] each8DArray : each9DArray) {
                for (String[][][][][][][] each7DArray : each8DArray) {
                    for (String[][][][][][] each6DArray : each7DArray) {
                        for (String[][][][][] each5DArray : each6DArray) {
                            for (String[][][][] each4DArray : each5DArray) {
                                for (String[][][] each3DArray : each4DArray) {
                                    for (String[][] each2DArray : each3DArray) {
                                        for (String[] each1DArray : each2DArray) {
                                            for (String eachElement : each1DArray) {
                                                System.out.println(eachElement);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can dispay each elements of the given array

 */