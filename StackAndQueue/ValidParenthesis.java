//Time Complexity:O(n)
//Space Complexity:O(n)

import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String str) {
        Stack <Character>st=new Stack<>();
       int n=str.length();
       for(int i=0;i<n;i++)
       {
        char ch=str.charAt(i);
        if(ch=='(')
        {
          st.push(')');
        }
        else if(ch=='{')
        {
          st.push('}');

        }
        else if(ch=='[')
        {
          st.push(']');
        }
        else if(st.empty() || st.pop()!=ch)
        {
            return false;
        }
       }
       return st.isEmpty();
    }
}