package ProblemsonArrays;

public class LargestNumberOfanArray {
	public static void main(String[] args) {  
		  
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
	
//	Smallest number of an array
//	  public static void main(String[] args) {  
//		  
//	        //Initialize array  
//	        int [] arr = new int [] {25, 11, 7, 75, 56};  
//	        //Initialize min with first element of array.  
//	        int min = arr[0];  
//	        //Loop through the array  
//	        for (int i = 0; i < arr.length; i++) {  
//	            //Compare elements of array with min  
//	           if(arr[i] <min)  
//	               min = arr[i];  
//	        }  
//	        System.out.println("Smallest element present in given array: " + min);  
//	    } 
}
