package arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8,9}; 
        int n = arr.length + 1; 
        int expectedSum = (n * (n + 1)) / 2; 
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num; 
           
        }
        
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}

// Here the expectedSum is taking avg of length array mean (7*8)/2
//It give the number then adds all numbers in an array and subtracting from avg

