import java.util.*;
public class CurrencyDenominations {
	

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the size of currency denominations: ");
	        int size = input.nextInt();

	        int[] denominations = new int[size];

	        System.out.println("Enter the currency denominations value:");
	        for (int i = 0; i < size; i++) {
	            denominations[i] = input.nextInt();
	        }

	        System.out.print("Enter the amount you want to pay: ");
	        int amount = input.nextInt();

	        Arrays.sort(denominations); // sorting in ascending order

	        System.out.println("Your payment approach in order to give min no of notes will be:");

	        for (int i = size - 1; i >= 0; i--) {
	            int count = 0;
	            while (amount >= denominations[i]) {
	                amount -= denominations[i];
	                count++;
	            }
	            if (count > 0) {
	                System.out.println(denominations[i] + ":" + count);
	            }
	        }
	    }
	}
