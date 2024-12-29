class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        for(int i=0; i<n/2+1; i++){
            if(a-b==1||b-a==1){
                if(Math.max(a,b)%2==0){
                    answer = i+1;
                }
            }
            if(a%2==0){
                a = a/2;
            }else{
                a = a/2+1;
            }
            if(b%2==0){
                b = b/2;
            }else{
                b = b/2+1;
            }
            
        }
        return answer;
    }
}