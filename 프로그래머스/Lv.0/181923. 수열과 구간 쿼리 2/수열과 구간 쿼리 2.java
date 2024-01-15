class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
		for(int i=0; i<queries.length; i++) {
            int min = 1000000;
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2]; 
			
            for(int j=s; j<=e; j++){
                if(arr[j] > k){
                    if(min > arr[j]){
                        min = arr[j];                       
                    }
                }
            }
            if(min == 1000000){
                answer[i] = -1;
            } else
                answer[i] = min;
		}
        return answer;
    }
}