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

//----------------------------------------------------------------------------------------------------------------

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

//--------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------

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

//--------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------

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

//--------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------

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

//--------------------------------------------------------------------------------------------------------------

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

//--------------------------------------------------------------------------------------------------------------

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

/*package com.company;

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
}*/

//----------------------------------------------------------------------------------------------------------

// ANY INDEX

/*package com.company;

import java.util.Scanner;

public class Main {

    public static int[] anyIndex(int arr[],int x,int idx,int size){
        if(arr.length==idx){
            int[] outputArr=new int[size];
            return outputArr;
        }

        if(arr[idx]==x){
            size=size+1;
        }

        int ans[]=anyIndex(arr,x,idx+1,size);

        if(arr[idx]==x){
            ans[size-1]=idx;
        }

        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();

        int ai[]=anyIndex(arr,x,0,0);
        for(int i=0;i<ai.length;i++){
            System.out.print(ai[i]+" ");
        }
    }
}*/

//--------------------------------------------------------------------------------------------------------

// SUB-SEQUENCE OF STRING

/*package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static ArrayList<String> subSequence(String str){

        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> listStore=subSequence(ros);

        int length=listStore.size();

        // adding
        for(int i=0;i<length;i++){
            listStore.add(ch+listStore.get(i));
        }

        return listStore;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        ArrayList<String> subseq=subSequence(str);
        System.out.println(subseq);
    }
}*/

//----------------------------------------------------------------------------------------------------------------

// MAZE PATH

/*package com.company;

import java.util.*;

public class Main{

    public static ArrayList<String> mazePath(int row , int col){

        if(row==0 || col==0){
            ArrayList<String> base=new ArrayList<String>();
            return base;
        }
        if(row==1 && col==1){
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> list1=mazePath(row,col-1);
        ArrayList<String> list2=mazePath(row-1,col);

        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<list1.size();i++){
            ans.add(list1.get(i)+"h");
        }
        for(int i=0;i<list2.size();i++){
            ans.add(list2.get(i)+"v");
        }

        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n= scn.nextInt();
        ArrayList<String> mp=mazePath(m,n);
        System.out.println(mp);
    }
}*/

//---------------------------------------------------------------------------------------------------------------

// STAIRS POSSIBLE WAYS
// PRINT STEP NUMBER AS ANSWER

/*package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static ArrayList<String> stairs(int n){
        if(n==0){
            ArrayList<String> base=new ArrayList<String>();
//            String val=Integer.toString(n);
//            base.add(val);
            base.add("0");
            return base;
        }
        if(n<0){
            ArrayList<String> base=new ArrayList<String>();
            return base;
        }

        ArrayList<String> list1=stairs(n-1);
        ArrayList<String> list2=stairs(n-2);
        ArrayList<String> list3=stairs(n-3);

        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<list1.size();i++){
            String val=Integer.toString(n);
            ans.add(list1.get(i)+val);
        }
        for(int i=0;i<list2.size();i++){
            String val=Integer.toString(n);
            ans.add(list2.get(i)+val);
        }
        for(int i=0;i<list3.size();i++){
            String val=Integer.toString(n);
            ans.add(list3.get(i)+val);
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        ArrayList<String> li=stairs(n);
        System.out.println(li);
    }
}*/

//-------------------------------------------------------------------------------------------------------------

// GET KPC

/*package com.company;

import java.util.*;

public class Main{

    public static ArrayList<String> getKPC(String[] arr, String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> list=getKPC(arr,ros);

        int val=Character.getNumericValue(ch);
        String store=String.valueOf(arr[val]);

        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<store.length();i++){
            for(int j=0;j< list.size();j++){
                ans.add(store.charAt(i)+list.get(j));
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String[] arr={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        ArrayList<String> kpc=getKPC(arr,str);
//        System.out.print(kpc);
        for(int i=0;i< kpc.size();i++){
            System.out.println(kpc.get(i));
        }

    }
}*/

//-------------------------------------------------------------------------------------------------------------

// RECURSION ON THE WAY
// PRINT SUB-STRINGS

