package AnalusisOfAlgorithm;


public class Ramesh {

    public static void main(String[] args) {
    double now = System.currentTimeMillis();

    Ramesh demo = new Ramesh();
    System.out.println(demo.findSum(99999999));

    System.out.println("Time: " + (System.currentTimeMillis() - now) + "milisecs." );

}

    public int findSum(int n){
        return n * (n + 1) /2;
    }
}