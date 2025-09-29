public class MaxArea {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;

        int area = 0;
        while(i < j){

            area = Math.max(area, (j-i) * Math.min(height[i] , height[j]));

            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return area;
    }
}
