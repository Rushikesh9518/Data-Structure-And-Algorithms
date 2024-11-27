package DSA;

public class SelectionSort {

	public static void selectionSort(int [] arr) {

		for(int i = 0;i<arr.length-1;i++) {

			int minIndex = i;
			for(int j =i+1;j<arr.length;j++) {

				if (arr[j] < arr[minIndex]) {

					minIndex = j ;

				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main (String[] args) {

		int[] arr = {34,45,23,57,21,9};

		selectionSort(arr);

		for (int x: arr) {

			System.out.println (x);
		}
	}
}


