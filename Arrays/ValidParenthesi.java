//Time Complexity:O(n);
//Space  Complexity::O(n)
class ValidParenthesi{
    public boolean isValid(String str) {
        int n = str.length();
        
        char[] stack = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // push
            } else {
                if (top == -1) return false;

                char last = stack[top--]; // pop

                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        return top == -1; 
    }
}
