class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] z = new int[included.length];
        
        for(int i=0; i<included.length; i++){
            z[i] = a;
            a = a+d;
            if(included[i]==true){
                answer += z[i];
            }
        }
        return answer;
    }
}