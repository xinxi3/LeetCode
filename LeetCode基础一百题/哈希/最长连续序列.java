import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num :nums){
            st.add(num);
        }
        int ans=0;
        for(int x :st){
            if(st.contains(x-1)) continue;
            int y=x+1;
            while(st.contains(y)){
                y++;
            }
            ans=Math.max(ans,y-x);
        }

       return ans;
    }
}