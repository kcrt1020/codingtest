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


// 다음 큰 숫자

class Solution {
    public int solution(int n) {
        int answer = n+1;
        String num=(Integer.toBinaryString(n)).replace("0","");
        
        while(true){
            if(num.length()==(Integer.toBinaryString(answer)).replace("0","").length()) break;
            answer++;
        }
        
        return answer;
    }
}


// 피보나치 수

class Solution {
    public static int solution(int n) {
        int[] D = new int[n + 1];
        D[0] = 0;
        D[1] = 1;
        for (int i = 2; i <= n; i++) {
            D[i] = (D[i - 1] + D[i - 2]) % 1234567;
        }

        return D[n];
    }

}