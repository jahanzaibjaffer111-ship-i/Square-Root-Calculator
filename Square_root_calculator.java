import java.util.Scanner;
public class Square_root_calculator
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Welcome to Square root Root Calculator");
        System.out.println();
        while(true)
        {
            System.out.println("Type Number");
            Double no=read.nextDouble();
            read.nextLine();
            System.out.println();
            if(no>=0)
            {
                double a=Math.pow(no,1.0/2);
                System.out.println("Square root of "+no+" is= "+a);
                System.out.println();
            }
            else if(no<0)
            {
                System.out.println("This Calculator don't support Negative Values");
                System.out.println("Try again");
                System.out.println();
            }
            System.out.println("Do you want to leave Square root Calculator then Type exit");
            System.out.println("If you want to Continue then Type anything to Restart");
            String ans=read.nextLine();
            System.out.println();
            if(ans.equalsIgnoreCase("exit"))
            {
                break;
            }
        }
    }
}