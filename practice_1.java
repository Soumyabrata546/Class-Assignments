import java.util.Scanner;
//Armstrong program

class armstrong{
public static void main(String args[]){
System.out.println("Enter A number=");
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int temp=a;
int sum=0,mod;
for(int i=1;a!=0;i++){
mod=a%10;
sum+=mod*mod*mod;
a=a/10;
}
if(sum==temp){
System.out.print("Armstrong number");
}
else {
System.out.print("Not an armstrong");
}
}
}

//Factorial program

class fact{
public static void main(String args[]){
System.out.println("Enter A number=");
Scanner sc=new Scanner(System.in);
int fact=1;
int no=sc.nextInt();
for(int i=1;no!=0;i++){
fact=fact*no;
no--;
}
System.out.println("Result="+fact);
}
}

//Prime no program

class prime{
public static void main(String args[]){
System.out.println("Enter A number=");
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
int flag=0;
for(int i=2;i<=no/2;i++){
if(no%i==0)
flag=1;
break;
}
if(flag!=1)
System.out.println("A prime no");
else 
System.out.println("Not a prime");


}
}


//Leap year

class leap{
public static void main(String args[]){
System.out.println("Enter A year=");
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
if(no%4==0 && no%100!=0 || no%400==0){
System.out.println("Leap yaer");

}
else
System.out.println("Not a leap yaer");
}
}


