package Th03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, Date ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("\t-----Nhập thông tin-----");
		System.out.print("Họ tên: ");
		hoTen = sc.nextLine();
		System.out.print("Ngày sinh: ");
		ngaySinh = stringToDate(sc.nextLine());
		System.out.print("Quê quán: ");
		queQuan = sc.nextLine();
	}
	
	public Date stringToDate(String ngaySinh) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date ngaySinhDate = null;
		try {
			ngaySinhDate = formatter.parse(ngaySinh);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ngaySinhDate;
	}
	
	public void inThongTin() {
		System.out.println("\n\t-----Thông tin học sinh-----");
		System.out.print("Họ tên: "+hoTen);
		System.out.print("Ngày sinh: "+ngaySinh);
		System.out.print("Quê quán: "+queQuan);
	}
}
