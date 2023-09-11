// 나머지가 1이 되는 수 찾기

class Solution {
    public int solution(int n) {
        int x=1;
        while(n%x!=1)
            x++;
        return x;
    }
}


// 내적

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}


// 음양 더하기

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++) {
            
            answer += signs[i] ? absolutes[i] : absolutes[i]*(-1);
        }
        return answer;
    }
}


// 부족한 금액 계산하기

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i=1; i<=count; i++){
            answer+=price*i;
        }

        return answer>money?answer-money:0;  
    }
}