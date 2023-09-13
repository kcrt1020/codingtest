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