/*package com.company;

import java.util.*;

public class Main{

    public static void printSS(String str,String asf){
        if(str.length()==0){
            if(asf==""){
                asf="-";
            }
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        // Include character
        printSS(ros,asf+ch);

        //Exclude character
        printSS(ros,asf);
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        printSS(str,"");
    }
}*/

//------------------------------------------------------------------------------------------------------------

// RECURSION ON THE WAY
// MAZE PATH

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void mazePath(int row,int col,int dr,int dc,String asf){
        if(row==dr || col==dc){
            return;
        }

        if(row==dr-1 && col==dc-1){
            System.out.println(asf);
        }

        mazePath(row,col+1,dr,dc,asf+"h");

        mazePath(row+1,col,dr,dc,asf+"v");
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col= scn.nextInt();;

        mazePath(0,0,row,col,"");
    }
}*/

//----------------------------------------------------------------------------------------------------------------

// MINIMUM PATH IN 2D ARRAY

/*package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static ArrayList<Integer> minimumPath(int arr[][],int row,int col){
        if(row<0 || col<0){
            ArrayList<Integer> base=new ArrayList<Integer>();
            return base;
        }

        if(row==0 && col==0){
            ArrayList<Integer> base=new ArrayList<Integer>();
            base.add(arr[0][0]);
            return base;
        }

        ArrayList<Integer> list1=minimumPath(arr,row,col-1);
        ArrayList<Integer> list2=minimumPath(arr,row-1,col);

        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<list1.size();i++){
            ans.add(list1.get(i)+arr[row][col]);
        }
        for(int i=0;i<list2.size();i++){
            ans.add(list2.get(i)+arr[row][col]);
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        int[][] arr=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        ArrayList<Integer> list=minimumPath(arr,row-1,col-1);
        System.out.println(list);
        int min=list.get(0);
        for(int i=0;i< list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println(min);
    }

}*/

//--------------------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.*;

public class Main{

    public static ArrayList<Integer> reverse(ArrayList arr,int start,int end){

        int i=start;
        int val=(start+end)/2;
        while(i<val){

            ArrayList<Integer> base=new ArrayList<>();
            base.add(0,(Integer) arr.get(i));
            arr.set(i,arr.get(end));
            arr.set(end,base.get(0));
        }

        return arr;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){

            int j=scn.nextInt();
            arr.add(i,j);
        }

        int m=scn.nextInt();
        ArrayList<ArrayList<Integer>> oprations = new ArrayList<>();
       for(int i=0;i<m;i++){
           for(int j=0;j<2;j++){
               int element=scn.nextInt();
               oprations.add(new ArrayList<Integer>(Arrays.asList(element)));
           }
       }

        for(int i=0;i<m;i++){
            arr=reverse(arr,oprations.get(i).get(0),oprations.get(i).get(1));
        }
        System.out.println(arr);
    }

}*/

//---------------------------------------------------------------------------------------------------------------

// amazon (reverse in given range index)

/*package com.company;

import java.util.*;

public class Main{

    public static int[] reverse(int[] arr,int start,int end){
        int i=start;
        int val=(start+end)/2;
        int j=0;
        while(i<=val){
            int temp=arr[i];
            arr[i]=arr[end-j];
            arr[end-j]=temp;
            i++;
            j++;
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int m= scn.nextInt();
        int[][] operations=new int[m][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                operations[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<6;i++){
            arr=reverse(arr,operations[i][0],operations[i][1]);
            for(int j=0;j<n;j++){
                    System.out.print(arr[j]+" ");
                }
            System.out.println();
            }
        }

}*/

//----------------------------------------------------------------------------------------------------------------

// REDUCE ARRAY

/*package com.company;

import java.util.*;

public class Main{

    public static int reduceArray(int arr[],int k,int count){

        if(k==0){
            return count;
        }

        int store=0;
        int max=arr[0];
        for(int i=0;i<k;i++){
            if(arr[i]>max){
                max=arr[i];
                store=i;
            }
        }

        return reduceArray(arr,store,count+1);
//        int ans=reduceArray(arr,store,count+1);
//
//        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int ra=reduceArray(arr,n,0);
        System.out.println(ra);
    }

}*/

