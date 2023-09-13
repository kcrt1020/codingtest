// 최댓값과 최솟값

class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        int max = Integer.parseInt(num[0]);
        int min = Integer.parseInt(num[0]);
        
        for(int i=1; i<num.length; i++){
            if(Integer.parseInt(num[i])>max) 
                max=Integer.parseInt(num[i]);
            if(Integer.parseInt(num[i])<min) 
                min=Integer.parseInt(num[i]);
        }
        return min+" "+max;
    }
}


// JadenCase 문자열 만들기

class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            if(i==0 || s.charAt(i-1)==' ') 
                answer+=Character.toUpperCase(s.charAt(i));
            else answer+=Character.toLowerCase(s.charAt(i));
        }
        return answer;
    }
}


// 최솟값 만들기

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++){
            answer+=A[i]*B[B.length-1-i];
        }

        return answer;
    }
}
// 1차 시간초과

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++){
            answer=answer+(A[i]*B[B.length-1-i]);
        }

        return answer;
    }
}


// 올바른 괄호

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if(s.charAt(0)!='(') answer = false;
        if(s.charAt(s.length()-1)!=')') answer = false;

        return answer;
    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int o=0;
        int c=0;
        if(s.charAt(0)!='(') return false;
        if(s.charAt(s.length()-1)!=')') return false;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') o++;
            if(s.charAt(i)==')') c++;
            if(o<c) return false;
        }
        
        if(o!=c) answer=false;
        return answer;
    }
}


// 이진 변환 반복하기

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length()>1){
            int zero=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0') answer[1]++;
                else zero++;
                
            }
            s = Integer.toBinaryString(zero);
            answer[0]++;
        }
        return answer;
    }
}