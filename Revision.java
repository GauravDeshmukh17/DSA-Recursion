// x power n

/*package com.company;

import java.util.Scanner;

public class Revision {

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=x*power(x,n-1);
        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(power(x,n));
    }
}*/

//----------------------------------------------------------------------------------------------------------

// PRINT ELEMENTS OF ARRAY

/*package com.company;

import java.util.Scanner;

public class Revision{

    public static void printArr(int arr[],int idx){
        if(idx== arr.length) return;
        System.out.println(arr[idx]);
        printArr(arr,idx+1);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        printArr(arr,0);
    }
}*/

//-----------------------------------------------------------------------------------------------------------

// x power n -> with less time complexity

package com.company;

import java.util.*;

public class Revision{

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=power(x,n/2);

        int finalAns=ans*ans;

        if(n%2!=0){
            ans=finalAns*x;
        }
        else{
            return finalAns;
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int pow=power(x,n);
        System.out.println(pow);
    }
}





