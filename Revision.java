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

 /*package com.company;
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
}*/

//----------------------------------------------------------------------------------------------------------

 // PRINT INCREASING

/* package com.company;
 import java.util.*;

 public class Revision{

     public static void printIncreasing(int n){
         if(n==0) return;
         printIncreasing(n-1);
         System.out.println(n);
     }

     public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();

         printIncreasing(n);
     }
 }*/

//---------------------------------------------------------------------------------------------------------

// FACTORIAL

/*package com.company;

import java.util.*;

public class Revision{

    public static int factorial(int n){
        if(n==0) return 1;
        int ans=n*factorial(n-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        System.out.println(factorial(n));
    }
}*/

 //-----------------------------------------------------------------------------------------------------

 // DISPLAY ARRAY ELEMENT USING RECURSION

/*package com.company;

 import java.util.*;

 public class Revision{

     public static void displayArrayElements(int[] arr,int idx){
         if(idx==-1) return;
         displayArrayElements(arr,idx-1);
         System.out.print(arr[idx]+" ");
     }

     public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=scn.nextInt();
         }

         displayArrayElements(arr,n-1);
     }
}*/

//------------------------------------------------------------------------------------------------------

// DISPLAY REVERSE ARRAY USING RECURSION

/*package com.company;

import java.util.*;

public class Revision{

    public static void displayReverseArray(int[] arr,int idx){
        if(idx==arr.length) return;
        displayReverseArray(arr,idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        displayReverseArray(arr,0);
    }
}*/

 //-------------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.*;

public class Revision{

    public static int maximumOfArray(int[] arr,int idx){
        if(idx==arr.length) return Integer.MIN_VALUE;
        int max=maximumOfArray(arr,idx+1);
        if(arr[idx]>max){
            max=arr[idx];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int moa=maximumOfArray(arr,0);
        System.out.println(moa);
    }
}*/

//-----------------------------------------------------------------------------------------------------

 // FIRST INDEX

/*package com.company;

import java.util.*;

public class Revision{

    public static int firstIndex(int[] arr,int target,int idx){
        if(arr[idx]==target) return idx;
        int ans=firstIndex(arr,target,idx+1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();

        System.out.println(firstIndex(arr,target,0));
    }
}*/

 //------------------------------------------------------------------------------------------------------

 /*package com.company;

 import java.util.*;

 public class Revision{

     public static int lastIndex(int[] arr,int target,int idx){
         if(arr[idx]==target) return idx;
         int ans=lastIndex(arr,target,idx-1);
         return ans;
     }

     public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=scn.nextInt();
         }
         int target=scn.nextInt();

         System.out.println(lastIndex(arr,target,n-1));
     }
 }*/


 //----------------------------------------------------------------------------------------------------------

// SUBSEQUENCE

/*package com.company;

import java.util.*;

public class Revision{

    public static ArrayList<String> subSequence(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> list=subSequence(ros);

        ArrayList<String> ans=new ArrayList<>();
        // Include
        for(int i=0;i< list.size();i++){
            ans.add(ch+list.get(i));
        }
        // Exclude
        for(int i=0;i< list.size();i++){
            ans.add(list.get(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        ArrayList<String > ss=subSequence(str);
        System.out.println(ss);
    }
}*/

//-------------------------------------------------------------------------------------------------------

 package com.company;

 import java.util.*;

public class Revision{

    public static void subSequence(String str,String asf){
        if(str.length()==0){
            System.out.print(asf+" ");
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        subSequence(ros,asf);
        subSequence(ros,asf+ch);
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        subSequence(str,"");
    }
}

