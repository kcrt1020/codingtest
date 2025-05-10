//// 간단한 논리 연산
//
//class Solution {
//    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//        // boolean answer = true;
//        // if((x1 == true || x2 == true) && (x3 == true || x4 == true)){
//        //     answer = true;
//        // } else answer = false;
//        // return answer;
//
//        return (x1||x2) && (x3||x4);
//    }
//}
//
//
//// 주사위 게임 3
//
//class Solution {
//    public int solution(int a, int b, int c, int d) {
//        if(a == b && b == c && c == d)
//            return 1111*a; // abcd가 전부 같다면
//        else if(a == b && b == c)// abc만 같다면
//            return ((10 * a + d)*(10 * a + d));
//        else if(b == c && c == d)// bcd만 같다면
//            return ((10 * b + a)*(10 * b + a));
//        else if(c == d && d == a)// cda만 같다면
//            return ((10 * c + b)*(10 * c + b));
//        else if(d == a && a == b)// dab만 같다면
//            return ((10 * d + c)*(10 * d + c));
//        else if(a == b)//ab만 같다면
//            if(c == d)
//                return (a+c)*Math.abs(a - c);
//            else
//                return c * d;
//        else if(a == c)//ac만 같다면
//            if(b == d)
//                return (a+b)*Math.abs(a - b);
//            else
//                return b * d;
//        else if(a == d)//ad만 같다면
//            if(c == b)
//                return (a+c)*Math.abs(a - c);
//            else
//                return c * b;
//        else if(b == c)//bc만 같다면
//            if(a == d)
//                return (b + a)*Math.abs(b - a);
//            else
//                return a * d;
//        else if(b == d)//bd만 같다면
//            if(a == c)
//                return (b+a)*Math.abs(b - a);
//            else
//                return a * c;
//        else if(c == d)//cd만 같다면
//            if(a == b)
//                return (a+c)*Math.abs(a - c);
//            else
//                return a * b;
//        else if(d == a)//ab만 같다면
//            if(b == c)
//                return (d+b)*Math.abs(d - b);
//            else
//                return b * c;
//        else{
//            int min = a;
//            min = Math.min(min, b);
//            min = Math.min(min, c);
//            return Math.min(min, d);
//        }
//    }
//}
//
//
//// 글자 이어 붙여 문자열 만들기
//
//class Solution {
//    public String solution(String my_string, int[] index_list) {
//        String answer = "";
//        for (int i=0; i<index_list.length; i++){
//            answer += my_string.charAt(index_list[i]);
//        }
//        return answer;
//    }
//}
//
//
//// 9로 나눈 나머지
//
//class Solution {
//    public int solution(String number) {
//        int sum = 0;
//
//        for(int i=0; i<number.length(); i++){
//            sum += Character.getNumericValue(number.charAt(i));
//        }
//        return sum%9;
//    }
//}
//
//
//// 문자열 여러 번 뒤집기
//
//class Solution {
//    public String solution(String my_string, int[][] queries) {
//
//        StringBuilder builder = new StringBuilder(my_string);
//        for(int i=0; i<queries.length; i++){
//            // char temp = builder.charAt(queries[i][0]);
//            // builder.setCharAt(queries[i][0], builder.charAt(queries[i][1]));
//            // builder.setCharAt(queries[i][1], temp);
//            // System.out.println(builder.toString());
//
//            String reverse = new StringBuilder(builder.substring(queries[i][0],queries[i][1]+1)).reverse().toString();
//            builder.replace(queries[i][0],queries[i][1]+1,reverse);
//            }
//        return builder.toString();
//    }
//}
//
//
//// 가운데 글자 가져오기
//
//class Solution {
//    public String solution(String s) {
//        if(s.length()%2==0)
//            return s.substring((s.length()/2)-1, (s.length()/2)+1);
//        else
//            return s.substring((s.length()/2), (s.length()/2)+1 );
//    }
//}
//
//
//// 같은 숫자는 싫어
//
//public class Solution {
//    public int[] solution(int []arr) {
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(arr[0]);
//        for(int i=1; i<arr.length; i++){
//            if(list.get(list.size()-1)!=arr[i])
//            list.add(arr[i]);
//        }
//
//        int[] result = new int[list.size()];
//
//        for(int i=0; i<list.size(); i++){
//            result[i]=list.get(i);
//        }
//        return result;
//    }
//}
//
//
//// 나누어 떨어지는 숫자 배열
//
//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%divisor==0){
//                list.add(arr[i]);
//            }
//        }
//        Collections.sort(list);
//
//        return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(i->i).toArray();
//    }
//}
//
//
//// 두 정수 사이의 합
//
//class Solution {
//    public long solution(int a, int b) {
//        long answer = 0;
//
//        if(a<b){
//            while(a<=b){
//                answer+=a;
//                a++;
//            }
//        }
//        else if(b<a){
//            while(b<=a){
//                answer+=b;
//                b++;
//            }
//        }
//        else answer=a;
//
//        return answer;
//    }
//}
//
//
//// 문자열 내 마음대로 정렬하기
//
//class Solution {
//    public String[] solution(String[] strings, int n) {
//        String[] answer = new String[strings.length];
//        ArrayList<String> list = new ArrayList<>();
//
//        for(int i=0; i<strings.length; i++){
//            list.add(""+strings[i].charAt(n) + strings[i]);
//        }
//
//        Collections.sort(list);
//
//        for(int i=0; i<strings.length; i++){
//            answer[i] = list.get(i).substring(1, list.get(i).length());
//        }
//        return answer;
//    }
//}
//
//
//// 문자열 내 p와 y의 개수
//
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        int p = 0;
//        int y = 0;
//
//        for(int i=0; i<s.length(); i++){
//            if(Character.toLowerCase(s.charAt(i))=='p') p++;
//            else if(Character.toLowerCase(s.charAt(i))=='y') y++;
//        }
//
//        if(p==y) return true;
//        else return false;
//    }
//}
//
//
//// 문자열 내림차순으로 배치하기
//
//// class Solution {
////     public String solution(String s) {
////         char[] arr = new char[s.length()];
//
////         for(int i=0; i<arr.length; i++){
////             arr[i]=s.charAt(i);
////         }
////         Arrays.sort(arr);
////         reverseCharArray(arr);
//
////         String answer="";
//
////         for(int i=0; i<arr.length; i++){
////             answer+=arr[i];
//
////         }
////         return answer;
////     }
//
////     public static void reverseCharArray(char[] arr) {
////     int left = 0;
////     int right = arr.length - 1;
//
////     while (left < right) {
////         char temp = arr[left];
////         arr[left] = arr[right];
////         arr[right] = temp;
////         left++;
////         right--;
////     }
//// }
//// }
//
//class Solution {
//    public String solution(String s) {
//        char[] arr = new char[s.length()];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i]=s.charAt(i);
//        }
//        Arrays.sort(arr);
//
//        return new StringBuilder(new String(arr)).reverse().toString();
//    }
//}
//
//
//// 문자열 다루기 기본
//
//class Solution {
//    public boolean solution(String s) {
//        boolean answer = true;
//
//        if(s.length()==4 || s.length()==6) {
//            for(int i=0; i<s.length(); i++) {
//                if(Character.isDigit(s.charAt(i))==false){
//                    answer=false;
//                    break;
//                }
//            }
//        }
//        else answer=false;
//        return answer;
//    }
//}
//
//
//// 소수 찾기
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        // for(int i=2; i<=n; i++){
//        //     boolean b = true;
//        //     for(int j=2; j<i; j++){
//        //         if(i%j==0){
//        //             b = false;
//        //             break;
//        //         }
//        //     }
//        //     if(b==true) answer++;
//        // }
//
//        boolean[] prime = new boolean[n+1];
//        for(int i=2; i<=n; i++){
//            prime[i]=true;
//        }
//
//        int root=(int)Math.sqrt(n);
//
//        for(int i=2; i<=root; i++){
//            if(prime[i]==true){
//                for(int j=i; i*j<=n; j++){
//                    prime[i*j]=false;
//                }
//            }
//        }
//
//        for(int i=2; i<=n; i++){
//            if(prime[i]==true) answer++;
//        }
//
//
//        return answer;
//    }
//}
//
//
//// 수박수박수박수박수박수?
//class Solution {
//    public String solution(int n) {
//        String answer = "";
//        for(int i=0; i<n; i++){
//            if(i%2==0) answer+="수";
//            else answer+="박";
//        }
//        return answer;
//    }
//}
//
//
//// 문자열을 정수로 바꾸기
//
//class Solution {
//    public int solution(String s) {
//        return Integer.parseInt(s);
//    }
//}
//
//
//// 시저 암호
//
//class Solution {
//    public String solution(String s, int n) {
//        String answer = "";
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)==' ')
//            {
//                answer+=" ";
//                continue;
//            }
//
//            int ch = (int)s.charAt(i);
//
//            if(ch>=65 && ch<=90) {
//                if(ch+n>90) answer+=(char)ch-26+n;
//                else answer+=(char)(ch+n);
//            }
//
//            else if(ch>=97 && ch<=122){
//                if(ch+n>122) answer+=(char)(ch-26+n);
//                else answer+=(char)(ch+n);
//            }
//        }
//        return answer;
//    }
//}
//
//
//// 약수의 합
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        for(int i=1; i<=n; i++){
//            if(n%i==0) answer+=i;
//        }
//        return answer;
//    }
//}