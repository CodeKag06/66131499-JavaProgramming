package qlHocSinh_NPK;

public class Run {

	public static void main(String[] args) {
		// 2.a Tao moi 2 hoc sinh, hard-core du lieu
		
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 = "Tran Van A";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 14;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "8A-12";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Nguyen Thi Khiem", (short) 12, "6B-5");

	}

}
