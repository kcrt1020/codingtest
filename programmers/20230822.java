//// 2016년
//
//class Solution {
//    public String solution(int a, int b) {
//        String answer = "";
//        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
//        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
//        int count = -1;
//
//        for(int i=0; i<a-1; i++){
//            count+=month[i];
//        }
//
//        return week[(count+b)%7];
//    }
//}