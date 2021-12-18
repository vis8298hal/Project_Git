import java.util.Scanner;
class PalindromeList{
	private int num=0;
	private int rev=0;
	public PalindromeList(int no){
	
			this.num=no;
			while(no!=0){
				int rem=no%10;
				this.rev=this.rev*10+rem;
				no=no/10;
			}
		
	}
	public void checkPalindrome(){
		if(this.num>=10){
			if(num==this.rev){
				System.out.println(this.num+" is Palindrome of "+this.rev);
			}
		}
	}
}
class Palindrome{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter lower limit : ");
		int ll=input.nextInt();
		System.out.print("Enter upper limit : ");
		int ul=input.nextInt();
		for(int i=ll;i<=ul;i++){
			PalindromeList pl=new PalindromeList(i);
			pl.checkPalindrome();
		}
	}
}