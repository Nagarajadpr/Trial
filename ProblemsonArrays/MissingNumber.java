package ProblemsonArrays;
import java.util.*;  
import java.util.Arrays; 

public class MissingNumber {
//	static int MissingNumber(int arr[])
//    {
//        int n=arr.length;
//        int total = 1;
//        for (int i = 2; i <= (n + 1); i++) {
//            total += i;
//            total -= arr[i - 2];
//        }
//        return total;
//    }
// 
//    // Driver Code
//    public static void main(String[] args)
//    {
//        int[] arr = { 1, 2, 5, 3 };
//        System.out.println(MissingNumber(arr));
//    }
	
	
	
//
//    public static void main(String[] args) {
// 
//        int[] arr1={7,5,6,1,4,2};
//        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
//        int[] arr2={5,3,1,2};
//        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
// 
//    }
// 
//    public static int missingNumber(int[] arr)
//    {
//        int n=arr.length+1;
//        int sum=n*(n+1)/2;
//        int restSum=0;
//        for (int i = 0; i < arr.length; i++) {
//            restSum+=arr[i];
//        }
//        int missingNumber=sum-restSum;
//        return missingNumber;
//    }

    
    /*Java Program to find the missing element*/
    //Driver Code
       public static void main(String args[])   
       {  
           Scanner sc=new Scanner(System.in);

          int n;    //Declare array size
          System.out.println("Enter the total number of elements ");
          n=sc.nextInt();     //Initialize array size

          int arr[]=new int[n];   //Declare array
          System.out.println("Enter the elements of the array ");
          for(int i=0; i<n ;i++)     //Initialize array
          {
              arr[i]=sc.nextInt();
          }
          
          int sum=(n+1)*(n+2)/2;   //Calculate the expected sum of all the elements from 1 to n
          for(int i=0;i<n;i++)
          {
              sum=sum-arr[i]; //Subtract each element from the sum
          }
          System.out.println("Missing Element is "+sum);  //Print the missing element
       }
    
}
