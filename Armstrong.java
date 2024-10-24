import java.util.*;
class Armstrong{
	public static void main(String[] args){
		int num,sum=0,rev,temp,temp1,digits=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any positive number:");
		num=sc.nextInt();
		temp=temp1=num;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		while(num>0)
		{
			rev=num%10;
			sum+=(Math.pow(rev,digits));
			num=num/10;
		}
		if(temp1==sum)
		{
			System.out.println(temp1+" is Armstrong number");
		}
		else
		{
			System.out.println(temp1+" is not Armstrong number");
		}
	}
}
