// 이상한 문자 만들기

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(j%2==0) answer += Character.toUpperCase(arr[i].charAt(j));
                else answer += Character.toLowerCase(arr[i].charAt(j));
            }
            if(i!=arr.length-1) answer+=" ";
        }
        return answer;
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(j%2==0) answer += Character.toUpperCase(arr[i].charAt(j));
                else answer += Character.toLowerCase(arr[i].charAt(j));
            }
            if(i!=arr.length-1) answer+=" ";
        }
        return answer;
    }
}


// 자릿수 더하기

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            int digit = n%10;
            answer += digit;
            n /= 10;
        }

        return answer;
    }
}


// 자연수 뒤집어 배열로 만들기

class Solution {
    public int[] solution(long n) {
        StringBuilder str = new StringBuilder(Long.toString(n));
        int[] answer = new int[str.length()];
        str.reverse();
        
        for(int i=0; i<str.length(); i++){
            answer[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}


// 정수 내림차순으로 배치하기

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder(Long.toString(n));
        String str = sb.toString();
        char[] charArray = str.toCharArray();
        
        Arrays.sort(charArray);
        
        str = new String(charArray);
        str = new StringBuilder(str).reverse().toString();
        return Long.parseLong(str);
    }
}


// 정수 제곱근 판별

class Solution {
    public long solution(long n) {
        long answer = 0;
        double squareRoot = Math.sqrt(n);
        
        if(squareRoot==(long)squareRoot){
            return (long)((squareRoot+1)*(squareRoot+1));
        }
        else return -1;
    }
}


// 제일 작은 수 제거하기

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length<=1) return new int[] {-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(x->x != min).toArray();
    }
}


// 짝수와 홀수

class Solution {
    public String solution(int num) {
        if(num%2==0) return "Even";
        else return "Odd";
    }
}


// 최대공약수와 최소공배수

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        return new int[] {findGCD(n,m), findLCM(new int[] {n, m})};
    }
    
    // 최대공약수
    public static int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        return findGCD(b, a%b);
    }
    
    // 최소공배수
    public static int findLCM(int[] numbers){
        int lcm=1;
        for(int number:numbers) {
            int gcd = findGCD(lcm,number);
            lcm=(lcm*number)/gcd;
        }
        return lcm;
    }
}


// x만큼 간격이 있는 n개의 숫자

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        answer[0]=x;
        
        for(int i=1; i<n; i++){
            answer[i]=answer[i-1]+x;
        }
        return answer;
    }
}


// 콜라츠 추측

class Solution {
    public int solution(int num) {
        int answer = 0;
        long n=num;
        if (n==1){
            return 0;
        }
        
        while(n!=1){
            if(n%2==0) n=n/2;
            else n=(n*3)+1;
            
            answer++;
            if(answer>=500) return -1;
        }
        
        return answer;
    }
}


// 하샤드 수

class Solution {
    public boolean solution(int x) {
        
        // 자릿수 합
        int sum=0;
        int n=x;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        
        return x%sum==0? true:false;
    }
}


// 핸드폰 번호 가리기

class Solution {
    public String solution(String phone_number) {
        String str = phone_number.substring(0,phone_number.length()-4);
        return phone_number.replaceAll(str,"*".repeat(str.length()));
    }
}


// 행렬의 덧셈

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}


// 직사각형 별찍기

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<b; i++){
            System.out.println("*".repeat(a));
        }
    }
}