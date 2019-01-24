import java.util.Arrays;

/*
 * Binary search is a search algorithm that searches through an
 * array by a divide and conquer approach.It searches through a
 * sorted array by repeatedly dividing the search interval in
 * half.
 * 
 * Begin with an interval covering the whole array.
 * If the value of the search key is less than the item
 * in the middle of the interval, narrow the interval to 
 * the lower half. Otherwise narrow it to the upper half. 
 * Repeatedly check until the value is found or the interval 
 * is empty.
 * 
 * NB: The array elements must be in ascending order and that
 *  is why I am using java's Arrays.sort(arr) method which
 *  is similar to bubble sort.
 * 
 * 
 * */
public class BinarySearch {
	public static int key_index=-1;

	
	
	/*This is the begining of the binary search function*/
	public static int binarySearch(int arr[],int key){ 
		   int last=arr.length-1;
		   int first=0;
		   int mid = (first + last)/2; 
		   Arrays.sort(arr);
		   System.out.printf("\n\nOur newly sorted array is : %s", Arrays.toString(arr));
		   
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("\n\nElement is found at index: " + mid); 
		        key_index=mid;
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("\n\nElement is not found!");  
		   }  
		   
		   return key_index;
		 }  
		 /*This is the end of the binary search function*/
	
	
	
	
	
	     public static void main(String args[]){ 
			    //Try with different values 
		        int arr[] = {10,20,30,40,50,1,7};  
		        int key = 30;  
		          
		        int myKeyIndex=binarySearch(arr,key);
		        System.out.println("\n\nBinary search function returned: " + String.valueOf(myKeyIndex));
		        
		 }  
}
