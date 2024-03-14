package Th02;

public class Main {

	public static void main(String[] args) {
		Diem A = new Diem(1,0);
		Diem B = new Diem(3,0);
		Diem C = new Diem(0,4);
		
		TamGiac tg = new TamGiac(A,B,C);
		
		System.out.println("\t-----Tính chu vi và diện tích hình tam giác-----");
		System.out.printf("Diện tích: %.2f",tg.dienTich());
		System.out.printf("\nChu vi: %.2f",tg.chuVi());
	}

}
