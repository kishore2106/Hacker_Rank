import java.util.*;
public class DivisibleSumOfPairs {
    
    public static int divisibleSumOfPairs(int n,int k,int[] arr){
        int  count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i<j){
                    if((arr[i]+arr[j])%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=divisibleSumOfPairs(n,k,arr);
        System.out.println(ans);
        sc.close();
    }
    
}
