// 크기가 작은 부분문자열

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_length = p.length();
        for(int i=0; i<t.length()-p_length+1; i++){
            for(int j=i; j<i+p_length; j++){
                System.out.println(i+" "+j);
                
            }
        }
        return answer; 
    }
}