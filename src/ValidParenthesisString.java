class ValidParenthesisString {
    public boolean checkValidString(String s) {
        return helper(s, 0, 0);
    }
    public boolean helper(String s, int index, int count) {
        if (index==s.length()) {
            return count==0;
        }
        if (s.charAt(index)=='(') {
            return helper(s, index+1, count+1);
        } else if (s.charAt(index)==')') {
            return count>0 && helper(s, index+1, count-1);
        } else {
            return helper(s, index+1, count) || (count>0 && helper(s, index+1, count-1)) ||  helper(s, index+1, count+1);
        }
    }
}
