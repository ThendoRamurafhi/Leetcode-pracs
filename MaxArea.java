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

    public static void main(String[] args) {
        MaxArea solution = new MaxArea();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // sample input
        int result = solution.maxArea(height);

        System.out.println("Maximum area: " + result);
    }
}
