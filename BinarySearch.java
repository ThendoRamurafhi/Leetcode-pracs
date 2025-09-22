public class BinarySearch {
    public static int binarySearch(int[] arr, int lo, int hi, int x){

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == x) return mid;
            if(arr[mid] < x) lo = mid + 1;
            else hi = mid - 1;
            
        }return-1;
    }
}
