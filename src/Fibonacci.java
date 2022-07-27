import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of fibonacci series :");
        int num= sc.nextInt();
        int a=0,b=1;
        if (num==1)
        {
            System.out.println("fibanocci series : "+a);
        } else if (num==2) {
            System.out.println("fibanocci series : "+a+" "+b);

        }else
        {
            System.out.print("finonacci series :"+a+" "+b);
            num=num-2;
            while(num>0){
                int c=a+b;
                a=b;
                b=c;
                num--;
                System.out.print(" "+c);
            }
        }

    }
}
