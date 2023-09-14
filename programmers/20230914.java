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


// 짝지어 제거하기

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)) 
            {
                stack.pop();
            }
            else stack.push(s.charAt(i));
        }
        
        if(stack.isEmpty()) answer=1;

        return answer;
    }
}


// 카펫

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum=brown+yellow;
        for(int i=sum/2; i>2; i--){
            if(sum%i==0 && ((i-2)*(sum/i-2))==yellow) {
                answer[0]=i;
                answer[1]=sum/i;
                break;
            }
        }
        
        return answer;
    }
}



// 영어 끝말잇기

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int b = 0;
        String w;

        for(int i=1; i<words.length; i++){
            w = String.valueOf(words[i-1].charAt(words[i-1].length()-1));
            if(!(String.valueOf(words[i].charAt(0))).equals(w)) 
            {
                b=i;
                break;
            }
            else{
                for(int j=0; j<i; j++){
                    if(words[i].equals(words[j])){
                        b=i;
                        break;
                    }
                }
            }
            if(b!=0) break;
        }
        if(b!=0) {
            answer[0]=b%n+1;
            answer[1]=(b+n)/n;
        }
        return answer;
    }
}