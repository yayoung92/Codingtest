class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<queries[i].length; j++){
                int t = arr[queries[i][0]];
                arr[queries[i][0]] = arr[queries[i][j]];
                arr[queries[i][j]] = t;
                
                answer = arr;
            }
        }
        return answer;
    }
}