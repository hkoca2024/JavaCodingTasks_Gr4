package hamit;

import java.util.ArrayList;
import java.util.Arrays;

public class sortArray {
     /*
      write a return method that can sort and int array in ascending order
      without using the sort method of the arrays class
     */

    public static void main(String[] args) {
        int [] arraygiven ={10,9,8,7};
        Integer[] array=new Integer[arraygiven.length];
        for (int i = 0; i < arraygiven.length ; i++) {
            array [i]= arraygiven[i];
        }

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("sortArray(arrayList) = " + Arrays.toString(sort_array(arrayList)));

    }

    /**
     * this method takes ArrayList element and sort its elements in asc  then return as Integer []
     * @param List List
     * @return  Integer []
     */
    public static Integer[] sort_array(ArrayList<Integer> List) {

        Integer[] ascList = new Integer[List.size()];
        int j = 0;
        while (!List.isEmpty()) {
            Integer min = List.get(0);
            for (Integer each : List) {
                if (each < min) {
                    min = each;
                }
            }
            ascList[j++] = min;
            List.remove(min);

        }
        return ascList;
    }
}


