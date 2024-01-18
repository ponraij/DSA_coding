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
	            for(int j=s;j<=e;j++){
	                System.out.print(a[j]);
	            }
	            System.out.print(" ");
	            e=s;
	        }
	    }
	    //System.out.println(s + " " +e);
	    for(int i=s-1;i<e;i++){
	        System.out.print(a[i]);
	    }
	    }
}