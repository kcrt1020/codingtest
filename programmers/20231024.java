//// 괄호 회전하기
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        for(int i=0; i<s.length(); i++){
//            Stack<Character> stack = new Stack<>();
//            String str = s.substring(i,s.length()) + s.substring(0, i);
//            for(int j=0; j<str.length(); j++) {
//                char c = str.charAt(j);
//                if(stack.isEmpty()){
//                    stack.push(c);
//                }else if(c==')' && stack.peek()=='('){
//                    stack.pop();
//                }else if(c=='}' && stack.peek()=='{'){
//                    stack.pop();
//                }else if(c==']' && stack.peek()=='['){
//                    stack.pop();
//                }else {
//                    stack.push(c);
//                }
//                System.out.println(stack);
//            }
//            if(stack.isEmpty()){
//                answer++;
//            }
//            System.out.println("==");
//        }
//        return answer;
//    }
//}
//
//
//// n^2 배열 자르기
//
//class Solution {
//    public int[] solution(int n, long left, long right) {
//        int[] answer = new int[(int)(right-left)+1];
//
//        for(int i=0; i<answer.length; i++){
//            int row=(int)((i+left)/n)+1;
//            int col=(int)((i+left)%n)+1;
//            answer[i]=Math.max(row,col);
//        }
//
//
//        return answer;
//    }
//}
//
//
//// 정수 부분
//
//class Solution {
//    public int solution(double flo) {
//        return (int)flo;
//    }
//}
//
//
//// 첫 번째로 나오는 음수
//
//class Solution {
//    public int solution(int[] num_list) {
//        for(int i=0; i<num_list.length; i++){
//            if(num_list[i]<0) return i;
//        }
//        return -1;
//    }
//}
//
//
//// 문자열로 변환
//
//class Solution {
//    public String solution(int n) {
//        return Integer.toString(n);
//    }
//}