package javaexample8;

import java.util.Scanner;

public class JavaExample8 {

    public static void main(String[] args) {

        int a = 0;
        String result;
        Scanner in = new Scanner(System.in);
        System.out.print("Input your integer number: ");

        try {
            a = in.nextInt();
            result = Integer.toString(a);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = "Not a valid integer";
        }

        System.out.println();
        System.out.println("Your value is: " + result);
        in.close();
        
    }
}
