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



        System.out.println("sortArray(arrayList) = " + Arrays.toString(sort_array(arraygiven)));

    }

    /**
     * this method takes ArrayList element and sort its elements in asc  then return as Integer []
     * @param  numList
     * @return  Integer []
     */
    public static int [] sort_array( int [] numList) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int eachNumber : numList) {
            list.add(eachNumber);
        }
        int [] ascList = new int [list.size()];
        int j = 0;
        while (!list.isEmpty()) {
            int min = list.get(0);
            for (Integer each : list) {
                if (each < min) {
                    min = each;
                }
            }
            ascList[j++] = min;
            //System.out.println("Collections.min(List) = " + Collections.min(List));
            list.remove((Integer) min);

        }
        return ascList;
    }
}


