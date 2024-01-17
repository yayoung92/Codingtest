class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(int i=0; i<queries.length; i++){
            a = queries[i][0];
			b = queries[i][1];
			c = queries[i][2];
            
            for(int j=a; j<=b; j++) {
				
			    if(j%c==0) {
					arr[j] += 1;
				}
			}
        }
        
        return arr;
    }
}