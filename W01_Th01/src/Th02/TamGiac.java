package Th02;

public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;
	private float AB;
	private float BC;
	private float CA;
	
	public TamGiac() {
		
	}
	
	public TamGiac(Diem A, Diem B, Diem C) {
		this.A = A;
		this.B = B;
		this.C = C;
		AB = A.kc(B);
		BC = B.kc(C);
		CA = C.kc(A);
	}
	
	public float dienTich() {
		float p = chuVi()/2; //Nửa chu vi
		float dt = (float)Math.sqrt(p*(p-AB)*(p-BC)*(p-CA)); //Diện tích
		
		return dt;
	}
	
	public float chuVi() {
		float cv = AB+BC+CA; //Chu vi
		return cv;
	}
}
