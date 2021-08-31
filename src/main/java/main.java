/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("How many people? ");
        String a = sc.nextLine();
        System.out.printf("How Many pizzas do you have? ");
        String b = sc.nextLine();
        System.out.printf("How many slices per pizza? ");
        String c = sc.nextLine();
        int h = Integer.parseInt(a);
        int p = Integer.parseInt(b);
        int s = Integer.parseInt(c);
        System.out.printf("%d people with %d pizzas (%d slices)\n" +
                "Each person gets %d pieces of pizza.\n" +
                "There are %d leftover pieces.", h, p, s*p, (s*p)/h, (s*p)%h);
    }
}