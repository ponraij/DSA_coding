import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] a=str.toCharArray();
        int n=str.length();
        int s=n-1;
        int e=n-1;
        for(int i=n-1;i>=0;i--){
            if(a[i]!=' ' ){
                s--;
            }
            else{
                for(int j=s+1;j<=e;j++){
                    System.out.print(a[j]);
                }
                System.out.print(" ");
                e = s-1;
                s = e;
            }
        }
        for(int j=s+1;j<=e;j++){
            System.out.print(a[j]);
        }
    }
}