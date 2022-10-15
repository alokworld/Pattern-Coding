//Draw a stair with the help of '*'
public class Pattern2 {
    public static void main(String args[]) {
        int n=10;// The number of steps in stair
     for(int i=1;i<=n;i++) //The rows can be changed by changing the value of n
     {
         for(int j=1;j<=i;j++)
         System.out.print("* ");
         System.out.println();
     }  
    }
}