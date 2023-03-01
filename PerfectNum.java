import java.util.Scanner;
class PerfectNum
{
public static void main(String[]args)
{
Scanner ab=new Scanner(System.in);
System.out.println("Enter a number");
int num=ab.nextInt();
int sum=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
sum=sum+i;
}
}
if(sum==num)
{
System.out.println("the num is a perfect num");
}
else{
System.out.println("the num is not a perfect num");
}
}
}