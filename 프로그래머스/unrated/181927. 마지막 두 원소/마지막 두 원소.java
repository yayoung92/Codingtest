import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int d = 0;
        int a = num_list.length;
        
        for(int i=0; i<a; i++){
            int x = num_list[a-1];
            int y = num_list[a-2];
            
            if(x>y){
                d = x-y;
                answer = Arrays.copyOf(num_list, a+1);
                answer[a] = d;
            } else if(x<=y){
                d = x*2;
                answer = Arrays.copyOf(num_list, a+1);
                answer[a] = d;
            }
        }
        return answer;
    }
}