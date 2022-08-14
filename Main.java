// PRINT DECREASING NUMBER

/*package com.company;

import java.util.Scanner;

public class Main {

    public static void printDecreasing(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printDecreasing(n);
    }

}*/

//---------------------------------------------------------------------------------------------------------------

// PRINT INCREASING

/*package com.company;

import java.util.*;

public class Main{

    public static void printIncreasing(int n){
        if(n==0){
            return ;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printIncreasing(n);
    }

}*/

//---------------------------------------------------------------------------------------------------------------

// FACTORIAL

/*package com.company;

import java.util.*;

public class Main{

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
}*/

//---------------------------------------------------------------------------------------------------------------

// DECREASING INCREASING

package com.company;

import java.util.*;

public class Main{

    public static void decreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasingIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        decreasingIncreasing(n);
    }
}

//---------------------------------------------------------------------------------------------------------------



