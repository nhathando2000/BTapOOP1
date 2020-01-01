package nhathando.com.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SanPham {
	private String ma;
	private String ten;
	private double gia;
	private String hanSuDung;
	/////////////////////////////////////////////////////////	
	public String getHanSuDung() {
		try
		{
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			String Hsd=sdf.format(hanSuDung);
			return Hsd;
		}
		catch(Exception ex)
		{
			return "Lỗi getter hsd";
		}
	}

	public void setHanSuDung(String hanSuDung) {
		try
		{
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			hanSuDung=sdf.format(hanSuDung);
			this.hanSuDung = hanSuDung;
		}
		catch(Exception ex)
		{
			System.out.println("Lỗi setter hsd");
		}
	}

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

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
	//////////////////////////////////////////////////////
	@Override
	public String toString() {
		String kq= "Danh sách sản phẩm: \n";
		kq+= "Mã SP: "+ma+"\n"+
				"Tên SP: "+ten+"\n"+
				"Giá SP: "+gia+"\n"+
				"Hạn sử dụng: "+hanSuDung+"\n"+
				"------------------------------";
		return kq;
	}
	////////////////////////////////////////////////////////
	public SanPham(String ma, String ten, double gia, String hanSuDung) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.hanSuDung = hanSuDung;
	}


}
