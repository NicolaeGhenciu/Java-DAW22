package EJERCICIOS_CLASE;

public class Main {
		
		public static int sum(int i1, int i2) {
			int sum = 0;
			for (int i = i1; i <=i2; i++)
				sum +=i;
			return sum;
		}
		public static void main(String[] args) {
			System.out.println("Sum from 1 to is 10 is" + sum(1,10));
			System.out.println("Sum from 20 to is 30 is" + sum(20,30));
			System.out.println("Sum from 30 to is 40 is" + sum(30,40));
		}
}