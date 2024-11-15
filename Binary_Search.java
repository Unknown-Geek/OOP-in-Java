import java.util.Scanner;

public class Binary_Search {
	void binarySearch(int arr[], int key, int len) {
		int flag = -1;
		int low = 0, high = len - 1;
		int mid = (low + high) / 2;
		while(low <= high) {
			mid = (low + high) / 2;
			if (key == arr[mid]) {
				flag = mid;
				System.out.println("Element found at " + mid);
				break;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		if (flag == -1) {
			System.out.println("Element not found");
		}
	}

	public static void main(String args[]) {
		int n, key;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array : ");

		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Binary_Search obj = new Binary_Search();
		System.out.print("Enter the element to search : ");
		key = sc.nextInt();
		obj.binarySearch(arr, key, n);
	}
}