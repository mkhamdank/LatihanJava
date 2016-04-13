class Lingkaran{
	float phi;
	float r;
	
	float hitungLuas(){
		float luas = phi*r*r;
		System.out.println("LUAS = "+luas);
		return luas;
	}
	float hitungKeliling(){
		float keliling = 2f*phi*r;
		System.out.println("KELILING = "+keliling);
		return keliling;
	}
	
	public static void main(String[] args){
		Lingkaran l1 = new Lingkaran();
		l1.phi = 3.14f;
		l1.r = 7;
		l1.hitungLuas();
		l1.hitungKeliling();
	}
}