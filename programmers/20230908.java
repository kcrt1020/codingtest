//// 크기가 작은 부분문자열
//
//class Solution {
//    public int solution(String t, String p) {
//        int answer = 0;
//        int p_length = p.length();
//        for(int i=0; i<t.length()-p_length+1; i++){
//            String str = "";
//            for(int j=i; j<i+p_length; j++){
//                if(j==i && t.charAt(j)=='0') break;
//                str += t.charAt(j);
//            }
//            if(str=="") str = "0";
//                int ans = Integer.parseInt(str);
//                if(Integer.parseInt(str)<=Integer.parseInt(p))
//                    answer++;
//        }
//        return answer;
//    }
//}
//// 1차 런타임에러
//
//class Solution {
//    public int solution(String t, String p) {
//        int answer = 0;
//        int p_length = p.length();
//
//        for(int i=0; i<t.length()-p_length+1; i++){
//            String str = "";
//            for(int j=i; j<i+p_length; j++){
//                if(j==i && t.charAt(j)=='0') break;
//                str += t.charAt(j);
//            }
//            if(str=="") str = "0";
//                if(Long.parseLong(str)<=Long.parseLong(p))
//                    answer++;
//        }
//
//        return answer;
//    }
//}
//// 2차 Long 타입으로 변환