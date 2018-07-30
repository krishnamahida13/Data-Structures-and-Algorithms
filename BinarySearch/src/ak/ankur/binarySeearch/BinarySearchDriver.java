package ak.ankur.binarySeearch;

public class BinarySearchDriver {

	public static void main(String[] args) {
		
		
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = {2,5,8,10,15,20,45,50,32};
		
		int n = arr.length;
		
		int x = 54; 
		int result = binarySearch.binarySearch(arr, x);
		
		if(result ==-1) {
			
			System.out.println("The given number is not in array");
		}
		else {
			
			System.out.println("The given is found at index"+ " " + result);
		}
		

	}

}
