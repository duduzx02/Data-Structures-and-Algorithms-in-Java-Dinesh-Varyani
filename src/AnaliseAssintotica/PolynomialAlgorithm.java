package AnaliseAssintotica;

public class PolynomialAlgorithm {
    public static void main(String[] args) {
        for(int i =1; i <= 3; i++){
            for (int j =1; j <= 3; j++){
                System.out.println("i = " + i + ",j = " +j);
            }
            System.out.println("End of inner loop");
        }
        System.out.println("Enf of outer loop");
    }
}
