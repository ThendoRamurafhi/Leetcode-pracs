/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merge = new ArrayList<>();// change arrlist to int[] merge = new int[maxleng]
        //int maxLeng = Math.max(nums1.length, nums2.length);
        double median;
        for(int i = 0; i < nums1.length; i++){
            merge.add(nums1[i]);// merge = int[i];
        }

         for(int i = 0; i < nums2.length; i++){
            merge.add(nums2[i]); // merge = int[i];
        }

        Collections.sort(merge);
        
        int size = merge.size();
            if(size % 2 != 0){
                median = merge.get(size/2);
            }
            else{
                median = (merge.get(size/2) + merge.get((size/2)-1))/2.0;
            }

        return median;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FindMedian fm = new FindMedian();

        // Read first array
        System.out.print("Enter size of first array: ");
        int n1 = scan.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter " + n1 + " integers:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scan.nextInt();
        }

        // Read second array
        System.out.print("Enter size of second array: ");
        int n2 = scan.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter " + n2 + " integers:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scan.nextInt();
        }

        // Find and print median
        double result = fm.findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + result);

        scan.close();
    }
}
