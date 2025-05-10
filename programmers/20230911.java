//// 나머지가 1이 되는 수 찾기
//
//class Solution {
//    public int solution(int n) {
//        int x=1;
//        while(n%x!=1)
//            x++;
//        return x;
//    }
//}
//
//
//// 내적
//
//class Solution {
//    public int solution(int[] a, int[] b) {
//        int answer = 0;
//        for(int i=0; i<a.length; i++){
//            answer += a[i]*b[i];
//        }
//        return answer;
//    }
//}
//
//
//// 음양 더하기
//
//class Solution {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//        for(int i=0; i<absolutes.length; i++) {
//
//            answer += signs[i] ? absolutes[i] : absolutes[i]*(-1);
//        }
//        return answer;
//    }
//}
//
//
//// 부족한 금액 계산하기
//
//class Solution {
//    public long solution(int price, int money, int count) {
//        long answer = 0;
//
//        for(int i=1; i<=count; i++){
//            answer+=price*i;
//        }
//
//        return answer>money?answer-money:0;
//    }
//}
//
//
//// 약수의 개수와 덧셈
//
//class Solution {
//    public int solution(int left, int right) {
//        int answer = 0;
//        for(int i=left; i<=right; i++){
//            int n=0;
//            for(int j=1; j<=i; j++){
//                if(i%j==0) n++;
//            }
//            answer += n%2==0 ? i : -i;
//        }
//        return answer;
//    }
//}
//
//
//// 3진법 뒤집기
//
//class Solution {
//    public int solution(int n) {
//        String str = Integer.toString(n,3);
//        StringBuffer sb = new StringBuffer(str);
//        str = sb.reverse().toString();
//
//        return Integer.parseInt(str,3);
//    }
//}