package arrays;

public class FrequencyofNumber {


	

		public static void main (String[] args) {
			int[] arr = {1,2,4,3,2,5,7,5,};
			int size = arr.length;
			countFrequency(arr, size);
		}

		static void countFrequency(int[] array, int size)
		{

			for (int i = 0; i < size; i++){
				int flag = 0;
				int count = 0;

				for (int j = i+1; j < size; j++){
					if (array[i] == array[j]){
						flag = 1;
						//break;
					}
				}

				// The continue keyword is used to end the current iteration 
				// in a for loop (or a while loop), and continues to the next iteration
				if (flag == 1)
					continue;

				for (int j = 0;j<=i;j++){
					if (array[i] == array[j])
						count++;
				}
				System.out.println(array[i]+": "+count);
			}
		}
	}

