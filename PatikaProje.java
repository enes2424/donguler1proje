import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int num = input.nextInt(), count = 0, sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				sum += i;
				count++;
			}
		}
		double average = (double)sum / count;
		System.out.println("Ortalama -> " + average);
	}

}
