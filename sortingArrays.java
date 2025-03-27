import java.util.Arrays;
class sortingArrays{
	public static void main(String args[]){
		int arr[] = {5,9,10,12,14,19,15,81,1,2};
		int n = arr.length;
		for(int i = 0; i < n-1 ;i++){
			for(int j = 0; j< n-i-1 ;j++){
				if(arr[j]>arr[j+1]){
					//Swap elements if they are in the wrong order
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting : " +Arrays.toString(arr));
	}
}