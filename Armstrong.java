import java.util.Scanner;
class NumAr{
	private int num=0;
	private int leng=0;
	public NumAr(int no){
		this.num=no;
		while(no!=0){
			no=no/10;
			this.leng+=1;
		}
	}
	public void checkArm(){
		int t1=this.num;
		int summ=0;
		while(t1!=0){
			int rem=t1%10;
			int res=1;
			for(int i=1;i<=this.leng;i++){
				res=res*rem;
			}
			summ=summ+res;
			t1=t1/10;
		}
		if(summ==this.num){
			System.out.println("Armstrong is "+this.num);
		}
	}
}
class Armstrong{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the lower limit : ");
		int ll=input.nextInt();
		System.out.print("Enter the Upper limit : ");
		int ul=input.nextInt();
		for(int i=ll;i<=ul;i++){
			NumAr nar = new NumAr(i);
			nar.checkArm();
		}
	}
}