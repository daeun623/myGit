class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt(""+a+b);
        int answer = x > a*b*2 ? x : a*b*2 ;
        return answer;
    }
}