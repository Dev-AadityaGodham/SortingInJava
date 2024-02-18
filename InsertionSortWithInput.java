/******************************************************************************

                        Insertion Sort with input array

*******************************************************************************/
import java.util.*;
public class Main
{
    //this fnction use for printing the sorted array
    public static void SortedArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    //taking "size" as a inpute
	    System.out.println("Enter the Size of the array : ");
	    int size = sc.nextInt();
	    int arr[] = new int[size];
	    //loop to take array elements 
	    for(int i=0;i<size;i++){
	        System.out.println("Enter the"+i+"th index element : ");
	        arr[i]=sc.nextInt();
	    }
	    System.out.println("Array before sorting : ");
	    //loop to print user input array 
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]);
	    }
	    System.out.println();

		//loop start from 1st index becuse the 0th index considerd as sorted array in Insertion array
		for (int i=1;i<arr.length ;i++ ) {
		    int current = arr[i];
		    int j = i-1;
		    //we chaking that the jth element is grather that current means arr[i] or not
		    while(j>=0 && current < arr[j]){
		        arr[j+1]=arr[j];
		        j--;
		    }
		    //swap or placement
		    arr[j+1]=current;
		    
		}
		System.out.println("Array After sorting : ");
		SortedArray(arr);
	}
	
}