//-----------------------------------------------------------------------------------------------------------------

// PERMUTATIONS OF STRING

/*package com.company;

import java.util.*;

public class Main{

    public static ArrayList<String> permutations(String str){

        if(str.length()==0){
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);

            ArrayList<String> list=permutations(ros);

            for(int j=0;j<list.size();j++){
                ans.add(list.get(j)+ch);
            }

        }

        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        System.out.println(permutations(str)+"");
    }

}*/

//-----------------------------------------------------------------------------------------------------------------

// PRINTING OF GOOD STRINGS

/*package com.company;

import java.util.*;

public class Main{

    public static ArrayList<String> goodStrings(int n,String str1,String str2){
        if(n==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> list=goodStrings(n-1,str1,str2);

        ArrayList<String> ans=new ArrayList<>();
        if(n%2==0){
            for(int i=0;i<str2.length();i++){
                for(int j=0;j<list.size();j++){
                    ans.add(list.get(j)+str2.charAt(i));
                }
            }
        }
        else{
            for(int i=0;i<str1.length();i++){
                for(int j=0;j< list.size();j++){
                    ans.add(list.get(j)+str1.charAt(i));
                }
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        ArrayList<String> gs=goodStrings(n,"02468","2357");

        System.out.println(gs);
        long gsn=gs.size();
        System.out.println("Total Good Strings : "+gsn);
    }
}*/

//-----------------------------------------------------------------------------------------------------------------

// PERMUTATIONS OF STRING (RECURSION ON THE WAY)

/*package com.company;

import java.util.*;

public class Main{

    public static void permutations(String str,String asf){

        if(str.length()==0){
            System.out.println(asf);
        }

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);

            permutations(ros,asf+ch);
        }
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        permutations(str,"");
    }
}*/

//-----------------------------------------------------------------------------------------------------------------

// ENCODING

/*package com.company;

import java.util.*;

public class Main{

    public static ArrayList<String> encoding(String str,String inputStr){

        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(str.charAt(0)=='0'){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }

        ArrayList<String> ans=new ArrayList<>();
        int n=0;
        if(str.length()>1){
            if(Integer.parseInt(str.substring(0,2))<27){
                n=2;
            }
            else{
                n=1;
            }
        }
        else{
            n=1;
        }

        for(int i=0;i<n;i++){
            String str2=str.substring(0,i+1);
            String ros=str.substring(i+1);

            ArrayList<String> list=encoding(ros,inputStr);

            int idx=Integer.parseInt(str2);
            for(int j=0;j<list.size();j++){
//                ans.add(inputStr.charAt(idx)+list.get(j));
                ans.add((char)((idx-1)+'a')+list.get(j));
            }
        }

        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String inputStr=" abcdefghijklmnopqrstuvwxyz";

        ArrayList<String> en=encoding(str,inputStr);
        System.out.println(en);
    }
}*/

//---------------------------------------------------------------------------------------------------------------

// ENCODING (RECURSION ON THE WAY)

/*package com.company;

import java.util.*;

public class Main{

    public static void encoding(String str,String inputStr,String asf){

        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        if(str.charAt(0)=='0'){
            return;
        }

        int n=0;
        if(str.length()>1){
            if(Integer.parseInt(str.substring(0,2))<27){
                n=2;
            }
            else{
                n=1;
            }
        }
        else{
            n=1;
        }

        for(int i=0;i<n;i++){
            String str2=str.substring(0,i+1);
            String ros=str.substring(i+1);
            int idx=Integer.parseInt(str2);

            encoding(ros,inputStr,asf+inputStr.charAt(idx));
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String inputStr=" abcdefghijklmnopqrstuvwxyz";

        encoding(str,inputStr,"");
    }
}*/

//--------------------------------------------------------------------------------------------------------------

// RECURSION AND BACKTRACKING
// FLOOD FILL (ALL POSSIBLE PATHS)

