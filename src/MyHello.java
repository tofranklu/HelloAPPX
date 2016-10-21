/**
 * Javadoc 文件註解
 * 
 * @author Frankie
 * @since 2016-10-13
 */

public class MyHello {

	public static void main(String[] args) {
//		System.out.println("TEST"); // system.out.println(); #1 單行註解
//		/*
//		 * 多行註解 byte b; b = 100;
//		 */
//		byte b2 = 100;
//		System.out.println(b2);
//
//		/*
//		 * float f = 3.14F; double d = 3.14; d = 1.2; System.out.println(d);
//		 */
//
//		long data = 1234567890123456L;
//
//		byte bb = 10;
//		int ii = 20;
//		ii = bb;
//
//		bb = (byte) ii;
//		boolean bn = true;
//		bn = false;
//
//		char cc = '\u3080';
//		System.out.println("cc=");
//		System.out.print(cc);
//
//		System.out.println("cc=" + cc + "welcome");
//
//		byte b$;
//		byte b_;
//		byte _b;
//
//		short s;
//		s = 8;
//
//		int i;
//		i = 6;
//
//		long L;
//		
//		int xx;
//		int a = 1, b = 2;
//		xx = a + b;
//		System.out.println("x + x = " + xx);
//		xx = 1 - 2;
//		System.out.println("xx = " + xx);
//		xx = 1 * 2;
//		System.out.println("xx = " + xx);
//		double dx = (double)1 / 2;
//		System.out.println("x / x = " + dx);
//		xx = 2 % 2;
//		System.out.println("x % x = " + xx);
		
		
//		
//		byte b1=1, bb2=2;	
//		byte b3 = b1 + bb2;		//Error !!!
		
//		int a=1, b=2, c;
//		System.out.println("a = " + a);
//
//		a += 1;
//		System.out.println("a += " + a);
//		
//		a++;
//		System.out.println("a++ = " + a);
//		
//		++a;
//		System.out.println("++a = " + a);
//		
//		int x = 1, y;
//		y = 1+ ++x ;
//		System.out.println("y = " + y);
//		System.out.println("x = " + x);
//		
//		int i = -1, j;
//		System.out.println("before , " +	Integer.toBinaryString(i)   );
//		j = i >>> 1;
//		System.out.println("j = " + j);
//		System.out.println("after , " +	Integer.toBinaryString(j)   );
//		
//		int grade = 61 ;
//		if( grade >= 60 ) {
//			System.out.println("PASS ");			
//		} else {
//			System.out.println("FAIL ");
//		}
//		
//		int a=3, b=2;
//		if(a > b) {
//			System.out.println(" > ");
//			
//			if(a < b) 
//				System.out.println("< ");
//			else
//				System.out.println("== ");
//						
//		}
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("Pls enter first number : ");
//		int score1 = sc.nextInt();
//		System.out.print("Pls enter second number : ");
//		int score2 = sc.nextInt();
//		
//		//System.out.println("score1 = " + score1);
//		//System.out.println("score2 = " + score2);
//		int temp = score1+score2;
//		System.out.print(score1 + " + " + score2 + " = " +  temp);
//		
//		
		int count = 0;
		char grade = 'A';
		char grade2 = 'C';
		switch (grade) {
			case 'A':
				System.out.println(">90"); count++;
			case 'B':
				System.out.println(">80"); ++count;
				break;
			case 'C':
				System.out.println(">70");	count+=10;
				break;
			default:
				System.out.println(">Error");
				break;	
		}
		System.out.println("count = " + count);
		
		for(int i=1; i<11; i++) {

		}
		//System.out.println( i ) ; //Compiler Error, can't resolve var i

	}
}
