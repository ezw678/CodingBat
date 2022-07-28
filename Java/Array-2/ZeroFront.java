// Return an array that contains the exact same numbers as the given array, but rearranged
// so that all the zeros are grouped at the start of the array. The order of the non-zero
// numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return
// the given array or make a new array.

import java.util.Arrays;

public class ZeroFront {

	public static void main(String[] args) {
		int [] arr = {1, 0, 0, 1};

		System.out.println(Arrays.toString(zeroFront(arr)));
		// output: [0, 0, 1, 1]
	}

	public static int[] zeroFront(int[] nums) {
		Arrays.sort(nums);

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				index = i;
				break;
			}
		}

		if (index != 0) {
			int [] arr = new int [nums.length];
			for (int i = 0; i < nums.length - index; i++) {
				arr[i] = nums[i + index];
			}
			for (int i = 0; i < index; i++) {
				arr[i + nums.length - index] = nums[i];
			}
			return arr;
		}

		return nums;
	}

}

