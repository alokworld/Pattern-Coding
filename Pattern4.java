//Draw a reverse-stair with the help of '*'
//where number of stairs are given by user
//as input
import java.util.Scanner;
public class Pattern4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows");
        int n=sc.nextInt();
        int i, j, k;
        for(i=0;i<n;i++)
{
        /* mycodingnetwork.blogspot.com */
        for(j=0;j<(n-1-i);j++)
        System.out.print("  ");
        //In the above line, String contains two space
        for(k=0;k<=i;k++)
        System.out.print("* ");
        System.out.println();
}
}
}