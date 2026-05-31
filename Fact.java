import java.util.Scanner;
class Fact
{
  static int fact (int n)
  {
    int f=1;
    for (int i=1;i<=n;i++)
    {
      f=f*i;
    }
    return f;
  }
public static void main(String args[])
{
  Scanner S= new Scanner(System.in);
  System.out.println("enter the number to be computed");
  int n=S.nextInt();
  System.out.println("fact="+fact(n));
}
}
