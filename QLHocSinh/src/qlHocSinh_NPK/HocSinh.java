package qlHocSinh_NPK;

public class HocSinh {
	// Cac thuoc tinh theo yeu cau
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	// Cac ham tao 
	public HocSinh() {}
	
	
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}


	//Getter/Setter
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public short getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}


	@Override
	public String toString() {
		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
	
	
	
	
}
