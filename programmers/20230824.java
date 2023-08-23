// 이상한 문자 만들기

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(j%2==0) answer += Character.toUpperCase(arr[i].charAt(j));
                else answer += Character.toLowerCase(arr[i].charAt(j));
            }
            if(i!=arr.length-1) answer+=" ";
        }
        return answer;
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(j%2==0) answer += Character.toUpperCase(arr[i].charAt(j));
                else answer += Character.toLowerCase(arr[i].charAt(j));
            }
            if(i!=arr.length-1) answer+=" ";
        }
        return answer;
    }
}


// 자릿수 더하기

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            int digit = n%10;
            answer += digit;
            n /= 10;
        }

        return answer;
    }
}