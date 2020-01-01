package nhathando.com.test;

import nhathando.com.model.SanPham;

public class TestSP {

	public static void main(String[] args) {

		SanPham sp = new SanPham("SP01", "Xà phòng", 20.5, "12/12/2025");
		SanPham sp1 = new SanPham("SP02", "Dầu ăn", 22, "2025");
		System.out.println(sp);
		System.out.println(sp1);
	}

}
