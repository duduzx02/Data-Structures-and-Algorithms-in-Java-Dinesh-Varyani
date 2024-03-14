package AnalusisOfAlgorithm;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class Suresh {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        Suresh demo = new Suresh();
        System.out.println(demo.findSum(99999999));

        System.out.println("Time: " + (System.currentTimeMillis() - now) + "milisecs." );

    }

    public int findSum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return  sum;
    }
}
