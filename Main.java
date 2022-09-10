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

/*package com.company;

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
}*/

//---------------------------------------------------------------------------------------------------------------

// x raised to power of n

/*package com.company;

import java.util.*;

public class Main{

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int pow=power(x,n);
        System.out.println(pow);
    }

}*/

//---------------------------------------------------------------------------------------------------------------

// x raised to power n (less time complexity)

/*package com.company;

import java.util.*;

public class Main{

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int pow=power(x,n/2);

        int ans=pow*pow;
        if(n%2!=0){
            ans=ans*x;
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(power(x,n));
    }

}*/

//---------------------------------------------------------------------------------------------------------------

// PRINT ZIG-ZAG

/*package com.company;

import java.util.*;

public class Main{

    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pzz(n);
    }

}*/

//---------------------------------------------------------------------------------------------------------------

// DISPLAY ARRAY ELEMENT USING RECURSION

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void displayArray(int arr[],int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
//        idx++;
        displayArray(arr,idx+1);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        displayArray(arr,0);
    }

}*/

//---------------------------------------------------------------------------------------------------------------

// REVERSE ARRAY USING RECURSION

/*package com.company;

import java.util.*;

public class Main{

    public static void reverseArray(int arr[],int idx){
        if(idx== arr.length){
            return;
        }
        reverseArray(arr,idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        reverseArray(arr,0);
    }
}*/

//---------------------------------------------------------------------------------------------------------------

// MAXIMUM OF ARRAY

/*package com.company;

import java.util.*;

public class Main{

    public static int maxOfArray(int[] arr,int idx,int max){
        if(idx==arr.length){
            return max;
        }

        if(arr[idx]>max){
            max=arr[idx];
        }

        int ans=maxOfArray(arr,idx+1,max);
        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(maxOfArray(arr,1,arr[0]));
    }
}*/

//--------------------------------------------------------------------------------------------------------------

// MAXIMUM OF ARRAY(METHOD-2)

/*package com.company;

import java.util.*;

public class Main{

    public static int maxOfArray(int arr[],int idx){
        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }

        int ans=maxOfArray(arr,idx+1);

        int max=Math.max(ans,arr[idx]);
        return max;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner((System.in));
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(maxOfArray(arr,0));;
    }
}*/

//---------------------------------------------------------------------------------------------------------

// TOWER OF HANOI

/*package com.company;

import java.util.Scanner;

public class Main{

                       //        source destination helper
    public static void toh(int n,int t1,int t2,int t3){

        if(n==0) return;

        toh(n-1,t1,t3,t2);

        System.out.println(t1+" ---> "+t2);

        toh(n-1,t3,t2,t1);
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int t1=scn.nextInt();
        int t2=scn.nextInt();
        int t3=scn.nextInt();

        toh(n,t1,t2,t3);
    }
}*/

//------------------------------------------------------------------------------------------------------------

// FIRST INDEX

/*package com.company;

import java.util.*;

public class Main{

    public static int firstIndex(int arr[],int x,int idx){

        if(idx== arr.length) return -1;

        if(arr[idx]==x) return idx;

        int ans=firstIndex(arr,x,idx+1);

        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();

        int fi=firstIndex(arr,x,0);
        System.out.print(fi);
    }
}*/

//------------------------------------------------------------------------------------------------------------

// LAST INDEX

/*package com.company;

import java.util.*;

public class Main{

    public static int lastIndex(int arr[],int x,int idx){

        if(idx==-1) return -1;

        if(arr[idx]==x) return idx;

        int ans=lastIndex(arr,x,idx-1);

        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();

        int li=lastIndex(arr,x,n-1);
        System.out.print(li);
    }
}*/

//--------------------------------------------------------------------------------------------------------------

// LAST INDEX (METHOD 2)

package com.company;

import java.util.Scanner;

public class Main{

    public static int lastIndex(int arr[],int x,int idx){
        if(arr.length==idx){
            return -1;
        }

        int f1=lastIndex(arr,x,idx+1);

        if(f1==-1){
            if(arr[idx]==x){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return f1;
        }

    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        int x=scn.nextInt();
        int li=lastIndex(arr,x,0);
        System.out.print(li);
    }
}






