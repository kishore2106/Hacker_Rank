import java.util.*;

public class PlusMinus{
    double pos=0,neg=0,zer=0;
    public void plusMinus(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else{
                zer++;
            }
        }
        System.out.println(String.format("%.6f",pos/arr.length));
        System.out.println(String.format("%.6f",neg/arr.length));
        System.out.println(String.format("%.6f",zer/arr.length));
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        // System.out.println("Enter the array size : ");
        int n=s.nextInt();
        int[] array=new int[n];
        // System.out.println("Enter the array : ");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        PlusMinus d=new PlusMinus();
        d.plusMinus(array);
        s.close();
    
    }
}