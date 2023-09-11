// 최소직사각형

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>=sizes[i][1]){
                if(w<sizes[i][0]) w=sizes[i][0];
                if(h<sizes[i][1]) h=sizes[i][1];
            }
            else{
                if(h<sizes[i][0]) h=sizes[i][0];
                if(w<sizes[i][1]) w=sizes[i][1];
            }
        }
        return w*h;
    }
}


// 숫자 문자열과 영단어

class Solution {
    public int solution(String s) {
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<num.length; i++){
            s=s.replace(num[i],Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}


// 두 개 뽑아서 더하기

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++){
            if(i==0 ||  numbers[i]!=numbers[i-1]){
                for(int j=i+1; j<numbers.length; j++){
                    if(answerList.isEmpty() || answerList.get(answerList.size()-1)!=numbers[i]+numbers[j]) 
                        answerList.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
// 1차

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
// 2차 set