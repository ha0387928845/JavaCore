package Th03;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs;
	private HocSinh hs;
		
	public QLHS() {
		dshs = new ArrayList<HocSinh>(100);
	}
	
	public void themHocSinh(HocSinh hs)	{
		dshs.add(hs);
	}
	
	public void nhapDanhSach(Scanner sc) {
		System.out.print("Nhập số học sinh cần nhập: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			hs.nhapThongTin(sc);
		}
	}
	
	public void inDanhSach() {
		for (HocSinh hocSinh : dshs) {
			hs.inThongTin();
		}
	}
	
	public void timKiemHocSinh(int namSinh, String queQuan) {
		for (HocSinh hocSinh : dshs) {
			if(hs.ngaySinh.getYear()==namSinh && hs.queQuan.equalsIgnoreCase(queQuan)) {
				hs.inThongTin();
			}
		}
	}
	
	public void timKiemHocSinh(String lop) {
		for (HocSinh hocSinh : dshs) {
			if(hs.getLop().equals(lop)) {
				hs.inThongTin();
			}
		}
	}
	
	public static void main(String[] args) {
		QLHS qlhs = new QLHS();
		Scanner sc = new Scanner(System.in);
		qlhs.nhapDanhSach(sc);
		qlhs.timKiemHocSinh(1985, "Thai Nguyen");
		qlhs.timKiemHocSinh("10A1");
	}

}
