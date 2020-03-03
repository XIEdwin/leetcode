package solutions_1_20;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xzw
 * @create 2020-03-03 16:07
 */

/**
 * 解题思路:利用滑动窗口的思想解决问题，一个左索引和一个右索引，右索引推进。索引之间的元素保存在集合里面，
 * 当出现重复元素，推进左索引直至不再含有重复元素
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int res=0;
        Set<Character> set=new HashSet<>();
        while(r<s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r++));
            res=Math.max(res,r-l);
        }
        return res;
    }
}
