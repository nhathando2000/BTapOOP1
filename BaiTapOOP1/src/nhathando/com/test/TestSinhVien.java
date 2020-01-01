package nhathando.com.test;

import nhathando.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {

		SinhVien sv= new SinhVien();
		sv.setMa("K184111444");
		sv.setDiem(9.5);
		sv.setTen("Đỗ Nguyễn Nhật Hàn");
		SinhVien sv1= new SinhVien();
		sv1.setMa("K184111445");
		sv1.setDiem(7.5);
		sv1.setTen("Vũ Quang Huy");
		SinhVien sv2= new SinhVien("K184111446","Nguyễn Ngọc Mình", 7.5);
		System.out.println(sv);
		System.out.println(sv1);
		System.out.println(sv2);
	}

}
