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
		public double luongCoBan() {
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
}
