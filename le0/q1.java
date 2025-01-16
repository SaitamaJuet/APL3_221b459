import java.util.*; 
class q1 {
public static void main(String[] args)
{ 
Scanner sc = new Scanner(System.in);
System.out.println("enter the n = ");
int n = sc.nextInt(); 
for(int i =1;i<=n;i++)
{
for(int y=n-i ; y>0;y--)
{
System.out.print(" ");
}
for(int y=1;y<=i;y++)
{ 
System.out.print(y+" ");
}
System.out.print("\n");
}
for(int i=1;i<n;i++)
{ 
for(int y=1;y<=i;y++)
{
System.out.print(" ");
}
for(int y=1;y<=n-i;y++)
{ 
System.out.print(y);
}
for(int y=n-i-1;y>0;y--)
{ 
System.out.print(y);
}
System.out.print("\n");
}
}
}
