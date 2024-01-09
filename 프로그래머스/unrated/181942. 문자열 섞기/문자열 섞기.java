class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++){
            char c = str1.charAt(i);
            answer += c;
            char cc = str2.charAt(i);
            answer += cc;

        }
        return answer;
    }
}