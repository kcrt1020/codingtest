//// 마지막 두 원소
//
//class Solution {
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[num_list.length+1];
//        int temp=0;
//        for(int i=0; i<num_list.length; i++){
//            answer[i]=num_list[i];
//            if(i==num_list.length-1){
//                if(temp<num_list[i]) answer[i+1]=num_list[i]-temp;
//                else answer[i+1]=num_list[i]*2;
//            }
//            temp=num_list[i];
//        }
//        return answer;
//    }
//}
//
//
//// 수 조작하기 1
//
//class Solution {
//    public int solution(int n, String control) {
//        int answer = 0;
//
//        for(int i=0; i<control.length(); i++)
//        {
//            if(String.valueOf(control.charAt(i)).equals("w")) n+=1;
//            else if(String.valueOf(control.charAt(i)).equals("s")) n-=1;
//            else if(String.valueOf(control.charAt(i)).equals("d")) n+=10;
//            else if(String.valueOf(control.charAt(i)).equals("a")) n-=10;
//        }
//        return n;
//    }
//}
//
//
//// 수 조작하기 2
//class Solution {
//    public String solution(int[] numLog) {
//        String answer = "";
//        String str ="";
//        int j=0;
//
//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<numLog.length; i++){
//
//            if(i==0) j=0;
//            else j=i-1;
//
//            if(numLog[i] - numLog[j] == 1)answer+="w";
//            else if(numLog[i] - numLog[j] == -1)answer+="s";
//            else if(numLog[i] - numLog[j] == 10)answer+="d";
//            else if(numLog[i] - numLog[j] == -10)answer+="a";
//        }
//        return answer;
//    }
//}
//
//
//// 수열과 구간 쿼리 3
//
//class Solution {
//    public int[] solution(int[] arr, int[][] queries) {
//        int temp;
//
//        for(int i=0; i<queries.length; i++){
//            temp = arr[queries[i][0]];
//            arr[queries[i][0]]=arr[queries[i][1]];
//            arr[queries[i][1]]=temp;
//        }
//        return arr;
//    }
//}
//
//
//// 수열과 구간 쿼리 2
//
//class Solution {
//    private static final int INF = 1000001;
//    public int[] solution(int[] arr, int[][] queries) {
//        int[] answer = new int[queries.length];
//
//        for(int i=0; i<queries.length; i++){
//            int num=INF;
//            for(int j=queries[i][0]; j<=queries[i][1]; j++){
//                    if(arr[j]<=queries[i][2] || arr[j]>=num){
//                        continue;
//                    }
//                    num=arr[j];
//            }
//            answer[i] = num == INF ? -1 : num;
//        }
//        return answer;
//    }
//}