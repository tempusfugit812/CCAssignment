//refer from Cracking the coding interview
public class Solution03 {

	public static void main(String[] args) {

		int arr[] = { 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14 };
		int target = 5;

		System.out.println(searchRA(arr, target));

	}

	public static int searchRA(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (target == arr[mid]) {
				return mid;

			}
			if (arr[low] <= arr[mid]) {
				if (arr[low] <= target && target < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (arr[mid] < target && target <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return -1;
	}

}
