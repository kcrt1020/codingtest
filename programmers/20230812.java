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