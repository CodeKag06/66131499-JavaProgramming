package khangnp_quanlynhanvien;

public class NhanVien {
	// Thuộc tính
	private String maNv;
	private String hoTen;
	private double luongCoBan;
	//Hàm tạo
	public NhanVien() {
	
	}
	public NhanVien(String maNhanVien, String tenNhanVien, double luongCoBan) {
		this.maNv = maNhanVien;
		this.hoTen = tenNhanVien;
		this.luongCoBan = luongCoBan;
		
		//Các phương thức
		public double tinhLuong() {
			return luongCoBan;
		}
	}
	@Override
	public String toString() {
		return "NhanVien [maNv=" + maNv + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
}
