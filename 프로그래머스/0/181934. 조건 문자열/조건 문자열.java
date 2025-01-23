class Solution {
    static int a(boolean b) {
        int answer = 0;
        if(b==true) {
            answer = 1;
        }else {
            answer = 0;
        }
        return answer;
    }
    public int solution(String ineq, String eq, int n, int m) {
        boolean b = true;
        String x = ineq + eq;
        if(x.equals(">=")) {
            b = n>=m;
        }else if(x.equals("<=")) {
            b = n<=m;
        }else if(x.equals(">!")) {
            b = n>m;
        }else {
            b = n<m;
        }
        return Solution.a(b);
    }
}