//// 숫자의 표현
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        for(int i=1; i<=n; i++){
//            int num=0;
//            for(int j=i; j<=n; j++){
//                num+=j;
//                if(num>n || num==n) break;
//            }
//            if(num==n) answer++;
//        }
//        return answer;
//    }
//}
//
//
//// 다음 큰 숫자
//
//class Solution {
//    public int solution(int n) {
//        int answer = n+1;
//        String num=(Integer.toBinaryString(n)).replace("0","");
//
//        while(true){
//            if(num.length()==(Integer.toBinaryString(answer)).replace("0","").length()) break;
//            answer++;
//        }
//
//        return answer;
//    }
//}
//
//
//// 피보나치 수
//
//class Solution {
//    public static int solution(int n) {
//        int[] D = new int[n + 1];
//        D[0] = 0;
//        D[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            D[i] = (D[i - 1] + D[i - 2]) % 1234567;
//        }
//
//        return D[n];
//    }
//
//}
//
//
//// 짝지어 제거하기
//
//class Solution
//{
//    public int solution(String s)
//    {
//        int answer = 0;
//
//        Stack<Character> stack = new Stack<>();
//        stack.push(s.charAt(0));
//        for(int i=1; i<s.length(); i++){
//            if(!stack.isEmpty() && stack.peek()==s.charAt(i))
//            {
//                stack.pop();
//            }
//            else stack.push(s.charAt(i));
//        }
//
//        if(stack.isEmpty()) answer=1;
//
//        return answer;
//    }
//}
//
//
//// 카펫
//
//class Solution {
//    public int[] solution(int brown, int yellow) {
//        int[] answer = new int[2];
//        int sum=brown+yellow;
//        for(int i=sum/2; i>2; i--){
//            if(sum%i==0 && ((i-2)*(sum/i-2))==yellow) {
//                answer[0]=i;
//                answer[1]=sum/i;
//                break;
//            }
//        }
//
//        return answer;
//    }
//}
//
//
//
//// 영어 끝말잇기
//
//class Solution {
//    public int[] solution(int n, String[] words) {
//        int[] answer = new int[2];
//        int b = 0;
//        String w;
//
//        for(int i=1; i<words.length; i++){
//            w = String.valueOf(words[i-1].charAt(words[i-1].length()-1));
//            if(!(String.valueOf(words[i].charAt(0))).equals(w))
//            {
//                b=i;
//                break;
//            }
//            else{
//                for(int j=0; j<i; j++){
//                    if(words[i].equals(words[j])){
//                        b=i;
//                        break;
//                    }
//                }
//            }
//            if(b!=0) break;
//        }
//        if(b!=0) {
//            answer[0]=b%n+1;
//            answer[1]=(b+n)/n;
//        }
//        return answer;
//    }
//}
//
//
//// 배열 원소의 길이
//
//class Solution {
//    public int[] solution(String[] strlist) {
//        int[] answer = new int[strlist.length];
//        for(int i=0; i<strlist.length; i++){
//            answer[i]=strlist[i].length();
//        }
//        return answer;
//    }
//}
//
//
//// 편지
//
//class Solution {
//    public int solution(String message) {
//        return message.length()*2;
//    }
//}
//
//
//// 최댓값 만들기 (1)
//
//class Solution {
//    public int solution(int[] numbers) {
//        int answer = 0;
//        int max=numbers[0];
//        int n=0;
//        for(int i=1; i<numbers.length; i++){
//            if(numbers[i]>max){
//                n=max;
//                max=numbers[i];
//            } else if(numbers[i]>n){
//                n=numbers[i];
//            }
//        }
//        return max*n;
//    }
//}
//
//
//// 합성수 찾기
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        for(int i=1; i<=n; i++){
//            int num=0;
//            for(int j=1; j<=i; j++){
//                num+=(i%j==0)?1:0;
//            }
//            answer+=(num>=3)?1:0;
//        }
//        return answer;
//    }
//}
//
//
//// 중복된 문자 제거
//
//class Solution {
//    public String solution(String my_string) {
//        String answer = String.valueOf(my_string.charAt(0));
//        for(int i=1; i<my_string.length(); i++){
//            int n=0;
//            for(int j=0; j<answer.length(); j++){
//                if((my_string.charAt(i))==answer.charAt(j)){
//                    n=1;
//                    break;
//                }
//            }if(n==0) answer+=String.valueOf(my_string.charAt(i));
//        }
//        return answer;
//    }
//}