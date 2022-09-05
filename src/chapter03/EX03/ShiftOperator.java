package chapter03.EX03;

public class ShiftOperator {
	public static void main(String[] args) {
		//산술 시프트 ( <<, >> ) 
		//	- 부호 비트는 고정되어 있다.
		//	- 대량의 계산을 빠르게 처리 할 수 있다.
		
		//<<	각 비트를 왼쪽으로 이동
		System.out.println( 3 << 1); 	//3*2^1   0011 -> 0110==6
		System.out.println(-2 << 1); 	//1000 0010 >1000 0100
		System.out.println(3 << 2);
		System.out.println(3 << 3);
		System.out.println(5 >> 1); 	//0101 > 0010 == 2
		System.out.println(5 >> 2); 	//0101 > 0001 == 1
		System.out.println("===========");
		
		//논리 시프트 ( >>> )
		System.out.println( 5 >>> 1 ); 	//0011 > 0001
		
		
		
		
		
		
		
		
		
	}
}
