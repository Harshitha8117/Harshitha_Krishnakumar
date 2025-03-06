import java.util.*;
public class rev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String sum="";
        int count=0;
        char a[]=str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            sum+=a[i];
        }
        char b[]=sum.toCharArray();
        for(int i=0;i<b.length;i++){
            if(a[i]==b[i]){
                count+=1;
            }
        }
        if(count==sum.length()){
            System.out.print("palindrome");
        }
        else{
            System.out.print("Not");
        }
    }
}