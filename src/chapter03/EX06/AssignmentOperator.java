package chapter03.EX06;

public class AssignmentOperator {
	public static void main(String[] args) {
		
			/*	대입 연산자의 축약 표현
			 * 
			 * 	산술 연산의 축약 표현
			 * 	a = a + b			a += b
			 * 	a = a - b			a -= b
			 * 	a = a * b			a *= b
			 * 	a = a / b			a /= b
			 * 
			 * 	비트 연산의 축약 표현	
			 * 	a = a & b			a &= b
			 * 	a = a | b			a |= b
			 * 	
			 * 	시프트 연산의 축약 표현
			 * 	a = a >> b			a >>= b
			 * 	a = a << b			a <<= b
			 * 	
			 * 	논리 시프트
			 * 	a = a >>> b			a >>>= b
			 * 
			 */
		
			int value1 = 3;
			value1 = value1 + 3;			//대입 연산자는 제일 나중에 적용
			System.out.println(value1);
			System.out.println("==================");
			
			int value2 = 3;
			value2 += 3;
			System.out.println(value2);
			System.out.println("======================");
			
			int value3 ;
			value3 = 1;
			System.out.println(value3 += 2);
			System.out.println(value3 -= 2);
			System.out.println(value3 *= 2);
			System.out.println(value3 /= 2);
			System.out.println(value3 %= 2);
			System.out.println(value3 <<= 2);
			System.out.println(value3 >>= 2);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