/*package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static ArrayList<String> floodfill(int[][] maze,int sr,int sc,boolean[][] check){
        if(sr==maze.length-1 && sc==maze[0].length-1){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length ||check[sr][sc]==true){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }

        check[sr][sc]=true;

        ArrayList<String> list1=floodfill(maze,sr-1,sc,check);  // top
        ArrayList<String> list2=floodfill(maze,sr,sc-1,check);  // left
        ArrayList<String> list3=floodfill(maze,sr+1,sc,check);  // down
        ArrayList<String> list4=floodfill(maze,sr,sc+1,check);  // right

        check[sr][sc]=false;
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            ans.add('t'+list1.get(i));
        }
        for(int i=0;i<list2.size();i++){
            ans.add('l'+list2.get(i));
        }
        for(int i=0;i<list3.size();i++){
            ans.add('d'+list3.get(i));
        }
        for(int i=0;i<list4.size();i++){
            ans.add('r'+list4.get(i));
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int[][] maze=new int[m][n];
        boolean[][] check=new boolean[m][n];

        ArrayList<String> ff=floodfill(maze,0,0,check);
//        System.out.println(ff);
        for(int i=0;i< ff.size();i++){
            System.out.println(ff.get(i));
        }
    }
}*/

//------------------------------------------------------------------------------------------------------------

// RECURSION AND BACKTRACKING
// FLOOD FILL (WITH OBSTACLE)

/*package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static ArrayList<String> floodfill(int[][] maze,int sr,int sc,boolean[][] check){
        if(sr==maze.length-1 && sc==maze[0].length-1){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length || maze[sr][sc]==1 ||check[sr][sc]==true){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }

        check[sr][sc]=true;

        ArrayList<String> list1=floodfill(maze,sr-1,sc,check);  // top
        ArrayList<String> list2=floodfill(maze,sr,sc-1,check);  // left
        ArrayList<String> list3=floodfill(maze,sr+1,sc,check);  // down
        ArrayList<String> list4=floodfill(maze,sr,sc+1,check);  // right

        check[sr][sc]=false;
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            ans.add('t'+list1.get(i));
        }
        for(int i=0;i<list2.size();i++){
            ans.add('l'+list2.get(i));
        }
        for(int i=0;i<list3.size();i++){
            ans.add('d'+list3.get(i));
        }
        for(int i=0;i<list4.size();i++){
            ans.add('r'+list4.get(i));
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int[][] maze=new int[m][n];
        boolean[][] check=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                maze[i][j]=scn.nextInt();
            }
        }

        ArrayList<String> ff=floodfill(maze,0,0,check);
//        System.out.println(ff);
        for(int i=0;i< ff.size();i++){
            System.out.println(ff.get(i));
        }
    }

}*/

//-----------------------------------------------------------------------------------------------------------

// BUBBLE SORT

/*package com.company;

import java.util.*;

public class Main{

    public static int[] bubbleSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int[] bs=bubbleSort(arr);
        for(int i=0;i<bs.length;i++){
            System.out.print(bs[i]+" ");
        }
    }
}*/

//-----------------------------------------------------------------------------------------------------------

// N QUEENS

/*package com.company;

import java.util.*;

public class Main{

    public static ArrayList<String> NQueens(boolean[][] chess,int row){

        if(row==chess.length){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans=new ArrayList<>();
        for(int col=0;col<chess.length;col++){

            if(isSafe(chess,row,col)==true){

                chess[row][col]=true;

                ArrayList<String> list=NQueens(chess,row+1);

                chess[row][col]=false;

                for(int i=0;i<list.size();i++){
                    String s1=Integer.toString(row);
                    String s2=Integer.toString(col);
                    ans.add(s1+"-"+s2+"  "+list.get(i));
                }
            }
        }
        return ans;
    }

    public static boolean isSafe(boolean[][] chess,int row,int col){

        for(int i=row-1;i>=0;i--){
            if(chess[i][col]==true){
                return false;
            }
        }

        int i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(chess[i][j]==true){
                return false;
            }
            i--;
            j--;
        }

        i=row-1;
        j=col+1;
        while(i>=0 && j<chess.length){
            if(chess[i][j]==true){
                return false;
            }
            i--;
            j++;
        }

        return true;
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] chess = new boolean[n][n];

        ArrayList<String> nq=NQueens(chess,0);
        for(int i=0;i< nq.size();i++){
            System.out.println(nq.get(i));
        }
        System.out.println(nq.size());
    }
}*/

