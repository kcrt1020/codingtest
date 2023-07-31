// 코드 처리하기

class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        for(int i=0; i<code.length(); i++){
            if(mode == 0) 
            {
                if(!String.valueOf(code.charAt(i)).equals("1") && i%2==0) ret+=code.charAt(i);
                else if(String.valueOf(code.charAt(i)).equals("1")) mode = 1;
            }
            else if(mode == 1) 
            {
                if(!String.valueOf(code.charAt(i)).equals("1") && i%2==1) ret+=code.charAt(i);
                else if(String.valueOf(code.charAt(i)).equals("1")) mode = 0;
            }
        }
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}

// 등차수열의 특정한 항만 더하기

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = 0;
        
        for(int i=0; i<included.length; i++)
        {
            if(i==0)num = a;
            else num += d;
            
            if(included[i]==true) answer += num;
        }
        return answer;
    }
}


// 주사위 게임 2

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a!=b && b!=c && a!=c)
            answer = a+b+c;
        else if (a==b && a==c)
            answer =  (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        else
            answer =  (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        return answer;
    }
}