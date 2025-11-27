import java.util.Scanner;
class Practical4{
public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.print("enter Number to check : ");
int num = s.nextInt();
int original = num;
int rem;
int result = 0;

while(num>0){
	rem = num%10;
	result += rem*rem*rem;
	num = num/10;
}
if(result == original){
System.out.println("It is an Armstrong number");
}else{
System.out.println("Not an Armstrong Number");
}
}
}