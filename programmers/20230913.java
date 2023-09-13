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