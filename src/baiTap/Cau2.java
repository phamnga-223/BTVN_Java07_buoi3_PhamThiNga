package baiTap;


/**
 * Câu 2: Tính giá trị đơn thức P(x)=ax^n (a: số thực, n: số nguyên không âm)
 * với x = 8 cho trước (sd thư viện Math)
 */
public class Cau2 {

	public static void main (String[] args) {
		// B1: Gán giá trị
		double a = 1.2;
		int x = 8; // x = 8 cho trước
		int n = 5;
		
		// B2: Tính giá trị đơn thức
		double p = a * Math.pow(x, n);
		
		// B3: In ra kết quả
		String ketQua = String.format("Giá trị đơn thức P(x) = %s", p);
		System.out.println(ketQua);
	}
	
}
