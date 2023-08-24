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


// 소수 만들기

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            if(i+2>=nums.length) break;
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    boolean tf=true;
                    for(int h=2; h<=sum/2; h++){
                        if(sum%h==0){
                            tf=false;
                            break;
                        }
                    }
                    if(tf==true) answer++;
                }
            }
        }

        return answer;
    }
}


// 예산

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            if(budget-d[i]<0) break;
            
            budget-=d[i];
            answer++;
        }
        return answer;
    }
}


// 삼총사

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i=0; i<number.length; i++){
            if(i+2>=number.length) break;
            for(int j=i+1; j<number.length; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0) answer++;
                }
            }
        }
        return answer;
    }
}


// 숫자 짝꿍

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        
        // X
        String[] strX = new String[X.length()];
        
        for(int i=0; i<X.length(); i++){
            strX[i]=String.valueOf(X.charAt(i));
        }
        
        Arrays.sort(strX);
        
        ArrayList<Integer> intX = new ArrayList<Integer>();
        
        for(String str:strX){
            intX.add(Integer.parseInt(str));
        }
        
        // Y
        String[] strY = new String[Y.length()];
        
        for(int i=0; i<Y.length(); i++){
            strY[i]=String.valueOf(Y.charAt(i));
        }
        
        Arrays.sort(strY);
        
        ArrayList<Integer> intY = new ArrayList<Integer>();
        
        for(String str:strY){
            intY.add(Integer.parseInt(str));
        }
        
        int num = (intX.size()>intY.size()) ? intY.size() : intX.size();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<intX.size(); i++){
            for(int j=0; j<intY.size(); j++){
                if(intX.get(i)==intY.get(j)){
                    arr.add(intX.get(i));
                    intY.remove(j);
                    break;
                }
            }
        }
        
        for(int i=arr.size()-1; i>=0; i--){
            System.out.println(answer);
            if(answer.equals("0") && arr.get(i)==0) break;
            answer += arr.get(i);
        }
        
        
        return answer=="" ? "-1" : answer;
    }
}

// 시간 초과

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for(String a : X.split("")){
            arrX[Integer.parseInt(a)]++; 
        }

        for(String b : Y.split("")){
            arrY[Integer.parseInt(b)]++; 
        }

        for(int i=9; i>=0; i--){
            if(arrX[i]>0 && arrY[i]>0){
                int tmpInt = Math.min(arrX[i], arrY[i]);
                for(int j=0; j<tmpInt; j++){
                    sb.append(i);
                }
            }
        }

        if (sb.length()>0){
            answer = sb.charAt(0)=='0'? "0": sb.toString();
        } else {
            answer = "-1";
        }

        return answer;
    }
}


// K번째수

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int[] arr = new int[commands[i][1]-commands[i][0] + 1 ];
            int count=0;
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                arr[count]=array[j];
                count++;
            }
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
        }
        
        return answer;
    }
}