// 나머지가 1이 되는 수 찾기

class Solution {
    public int solution(int n) {
        int x=1;
        while(n%x!=1)
            x++;
        return x;
    }
}