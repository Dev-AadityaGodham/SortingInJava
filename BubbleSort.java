/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
public static void SortedArray(int arr[]){
        System.out.print("The sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
	public static void main(String[] args) {
		
		//declaration of array
		int arr[] = {7,8,3,1,2};
		
		System.out.print("The given array is: ");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]);
		}
		System.out.println();
		
		//for loop for n-1 loop
		for(int i=0;i<arr.length-1;i++){
		    
		    //this second loop for after chaking the number dont need to chake the last number
		    
		    for(int j=0;j<arr.length-i-1;j++){
		        
		        //if condition to chake the current number is grater than next number or not
		        
		        if(arr[j] > arr[j+1]){
		            //swap condition if arr[j]>arr[j+1]
		            
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		        
		    }
		}
		SortedArray(arr);
		
	}
}
