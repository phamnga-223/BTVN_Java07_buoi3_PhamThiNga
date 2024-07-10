package baiTap;

import java.util.Scanner;

/**
 * Câu 3: Tính nhập vào số nguyên dương n với 2 ký số,
 * tính và xuất tổng 2 ký số của n
 */
public class Cau3 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		// B1: Nhập vào số n
		System.out.print("Xin vui lòng nhập vào số n: ");
		int n = scanner.nextInt();
		
		// B2: Kiểm tra số n
		if (n >= 100 || n <= 9) {
			System.out.println("Số nhập vào phải là số có 2 chữ số!");
			return;
		}
		
		// B3: Tách lấy 2 ký số và tính tổng
		int a1 = n / 10; int a2 = n % 10;
		int tong = a1 + a2;
		
		// B4: In ra kết quả
		String ketQua = "Tổng là: " + tong;
		System.out.println(ketQua);
	}
	
}
