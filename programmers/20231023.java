// 멀리 뛰기

class Solution {
    public long solution(int n) {
        long[] d = new long [n+1];
        
        if(n==1) return 1;
        if(n==2) return 2;
        
        d[0]=0;
        d[1]=1;
        d[2]=2;
        
        for(int i=3; i<=n; i++){
            d[i]=(d[i-1]+d[i-2]) % 1234567;
        }
        
        return d[n];
    }
}   // 피보나치


// 귤 고르기

class Solution {
    public int solution(int k, int[] tangerine) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine){
            map.put(t, map.getOrDefault(t,0)+1);
        }
        
        for(Integer key:map.keySet()){
            pq.add(map.get(key));
        }
        
        int count=0;
        while(k>0){
            if(pq.peek()>k){
                pq.poll();
                count++;
                break;
            }else{
                k-=pq.poll();
                count++;
            }
        }
        
        return count;
    }
}


// 연속 부분 수열 합의 개수

class Solution {
    public int solution(int[] elements) {
        Set<Integer> ans = new HashSet<>();
        
        for(int i=1; i<=elements.length; i++){
            for(int j=0; j<elements.length; j++){
                int sum=0;
                for(int k=0; k<i; k++) {
                    if(j+k>elements.length-1){
                        sum+=elements[j+k-elements.length];
                    }else{
                        sum+=elements[j+k];
                    }
                }
                ans.add(sum);
            }
        }
        return ans.size();
    }
}