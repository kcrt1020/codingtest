import java.util.*;

// 배열 자르기

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // int position = num2-num1+1;
        // int[] answer = new int[position];
        // int j=0;
        // for(int i=0; i<numbers.length; i++){
        //     if(i>=num1 && i<=num2) {
        //         answer[j]=numbers[i];
        //         j++;
        //     }
        // }
        // return answer;

        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}


// 외계행성의 나이

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] arr = String.valueOf(age).split("");
        
        for(int i=0; i<arr.length; i++){
            answer+=((char)(Integer.parseInt(arr[i])+97));
        }
        return answer;
    }
}


// 진료 순서 정하기

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<answer.length; i++){
            answer[i]=1;
        }
        
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i]<emergency[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}


// 순서쌍의 개수
// 순서쌍의 개수는 약수의 개수와 같다
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }
} 