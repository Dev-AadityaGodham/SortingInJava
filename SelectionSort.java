/******************************************************************************

                           Selection Sort

*******************************************************************************/

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
		//this is given array
		int arr[]={7,3,2,8,1};
		System.out.print("The given array is: ");
		for(int i=0;i<arr.length;i++){
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
}
