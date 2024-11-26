package DSA;

public class LinearSearch{


	public static void main(String [] args) {

		int [] arr = {3,46,76,4,89,7,27};

		System.out.println(linearSearch(arr,4));

		System.out.println(linearSearch(arr,78));


	}

	public static int linearSearch(int[] arr,int x) {

		for(int i =0;i<arr.length;i++) {
			if(x==arr[i]) {
				System.out.println ("Element Found");
				return i;
			}

		}
		System.out.println ("Element Not Found");
		return -1;
	
	}
}



