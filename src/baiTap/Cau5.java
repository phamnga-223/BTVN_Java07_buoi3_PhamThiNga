package baiTap;

import java.util.Scanner;

/**
 * Câu 5: Nhập vào độ C -> Đổi sang độ F 
 * F = (C x 1.8) + 32
 */
public class Cau5 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Xin hãy nhập vào độ C: ");
		double c = scanner.nextDouble();
		double f = c * 1.8 + 32;
		
		String ketQua = "Độ F là: " + f;
		System.out.println(ketQua);
	}
	
}
