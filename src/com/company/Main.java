package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a number to find primes up until that number:");
        int n = input.nextInt();
        int number = n;
        int i = 2;
        do {

            if ( isEven(n) || isDivisible(n)){
                n--;
                i++;
            }
            else if (!isEven(n) && !isDivisible(n)){
                numbers.add(n);
                n--;
                i++;
            }


        } while (i <= number);

        Collections.reverse(numbers);
        System.out.println("These are the prime numbers up until " + number + ": " + numbers );
    }

    private static boolean isDivisible(int n) {
        int i = 3;
        do {
            if (n%i != 0){
                i++;
            }
            else if (n == 3){
                return false;
            }
            else if ( n%i == 0){
                return true;
            }


        } while(i < .5*n);

        return false;
    }

    private static boolean isEven(int number){
        if (number==2) return false;
        else if (number % 2 == 0) {
            return true;
        }
        else return false;

    }
}
