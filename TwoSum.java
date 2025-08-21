import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get array size
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        // Get array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        // Get target
        System.out.print("Enter target sum: ");
        int target = scan.nextInt();

        // Solve
        TwoSum solver = new TwoSum();
        int[] result = solver.twoSum(nums, target);

        // Output
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        }

        scan.close();
    }
}
