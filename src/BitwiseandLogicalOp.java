import java.util.Scanner;
public class BitwiseandLogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f,g,h;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value for a:");
		a=in.nextInt();
		System.out.println("Enter value for b:");
		b=in.nextInt();
		System.out.println("Enter value for c:");
		c=in.nextInt();
		System.out.println("Enter value for d:");
		d=in.nextInt();
		System.out.println("Enter value for e:");
		e=in.nextInt();
		System.out.println("Enter value for f:");
		f=in.nextInt();
		System.out.println("Enter value for g:");
		g=in.nextInt();
		System.out.println("Enter value for h:");
		h=in.nextInt();
		int p = a & b;
		int q = c & d;
		int r = e & f;
		int s = g & h;
		
		int w = a + d;
		int x = b + c;
		int y = g + h;
		int z = a + b;
		
		boolean t = w > x && y > z;
		boolean v = w < x && y > z;
		
		System.out.println("Entered values for Bitwise & and Logical & Operations:"+ a + b + c + d  + e + f + g + h);
		System.out.println("BitWise a&b:" + p);
		System.out.println("BitWise c&d:" + q);
		System.out.println("BitWise e&f:" + r);
		System.out.println("BitWise g&h:" + s);
		
		System.out.println("Values for Logical w:" + w);
		System.out.println("Values for Logical x:" + x);
		System.out.println("Values for Logical y:" + y);
		System.out.println("Values for Logical z:" + z);
		System.out.println("Boolean Logical t:" + t);
		System.out.println("Boolean Logical v:" + v);
	}

}
