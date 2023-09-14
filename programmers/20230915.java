// 세로 읽기

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        while(true){
            answer+=my_string.charAt(c-1);
            c=m+c;
            
            if(c>my_string.length()) break;
        }
        return answer;
    }
}

// 날짜 비교하기

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        if(date1[0]>date2[0]) return 0;
        else if(date1[0]<date2[0]) return 1;
        else if(date1[1]<date2[1]) return 1;
        else if(date1[1]>date2[1]) return 0;
        else if(date1[2]<date2[2]) return 1;
        else return 0;
    }
}


// 이차원 배열 대각선 순회하기

class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(i+j<=k) answer+=board[i][j];
            }
        }
        return answer;
    }
}