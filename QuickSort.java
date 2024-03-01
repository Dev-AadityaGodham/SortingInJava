/******************************************************************************
Quick Sort is another efficient sorting algorithm that also follows the divide-and-conquer strategy. It works as follows:
Partitioning: The algorithm selects a pivot element from the array. The pivot can be chosen in various ways, but commonly it's the last element in the array. 
The array is then partitioned into two sub-arrays: elements less than the pivot and elements greater than the pivot.
Recursion: After partitioning, the algorithm recursively sorts the sub-arrays created by the partitioning step. This recursion continues until the base case is reached, which is when a sub-array has zero or one elements.
Combine: As the recursion unwinds, the sorted sub-arrays are combined back together.
*******************************************************************************/

public class Main

{
    public static int partition(int arr[],int low , int high){
        int pivot = arr[high];
        int i =low-1;
        
        //if jthe element is smaller tha pivot then sawap the positions
        for (int j=low;j<high ;j++ ){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        } 
        // for changing the pivot
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void QuickSort(int arr[],int low,int high){
        //QuickSort works on pivot and partition rule
        //in this pivot is the last index of ht array 
        // low means starting index and high means lrgest index
        
        if(low<high){
            // index of pivot is get decided by partition function which is ind type and return the pivotIndex
            int pivotIndex = partition(arr,low,high);
            QuickSort(arr,low,pivotIndex-1);
            QuickSort(arr,pivotIndex+1,high);
        }
    }
	public static void main(String[] args) {
		int[]arr={6,3,9,5,2,8};
		int n=arr.length;
		QuickSort(arr,0,n-1);
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]);
		}
	}
}
// output 235689

