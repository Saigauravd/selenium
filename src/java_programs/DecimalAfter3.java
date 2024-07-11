package java_programs;

public class DecimalAfter3 {
	 public static void main(String[] args) {
	        String phoneNumber = "9898785475";
	        
	        // Using StringBuilder to insert dots at specific positions
	        StringBuilder formattedNumber = new StringBuilder(phoneNumber);
	        formattedNumber.insert(3, '.');
	        formattedNumber.insert(7, '.');
	     //   formattedNumber.reverse();
	        System.out.println("Formatted Phone Number: " + formattedNumber);
	    }

}
