/******************************************************************************

                        Insertion Sort

*******************************************************************************/

public class Main
{
    public static void SortedArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
	public static void main(String[] args) {
		int arr[]={7,8,3,1,2};
		//loop start from 1st index becuse the 0th index considerd as sorted array in Insertion array
		for (int i=1;i<arr.length ;i++ ) {
		    int current = arr[i];
		    int j = i-1;
		    //we chaking that the jth element is grather tha current mens arr[i] or not
		    while(j>=0 && current < arr[j]){
		        arr[j+1]=arr[j];
		        j--;
		    }
		    //swap or placement
		    arr[j+1]=current;
		    
		}
		SortedArray(arr);
	}
	
}//output : 12378
