class Solution {
    public int solution(int number, int n, int m) {
        if(m%n==0) {
            n=1;
        }else if(n%m==0) {
            m=1;
        }
        int answer = (number%(n*m)==0) ? 1 : 0;
        return answer;
    }
}