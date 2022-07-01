// https://programmers.co.kr/learn/courses/30/lessons/77484

package programmers;

public class 로또의_최고_순위와_최저_순위 {
        public int[] solution(int[] lottos, int[] win_nums) {
            int zero = 0;

            for (int i=0; i<lottos.length; i++){
                if (lottos[i]==0) {
                    zero++;
                }
            }

            int win = 0;

            for (int i=0; i<lottos.length; i++) {
                for (int j=0; j<win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        win++;
                    }
                }
            }

            int max = 7;
            int min = 0;

            for (int i=6; i>=0; i--) {
                if(win+zero==i){
                    max=max-i;
                }else if (win+zero==0){
                    max=6;
                }
            }

            if(max+zero>6){
                min=6;
            } else {
                min=max+zero;
            };

            int[] answer = {max, min};
            return answer;
        }
    }
