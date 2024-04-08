package Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {

        int[] array = { 1, 12, 33, 55, 5, 6, 7, 8, 9, 10 };

        List<Integer> list = new ArrayList<>(); //
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                list.add(array[i]);
            }
        }

        System.out.println(list);
    }
}
