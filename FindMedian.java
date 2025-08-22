import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merge = new ArrayList<>();
        //int maxLeng = Math.max(nums1.length, nums2.length);
        double median;
        for(int i = 0; i < nums1.length; i++){
            merge.add(nums1[i]);
        }

         for(int i = 0; i < nums2.length; i++){
            merge.add(nums2[i]);
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
        
    }
}
