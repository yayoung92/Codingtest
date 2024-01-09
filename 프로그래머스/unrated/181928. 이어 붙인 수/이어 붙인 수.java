class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String z = "";
        String y = "";
        for(int i=0; i<num_list.length; i++){
            
            if(num_list[i]%2==0){
                z += num_list[i];
            } else if(num_list[i]%2==1){
                y += num_list[i];
            }
        }
        answer = Integer.parseInt(y) + Integer.parseInt(z);
        return answer;
    }
}