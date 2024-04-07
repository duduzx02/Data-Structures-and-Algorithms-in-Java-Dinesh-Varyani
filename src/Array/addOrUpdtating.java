package Array;

public class addOrUpdtating {
    public static void main(String[] args) {
        int[] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 4;
        myArray[2] = 3;
        myArray[3] = 2;
        myArray[4] = 1;

        myArray[2] = 9;


        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
