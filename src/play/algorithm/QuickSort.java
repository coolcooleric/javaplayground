package play.algorithm;
import java.util.Arrays;

public class QuickSort {
	static void quickSort(int[] arr, int p, int r){
		if(p < r){
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}
	
	static int partition(int[] arr, int p, int r){
		int indexCounter = p - 1;
		
		for(int i = p; i < r; i++){
			if(arr[i] <= arr[r]){
				swap(arr, ++indexCounter, i);
			}
		}
		swap(arr, ++indexCounter, r);
		return indexCounter;
	}
	
	static void swap(int[] arr, int i1, int i2){
		if(i1 != i2){
			arr[i1] ^= arr[i2];
			arr[i2] ^= arr[i1];
			arr[i1] ^= arr[i2];
		}
	}
	
	static void test(int[] arr){
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num1 = {2, 9, 6, 1, 8, 3, 4, 6}; 
		int[] num2 = {3};
		int[] num3 = {5,5,5};
		int[] num4 = {9, 8, 7, 6, 5, 4};
		int[] num5 = {9, 8, 7, 10, 2, 10};
		
		test(num1);
		test(num2);
		test(num3);
		test(num4);
		test(num5);
	}
}
