package baiTap;

import java.util.Scanner;

/**
 * Câu 2: Tính giá trị đơn thức P(x)=ax^n (a: số thực, n: số nguyên không âm)
 * với x cho trước (sd thư viện Math)
 */
public class Cau2 {

	public static void main (String[] args) {
		double a = 1.2;
		int n = 2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Giá trị x = ");
		int x = scan.nextInt();
		double p = a * Math.pow(x, n);
		
		String ketQua = String.format("Giá trị đơn thức P(x) = %s", p);
		System.out.println(ketQua);
	}
	
}
