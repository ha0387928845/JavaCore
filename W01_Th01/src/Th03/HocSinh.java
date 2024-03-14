package Th03;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop;
	private String khoaHoc;
	private int kyHoc;
	
	public HocSinh(){
		
	}
	
	public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc) {
		super(hoTen,ngaySinh);
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}
	
	public HocSinh(String hoTen, String lop, String khoaHoc) {
		this.hoTen = hoTen;
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("Lớp: ");
		lop = sc.nextLine();
		System.out.print("Khóa học: ");
		khoaHoc = sc.nextLine();
		System.out.print("Kỳ học: ");
		kyHoc = sc.nextInt();
	}
	
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Lớp: "+lop);
		System.out.println("Khóa học: "+khoaHoc);
		System.out.println("Kỳ học: "+kyHoc);
	}
	
	public String getLop() {
		return lop;
	}
}
