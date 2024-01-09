class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String z = Integer.toString(a)+ Integer.toString(b);
        int n = Integer.valueOf(z);
        int y = 2*a*b;
        
        if(y>n)
            answer = y;
        else
            answer = n;
        return answer;
    }
}