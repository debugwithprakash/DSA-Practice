class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> List = new ArrayList<>();
        generate(n, 0, 0, "", List);
        return List;
    }
    public void generate(int n, int l, int r, String s, List<String> List) {
        if(s.length() == 2*n) {
            List.add(s);
            return;
        }
        if(l < n) generate(n, l+1, r, s+"(", List); // Left Parentheses Call
        if(r < l) generate(n, l, r+1, s+")", List); // Right Parentheses Call
    }
}