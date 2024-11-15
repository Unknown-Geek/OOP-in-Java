import java.util.Scanner;

public class Quick_Sort {
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	int[] quickSort(int arr[], int low, int high) {
		int pi = 0;
		if (low < high) {
			pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
		return arr;
	}

	public static void main(String args[]) {
		int n, key, low, high;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		low = 0;
		high = n - 1;
		Quick_Sort obj = new Quick_Sort();
		arr = obj.quickSort(arr, low, high);
		System.out.print("Sorted Array : ");
		for(int i = 0; i < n ; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}