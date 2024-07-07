package baiTap;

import java.util.Scanner;

/**
 * Câu 3: Tính nhập vào số nguyên dương n với 2 ký số,
 * tính và xuất tổng 2 ký số của n
 */
public class Cau3 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ký số n1 = ");
		int n1 = scanner.nextInt();
		System.out.print("Ký số n2 = ");
		int n2 = scanner.nextInt();
		int n = n1 + n2;
		
		String ketQua = "Tổng là: " + n;
		System.out.println(ketQua);
	}
	
}
