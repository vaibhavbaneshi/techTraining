package backTracking;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    
    public static void helper(List<String> ans,int open,int close,int max,String currentBracket) {
        
        if(currentBracket.length() == max*2) {
            ans.add(currentBracket);
            System.out.println(ans);
            return;
        }

        if(open < max) {
            helper(ans,open + 1,close,max,currentBracket+"(");
        }

        if(close < open) {
            helper(ans,open,close + 1,max,currentBracket+")");
        }
    }

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        helper(ans,0,0,3,"");
    }
}
