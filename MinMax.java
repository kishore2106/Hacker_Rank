import java.util.*;
public class MinMax {
    public void minMax(int[] arr){
        long sumMax=0,sumMin=0;
        for(int i=0;i<arr.length-1;i++){
            sumMin=sumMin+arr[i];
        }
        for(int i=1;i<arr.length;i++){
            sumMax=sumMax+arr[i];
        }
        System.out.print(sumMin+ " " +sumMax);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        MinMax m=new MinMax();
        m.minMax(arr);
    }
}
