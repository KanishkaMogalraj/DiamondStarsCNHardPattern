import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
        
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i=1;
         int sp;
       
        if(n>0 && n<=50)
        {
            if(n%2!=0)
            {
           sp=n/2;
            while(i<=n)
            {
                int spaces=1;
                
                while(spaces<=sp)
                
            {
                    System.out.print(" ");
                    spaces++;
                    
                }
                int j=1;
                while(j<=i)
                {
                    System.out.print("*");
                    j++;
                }
                sp--;
                
                
                i=i+2;
                System.out.println();
            }
            int k=n-2;
            while(k>=1)
            {
                sp=sp+2;
                int spaces2=1;
                while(spaces2<=sp)
                {
                    System.out.print(" ");
                    spaces2++;
                }
                int g=1;
                while(g<=k)
                {
                    System.out.print("*");
                    g++;
                }
                k=k-2;
                System.out.println();
                sp--;
            
            }
        } 
        }
    }
	
}
