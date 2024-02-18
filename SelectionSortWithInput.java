/******************************************************************************

                     Selection Sort with Input Elements

*******************************************************************************/
import java.util.*;
public class Main

{
    //this is SortedArray function to print elements array
    public static void SortedArray(int arr[]){
        System.out.print("The Sorted arry is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    //declare the size of Array
	    System.out.println("Enter The Size Of the Array: ");
	    int size = sc.nextInt();
		int arr[]=new int[size];
		//loop for input elements
        for(int i=0;i<size;i++){
            System.out.println("Enter The "+i+"th Index element");
            arr[i]=sc.nextInt();
        }
        //loop for printing the array elements taken from the user 
		System.out.print("The given array is: ");
		for(int i=0;i<size;i++){
		    System.out.print(arr[i]);
		}
		System.out.println();
		
		//outer loop for smallest Number
		for(int i =0;i<arr.length-1;i++){
		    int smallest =i;
		    //inner loop to chake the next number is smaller tha current smallers number or not
		    for(int j = i+1;j<arr.length;j++){
		        if(arr[smallest]>arr[j]){
		            smallest = j;
		        }
		    }
		    //swap condition
		    	int temp = arr[smallest];
            		arr[smallest]=arr[i];
           		arr[i]=temp;
		}
		SortedArray(arr);
	}
}//output : 12378
