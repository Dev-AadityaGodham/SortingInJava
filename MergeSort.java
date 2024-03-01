/******************************************************************************
Merge Sort is a popular and efficient sorting algorithm that follows the divide-and-conquer strategy. It works as follows:
Divide: The unsorted array is divided recursively into two halves until each sub-array contains only one element. This is done until the base case is reached, i.e., when there's only one element in each sub-array.
Conquer: After the division, the merge step comes into play. In this step, the divided sub-arrays are merged back together in a sorted order. This merging process starts with the smallest units (single elements) and progressively combines them into larger sorted arrays.
Merge: During the merge step, two sorted sub-arrays are combined into a single sorted array. This process involves comparing the elements of the two sub-arrays and placing them in the correct order.
Repeat: Steps 1-3 are repeated recursively until all sub-arrays are merged back together into a single sorted array.
*******************************************************************************/

public class Main

{
    public static void conquer(int arr[],int si,int mid,int ei){
        //new array to track or sart the array elements after sorting we will copy elements of merge array into our original array
        int merge[]= new int[ei-si+1];
        //track th firs array (firat divided array)
        int index1=si;
        //track th Second array (second divided array)
        int index2=mid+1;
        //to track marge array
        int x=0;
        
        while(index1<=mid && index2 <= ei){
            //jar index1 mnje si jo ki index2 peksha kami asl tr new array mnje merge array tyat oth position la index1 thla ji value ahe ti tak
            //ani ts nsl tr merge oth index la index2 hi value tak ani i++ kr ani x++
            if(arr[index1]<=arr[index2]){
                merge[x]=arr[index1];
                x++;
                index1++;
            }else{
                merge[x]=arr[index2];
                x++;
                index2++;
            }
        }
        while(index1 <= mid){
            merge[x]=arr[index1];
            x++;
            index1++;
        }
        while(index2 <= ei){
            merge[x]=arr[index2];
            x++;
            index2++;
        }
        
        //for coping the elements of merge array into the original array
        for(int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        
        //base condition
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        
        // in merge sort you need to devide the array into multiple sub parts
        
        //for the first array
        divide(arr,si,mid);
        
        // forthe second half
        divide(arr,mid+1,ei);
        
        conquer(arr,si,mid,ei);
        
    }
	public static void main(String[] args) {
		int[] arr = {6,3,9,5,2,8};
		int n = arr.length;
		divide(arr,0,n-1);
		//print array
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]);
		}
	}
}
// output 235689
