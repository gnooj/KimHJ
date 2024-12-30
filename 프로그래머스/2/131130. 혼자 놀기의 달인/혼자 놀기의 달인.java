import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int answer = 1;
        int cLen = cards.length;
        boolean[]  visit = new boolean[cLen];
        int Tcount =0;
        int result [] =new int[cLen];
        
       
        
        for(int i=0; i<cLen; i++){
            int idx = i;
             int count =0;
            if(cards[idx]!=idx+1){
            visit[i] = true;    
            }
            
        while(true){
            if(visit[cards[idx]-1]){
                break;
            }else{
                visit[cards[idx]-1] = true;
            idx = cards[idx]-1;
            count++;
            }
            if(idx+1==cards[idx]){
                count=1;
            }
            
        }
            

            System.out.print("count = "+count);
            if(count>0){
                Tcount++;
                result[i] = count;
            }
        }
        
        if(Tcount<2){
            answer = 0;
        }else{
            Arrays.sort(result);
            // System.out.print(result[cLen-1]);
            if(result[cLen-1]!=1&&result[cLen-2]!=1){
            answer = (result[cLen-2]+1)*(result[cLen-1]+1);    
            }else{
                answer = 1;
            }
            
        }
        return answer;
    }
}