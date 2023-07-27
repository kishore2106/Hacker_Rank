import java.util.*;
public class MatchingString {
    public static void matchingString(String[] str,String[] query){
        int[] arr=new int[query.length];
        for(int i=0;i<query.length;i++){
            for(int j=0;j<str.length;j++){
                if(query[i].matches(str[j])){
                   arr[i]+=1;
                    
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0,m=0;
        n=sc.nextInt();
        sc.nextLine();
        // System.out.println("Enter the string : ");
        String[] str=new String[n];
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        // System.out.println("Enter the number : ");
        m=sc.nextInt();
        sc.nextLine();
        // System.out.println("Enter the query string : ");
        String[] query = new String[m];
        for(int j=0;j<query.length;j++){
            query[j]=sc.nextLine();
        }
        matchingString(str,query);
        
        sc.close();
    }
    
}
