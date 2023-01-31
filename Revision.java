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

/*package com.company;

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
}*/

//-----------------------------------------------------------------------------------------------------------

 /*package com.company;
 import java.util.*;

 public class Revision{

     public static int power(int x,int n){
         if(n==0) return 1;
         int val=power(x,n/2);
         int ans=val*val;
         if(n%2!=0){
             ans*=x;
         }
         return ans;
     }

     public static void main(String[] args){
         Scanner scn=new Scanner(System.in);
         int x=scn.nextInt();
         int n= scn.nextInt();

         int pow=power(x,n);
         System.out.println(pow);
     }
}*/

 //-------------------------------------------------------------------------------------------------------

 // MAZE PATH

 /*package com.company;
 import java.util.*;

 public class Revision{

     public static ArrayList<String> mazePath(int row,int col,int drow,int dcol){

         if(row==drow+1 || col==dcol+1){
             ArrayList<String> base=new ArrayList<>();
             return base;
         }
         if(row==drow && col==dcol){
             ArrayList<String> base=new ArrayList<>();
             base.add("");
             return base;
         }
         ArrayList<String> list1=mazePath(row,col+1,drow,dcol);
         ArrayList<String> list2=mazePath(row+1,col,drow,dcol);

         ArrayList<String> ans=new ArrayList<>();
         for(int i=0;i<list1.size();i++){
             ans.add(list1.get(i)+'h');
         }
         for(int i=0;i<list2.size();i++){
             ans.add(list2.get(i)+'v');
         }
         return ans;
     }

     public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int m=scn.nextInt();
         int n= scn.nextInt();
         int[][] arr=new int[m][n];

         ArrayList<String> mp=mazePath(0,0,m-1,n-1);
         System.out.println(mp);
     }

}*/

//----------------------------------------------------------------------------------------------------------

 // PRINT DECREASING NUMBER

 package com.company;
 import java.util.*;

 public class Revision{

     public static void printDecreasing(int n){
         if(n==0) return;
         System.out.println(n);
         printDecreasing(n-1);
     }

     public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();

         printDecreasing(n);
     }
}



