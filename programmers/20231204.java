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
