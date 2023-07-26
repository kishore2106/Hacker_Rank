import java.util.*;
public class Result {
    public static int[] breakingRecords(int[] arr){
        int[] res=new int[2];
        int max=arr[0];
        int min=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                res[0]++;
            }
            else if(arr[i]<min){
                min=arr[i];
                res[1]++;
            }
        }
        return res;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number of games played : ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=new int[2];
        res=breakingRecords(arr);
        for(int j=0;j<res.length;j++){
            System.out.print(res[j]+" ");
        }
        sc.close();
    }
    
}
