//Draw a reverse-stair with the help of '*'
public class Pattern3 {
  public static void main(String args[])
   {
     int n=8;
  for(int i=1;i<=n;i++) 
  {
    /*mycodingnetwork.blogspot.com*/
      for(int j=1;j<=(n-i);j++)
      System.out.print("  ");
     for(int k=1;k<=i;k++)
     System.out.print("* ");
     System.out.println();
  }
  //Number of rows can be changed
  //by changing the value of n  
 }
}