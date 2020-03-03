package solutions_1_20;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xzw
 * @create 2020-03-03 16:00
 */
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tmp=target-nums[i];
            if(map.containsKey(tmp)){
                return new int[]{i,map.get(tmp)};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
