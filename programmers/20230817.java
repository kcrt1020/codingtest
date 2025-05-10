//import java.util.*;
//
//// 수열과 구간 쿼리 4
//
//class Solution {
//    public int[] solution(int[] arr, int[][] queries) {
//        for(int i=0; i<queries.length; i++){
//            for(int j=queries[i][0]; j<=queries[i][1]; j++){
//                if(j%queries[i][2]==0){
//                    arr[j]++;
//                }
//            }
//        }
//        return arr;
//    }
//}
//
//
//// 배열 만들기 2
//
//class Solution {
//    public int[] solution(int l, int r) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i=l; i<=r; i++){
//            String str=i+"";
//            int count=0;
//            for(int j=0; j<str.length(); j++){
//                if(str.charAt(j)==48 || str.charAt(j)==53){
//                    count++;
//                }
//            }
//            if(count == str.length()){
//                list.add(i);
//            }
//        }
//
//        return list.isEmpty()? new int[] {-1} : list.stream().mapToInt(i->i).toArray();
//    }
//}
//
//
//// 카운트 업
//
//class Solution {
//    public int[] solution(int start, int end) {
//        int[] answer = new int [end-start+1];
//        int i=0;
//        for(int j=start; j<=end; j++){
//            answer[i]=j;
//            i++;
//            }
//        return answer;
//    }
//}
//
//
//// 콜라츠 수열 만들기
//
//class Solution {
//    public int[] solution(int n) {
//        List<Integer> list = new ArrayList<>();
//        list.add(n);
//        while(n>1){
//            if(n%2==0){
//                n=n/2;
//            }
//            else {
//                n=3*n+1;
//            }
//            list.add(n);
//        }
//        return list.stream().mapToInt(i->i).toArray();
//    }
//}
//
//
//// 배열 만들기 4
//
//// 런타임 오류 코드
//class Solution {
//    public int[] solution(int[] arr) {
//        List<Integer> stk = new ArrayList<>();
//
//        for(int i=0; i<arr.length; i++){
//            if(stk.isEmpty()==true){
//                stk.add(arr[i]);
//            }
//            else if(stk.get(stk.size()-1)<arr[i]){
//                stk.add(arr[i]);
//            }
//            else {
//                stk.remove(stk.size()-1);
//                stk.add(arr[i]);
//            }
//        }
//
//        return stk.stream().mapToInt(i->i).toArray();
//    }
//}
//
//// 성공
//class Solution {
//    public int[] solution(int[] arr) {
//        ArrayList<Integer> stack = new ArrayList<Integer>();
//
//        int idx = 0;
//        while(idx < arr.length) {
//            if(stack.isEmpty() || stack.get(stack.size()-1) < arr[idx]) {
//                stack.add(arr[idx]);
//                idx++;
//            }
//            else if(stack.get(stack.size()-1) >= arr[idx]) {
//                stack.remove(stack.size()-1);
//            }
//        }
//
//        int[] stk = new int[stack.size()];
//        for(int i = 0; i < stk.length; i++) {
//            stk[i] = stack.get(i);
//        }
//
//        return stk;
//    }
//}