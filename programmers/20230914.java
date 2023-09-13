// 숫자의 표현

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            int num=0;
            for(int j=i; j<=n; j++){
                num+=j;
                if(num>n || num==n) break;
            }
            if(num==n) answer++;
        }
        return answer;
    }
}