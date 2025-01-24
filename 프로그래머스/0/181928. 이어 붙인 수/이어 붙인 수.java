class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String s1 = "";
        String s2 = "";
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==1) {
                s1 += num_list[i];
            }
            else {
                s2 += num_list[i];
            }
        }
        return answer = Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}