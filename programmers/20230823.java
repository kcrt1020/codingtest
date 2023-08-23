// 간단한 논리 연산

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // boolean answer = true;
        // if((x1 == true || x2 == true) && (x3 == true || x4 == true)){
        //     answer = true;
        // } else answer = false;
        // return answer;

        return (x1||x2) && (x3||x4);
    }
}


// 주사위 게임 3

class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a == b && b == c && c == d)
            return 1111*a; // abcd가 전부 같다면
        else if(a == b && b == c)// abc만 같다면
            return ((10 * a + d)*(10 * a + d));
        else if(b == c && c == d)// bcd만 같다면
            return ((10 * b + a)*(10 * b + a));
        else if(c == d && d == a)// cda만 같다면
            return ((10 * c + b)*(10 * c + b));
        else if(d == a && a == b)// dab만 같다면
            return ((10 * d + c)*(10 * d + c));
        else if(a == b)//ab만 같다면
            if(c == d)
                return (a+c)*Math.abs(a - c);
            else
                return c * d;
        else if(a == c)//ac만 같다면
            if(b == d)
                return (a+b)*Math.abs(a - b);
            else
                return b * d;
        else if(a == d)//ad만 같다면
            if(c == b)
                return (a+c)*Math.abs(a - c);
            else
                return c * b;
        else if(b == c)//bc만 같다면
            if(a == d)
                return (b + a)*Math.abs(b - a);
            else
                return a * d;
        else if(b == d)//bd만 같다면
            if(a == c)
                return (b+a)*Math.abs(b - a);
            else
                return a * c;
        else if(c == d)//cd만 같다면
            if(a == b)
                return (a+c)*Math.abs(a - c);
            else
                return a * b;
        else if(d == a)//ab만 같다면
            if(b == c)
                return (d+b)*Math.abs(d - b);
            else
                return b * c;
        else{
            int min = a;
            min = Math.min(min, b);
            min = Math.min(min, c);
            return Math.min(min, d);
        }
    }
}


// 글자 이어 붙여 문자열 만들기

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i=0; i<index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}


// 9로 나눈 나머지

class Solution {
    public int solution(String number) {
        int sum = 0;
        
        for(int i=0; i<number.length(); i++){
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum%9;
    }
}


// 문자열 여러 번 뒤집기

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder builder = new StringBuilder(my_string);
        for(int i=0; i<queries.length; i++){
            // char temp = builder.charAt(queries[i][0]);
            // builder.setCharAt(queries[i][0], builder.charAt(queries[i][1]));
            // builder.setCharAt(queries[i][1], temp);
            // System.out.println(builder.toString());
            
            String reverse = new StringBuilder(builder.substring(queries[i][0],queries[i][1]+1)).reverse().toString();
            builder.replace(queries[i][0],queries[i][1]+1,reverse);
            }
        return builder.toString();
    }
}


// 가운데 글자 가져오기

class Solution {
    public String solution(String s) {
        if(s.length()%2==0) 
            return s.substring((s.length()/2)-1, (s.length()/2)+1);
        else 
            return s.substring((s.length()/2), (s.length()/2)+1 );
    }
}


// 같은 숫자는 싫어

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(list.get(list.size()-1)!=arr[i])
            list.add(arr[i]);
        }

        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            result[i]=list.get(i);
        }
        return result;
    }
}