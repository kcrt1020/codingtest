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


// 예상 대진표

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a!=b){
            a=(a+1)/2;
            b=(b+1)/2;
            answer++;
            System.out.println(a+" "+b);
        }

        return answer;
    }
}


// N개의 최소공배수

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        if (arr.length==1) return arr[0];
        
        int g=gcd(arr[0], arr[1]);
        answer = (arr[0]*arr[1])/g;
        
        if(arr.length>2){
            for(int i=2; i<arr.length; i++){
                g=gcd(answer,arr[i]);
                answer=(answer*arr[i])/g;
            }
        }
        return answer;
    }
    
    private static int gcd(int a, int b){
        int r = a%b;
        if(r==0) return b;
        else return gcd(b, r);
    }
}