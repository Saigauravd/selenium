package arrays;


	public class RemoveElementFromArray {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int elementToRemove = 4; // The element to be removed

	        int indexToRemove = -1;

	        // Find the index of the element to remove
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == elementToRemove) {
	                indexToRemove = i;
	                break;
	            }
	        }

	        if (indexToRemove != -1) {
	            // Shift elements to the left to overwrite the element to be removed
	            for (int i = indexToRemove; i < arr.length - 1; i++) {
	                arr[i] = arr[i + 1];
	            }

	            // Update the length of the array
	            int[] newArray = new int[arr.length - 1];
	            System.arraycopy(arr, 0, newArray, 0, arr.length - 1);
	            arr = newArray;
	        } else {
	            System.out.println("Element not found in the array.");
	        }

	        // Print the updated array
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	    }
	}