//-----------------------------------------------------------------------------------------------------------

import java.util.*;

public class Main{

    public static ArrayList<String> sudoku(int arr[][],int row,int col){

        if(row==9 && col==8){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(row==9){
            row=0;
            col=col+1;
        }

        ArrayList<String> ans=new ArrayList<>();
        if(arr[row][col]!=0){
            ArrayList<String> list=sudoku(arr,row+1,col);
            String s1=Integer.toString(arr[row][col]);
            if(list.size()>0){
                ans.add(s1+list.get(0));
            }
        }
        else{
            for(int digit=1;digit<=9;digit++){
                if(isSafe(arr,row,col,digit)==true){

                    ArrayList<String> list=sudoku(arr,row+1,col);

                    String s1=Integer.toString(digit);
                    if(list.size()>0){
                        ans.add(s1+list.get(0));
                    }
                }
            }
        }

        return ans;
    }


    public static boolean isSafe(int[][] arr,int row,int col,int digit){
        // down
        for(int i=row+1;i<arr.length;i++){
            if(arr[i][col]==digit){
                return false;
            }
        }
        // left
        for(int i=col+1;i< arr.length;i++){
            if(arr[row][i]==digit){
                return false;
            }
        }
        // right
        for(int i=0;i<col;i++){
            if(arr[row][i]==digit){
                return false;
            }
        }
        // up
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]==digit){
                return false;
            }
        }
        // all
        int val1=row/3;
        int val2=col/3;
        for(int i=val1*3;i<=(val1*3)+2;i++){
            for(int j=val2*3;j<=(val2*3)+2;j++){
                if(arr[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        int arr[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        ArrayList<String> sdk=sudoku(arr,0,0);
        System.out.println(sdk);
    }
}

/*import java.util.*;

public class Main{

    public static void sudoku(int arr[][],int row,int col,String asf){

        if(row==9 && col==8){
            System.out.println(asf);
            return;
        }
        if(row==9){
            row=0;
            col=col+1;
        }

        if(arr[row][col]!=0){
            sudoku(arr,row+1,col,asf+arr[row][col]);
        }
        else{
            for(int digit=1;digit<=9;digit++){
                if(isSafe(arr,row,col,digit)==true){
                    sudoku(arr,row+1,col,asf+digit);
                }
            }
        }

    }

    public static boolean isSafe(int[][] arr,int row,int col,int digit){
        // down
        for(int i=row+1;i<9;i++){
            if(arr[i][col]==digit){
                return false;
            }
        }
        // right
        for(int i=col+1;i<9;i++){
            if(arr[row][i]==digit){
                return false;
            }
        }
        // left
        for(int i=0;i<col;i++){
            if(arr[row][i]==digit){
                return false;
            }
        }
        // up
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]==digit){
                return false;
            }
        }
        // all
        int val1=row/3;
        int val2=col/3;
        for(int i=val1*3;i<=(val1*3)+2;i++){
            for(int j=val2*3;j<=(val2*3)+2;j++){
                if(arr[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int arr[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
                    {5, 2, 0, 0, 0, 0, 0, 0, 0},
                    {0, 8, 7, 0, 0, 0, 0, 3, 1},
                    {0, 0, 3, 0, 1, 0, 0, 8, 0},
                    {9, 0, 0, 8, 6, 3, 0, 0, 5},
                    {0, 5, 0, 0, 9, 0, 6, 0, 0},
                    {1, 3, 0, 0, 0, 0, 2, 5, 0},
                    {0, 0, 0, 0, 0, 0, 0, 7, 4},
                    {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        sudoku(arr,0,0,"");
    }
}*/




