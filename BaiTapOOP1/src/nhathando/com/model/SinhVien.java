package nhathando.com.model;

public class SinhVien {
	public SinhVien(String ma, String ten, double diem) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diem = diem;
	}
	public SinhVien() {
		super();
		System.out.println("Danh sách sinh viên là: ");
	}
	private String ma;
	private String ten;
	private double diem;
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		return "Mã:" + ma + "\n" + "Tên:" + ten + "\n" + "Điểm:" + diem
				+"\n------------------------------------";
	}
	
}
