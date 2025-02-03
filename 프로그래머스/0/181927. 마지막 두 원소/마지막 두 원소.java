import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int a = 0;
        for(int i : num_list) {
            arr.add(i);
        }
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
			a = num_list[num_list.length-1] - num_list[num_list.length-2];
		}
		else {
			a = num_list[num_list.length-1]*2;
		}
        arr.add(a);
        
        // answer 배열의 크기를 num_list.length + 1로 설정
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i); // 인덱스를 사용하여 값을 복사
        }

        return answer; // answer 배열 반환 
    }
}