import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       String str1 = in.nextLine(), str2 = in.nextLine();
       String temp = str1.concat(str1);
       if(temp.contains(str2))
       {
          System.out.println("Yes");
       }
       else
       {
          System.out.println("No");
       }
    }
}