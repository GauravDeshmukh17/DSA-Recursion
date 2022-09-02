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

package com.company;

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
}


