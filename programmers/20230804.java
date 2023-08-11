// 특정 문자 제거하기

class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter,"");
    }
}


// 각도기

class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle<90) 
        {
            answer = 1;
        }
        else if(angle==90) {
            answer = 2;
        }
        else if(angle>90 && angle<180) {
            answer = 3;
        }
        else if(angle==180) {
            answer = 4;
        }
    return answer;
    }
}


// 양꼬치

class Solution {
    public int solution(int n, int k) {
        return (n*12000) + (k*2000) - (n/10*2000);
    }
}


// 짝수의 합

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i+=2){
            answer+=i;
        }
        return answer;
    }
} 