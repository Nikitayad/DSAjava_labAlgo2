import java.util.Scanner;
public class Targetdeterminator {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of transaction array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved");
        int numTargets = sc.nextInt();

        for (int i = 0; i < numTargets; i++) {
            System.out.println("Enter the value of target");
            int target = sc.nextInt();

            int sum = 0;
            int numTransactions = 0;
            boolean targetAchieved = false;

            for (int j = 0; j < n; j++) {
                sum += arr[j];
                numTransactions++;

                if (sum >= target) {
                    targetAchieved = true;
                    break;
                }
            }

            if (targetAchieved) {
                System.out.println("Target achieved after " + numTransactions + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
        }

        sc.close();
	}
}

