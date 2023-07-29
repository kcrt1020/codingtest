// 문자열 섞기

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();
        // for(int i=0; i<arr1.length; i++){
        //    answer = answer+arr1[i]+arr2[i]+"";
        // }
        for(int i=0; i<str1.length(); i++){
           answer += str1.charAt(i);
           answer += str2.charAt(i);
        }
        return answer;
    }
}


// 문자 리스트를 문자열로 변환하기

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i=0; i<arr.length; i++){
            answer+=arr[i];
        }
        return answer;
    }
}


// 문자열 곱하기

class Solution {
    public String solution(String my_string, int k) {
        String answer = my_string.repeat(k);
        return answer;
    }
}


// 더 크게 합치기

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = ""+a+b;
        String ba = ""+b+a;
        
        // if (Integer.parseInt(ab) > Integer.parseInt(ba)){
        //     answer = Integer.parseInt(ab);
        // } else {
        //     answer = Integer.parseInt(ba);
        // }
        return Math.max(Integer.parseInt(ab),Integer.parseInt(ba));
    }
}


// 두 수의 연산값 비교하기

class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(""+a+b);
        int num2 = 2*a*b;
        
        return Math.max(num1, num2);
    }
}


// n의 배수

class Solution {
    public int solution(int num, int n) {
        if (num%n==0) return 1;
        else return 0;
    }
}


// 공배수

class Solution {
    public int solution(int number, int n, int m) {
        // if(number%n==0 && number%m==0)
        // return 1;
        // else return 0;
        
        return number%n==0 && number%m==0?1:0;
    }
}


// 홀짝에 따라 다른 값 반환하기

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2==0)
        {
            for(int i=0;i<=n;i+=2){
                answer+=i*i;
            }
        } 
        else
        {
            for(int i=1;i<=n;i+=2){
                answer+=i;
            }
        }
        return answer;
    }
}


// 조건 문자열

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(eq.equals("="))
        {
            if(ineq.equals(">"))return n>=m?1:0;
            else return n<=m?1:0;
        }
        else
        {System.out.println("dfsdfd");
            if(ineq.equals(">")){
                return n>m?1:0;
            }
            else return n<m?1:0;
        }
    }
}


// flag에 따라 다른 값 반환하기

class Solution {
    public int solution(int a, int b, boolean flag) {
        if(flag==true) return a+b;
        else return a-b;
    }
}


// 짝수 홀수 개수

class Solution {
    public int[] solution(int[] num_list) {
        
//         int a = 0;
//         int b = 0;
//         for(int i=0; i<num_list.length; i++){
//             if(num_list[i]%2==0) a++;
//             else b++;
//         }
//         int[] answer = {a,b};
//         return answer;
        
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}