import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int dig=n%10;
            count+=1;
            n=n/10;
        }
        System.out.println(count);
    }
}
