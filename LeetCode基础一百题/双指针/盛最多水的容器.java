package 双指针;

class Solution {
    public int maxArea(int[] height) {
        int point1=0;
        int point2=height.length-1;
        int max=0;
        while(point1<point2){
            int s=(point2-point1)*Math.min(height[point1],height[point2]);
            if(height[point1]<height[point2]){
                point1++;
            }else {
                point2--;
            }
            if(max<s){
                max=s;
            }
        }


        return max;

    }
}