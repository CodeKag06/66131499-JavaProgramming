package khangnp_quanlynhanvien;

public class NhanVien {
	// Thuộc tính
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	//Hàm tạo
	public NhanVien() {
	
	}
	public NhanVien(String maNhanVien, String tenNhanVien, double luongCoBan) {
		this.maNV = maNhanVien;
		this.hoTen = tenNhanVien;
		this.luongCoBan = luongCoBan;
	}
		//Các phương thức
		public double tinhLuong() {
			return luongCoBan;
		}
	@Override
	public String toString() {
		return "NhanVien [maNv=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	public void hienThiThongTin() {
		System.out.println("Mã NV: " + maNV);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Lương cơ bản: " + luongCoBan);
	}
	
	// getter/setter
	
	public double tingLuong() {
		return 0;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
}
