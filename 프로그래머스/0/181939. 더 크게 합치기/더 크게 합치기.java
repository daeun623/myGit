class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = String.valueOf(a) + String.valueOf(b);
		String d = String.valueOf(b) + String.valueOf(a);
		
		if(Integer.parseInt(c) < Integer.parseInt(d)) {
			answer = Integer.parseInt(d);
		} 
		else if(Integer.parseInt(c) == Integer.parseInt(d)) {
			answer = Integer.parseInt(c);
		} 
		else {
			answer = Integer.parseInt(c);
		}
        return answer;
    }
}