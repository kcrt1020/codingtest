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