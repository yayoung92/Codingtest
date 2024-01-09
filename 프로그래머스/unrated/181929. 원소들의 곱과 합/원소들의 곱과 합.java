class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 1;
        
        for(int i=0; i<num_list.length; i++){
            a += num_list[i];
            b = a*a;
            
            c = c*num_list[i];
            if(b > c)
                answer = 1;
            else
                answer = 0;
        }
        return answer;
    }
}