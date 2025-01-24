class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus = 0;
        int mul = 1;
        for(int i=0; i<num_list.length; i++) {
            plus += num_list[i];
            mul *= num_list[i];
        }
        return answer = plus*plus > mul ? 1 : 0;
    }
}