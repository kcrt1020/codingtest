// 괄호 회전하기

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i,s.length()) + s.substring(0, i);
            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);
                if(stack.isEmpty()){
                    stack.push(c);
                }else if(c==')' && stack.peek()=='('){
                    stack.pop();
                }else if(c=='}' && stack.peek()=='{'){
                    stack.pop();
                }else if(c==']' && stack.peek()=='['){
                    stack.pop();    
                }else {
                    stack.push(c);
                }
                System.out.println(stack);
            }
            if(stack.isEmpty()){
                answer++;
            }
            System.out.println("==");
        }
        return answer;
    }
}


// n^2 배열 자르기

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        
        for(int i=0; i<answer.length; i++){
            int row=(int)((i+left)/n)+1;
            int col=(int)((i+left)%n)+1;
            answer[i]=Math.max(row,col);
        }
        
        
        return answer;
    }
}