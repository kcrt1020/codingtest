// 점프와 순간 이동

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
//         for(int i=1; i<=n; i++){
//             int temp=i;
//             int loc=n;
            
//             while(loc>0){
//                 if(temp*2<loc){
//                     temp*=2;
//                     System.out.println(temp);
//                 }
//                 else {
//                     if(i==1){
//                         ans=loc-temp+i;
//                         System.out.println(loc-temp);
//                     }
//                     else{
//                         if(ans>loc-temp+i && 0<loc-temp+i) ans=loc-temp+i;
//                         System.out.println(loc-temp+i);
//                     }
//                     break;
//                 }
//             }
//             System.out.println("===");
//         }
        
        while(n != 0) {
            if(n%2==0){
                n/=2;
            }else{
                n--;
                ans++;
            }
        }

        return ans;
    }
}


// 구명보트

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int j=0;
        Arrays.sort(people);
       
        for(int i=people.length-1; i>=j; i--){
            if(people[i]+people[j]<=limit){
                j++;
            }answer++;
        }
        return answer;
    }
}