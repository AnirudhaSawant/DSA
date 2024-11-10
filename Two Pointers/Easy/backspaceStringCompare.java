class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;

        while(i >= 0 || j >= 0) {
            int backspaceCount = 0;
            while(i >= 0 && (s.charAt(i) == '#' || backspaceCount > 0)) {
                if(s.charAt(i) == '#') {
                    backspaceCount++;
                    i--;
                }
                else{
                    backspaceCount--;
                    i--;
                }
            }

            backspaceCount = 0;
            while(j >= 0 && (t.charAt(j) == '#' || backspaceCount > 0)) {
                if(t.charAt(j) == '#') {
                    backspaceCount++;
                    j--;
                }
                else{
                    backspaceCount--;
                    j--;
                }
            }

             if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }

            // If one string is exhausted and the other is not
            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }
        return true;
    }
}