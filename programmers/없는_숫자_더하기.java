package programmers;

public class 없는_숫자_더하기 {
        public int solution(int[] numbers) {

            int num = 45;
            for (int i=0; i<numbers.length; i++) {
                num-=numbers[i];
            }

            return num;
        }
}
