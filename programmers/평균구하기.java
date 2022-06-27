package programmers;

public class 평균구하기 {
    public double solution(int[] arr) {

        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }
}
