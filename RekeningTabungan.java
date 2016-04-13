class RekeningTabungan{
	String noRek;
	String namaNasabah;
	String alamat;
	int saldo;
	
	void tampilData(){
		System.out.println("No. Rek = "+noRek);
		System.out.println("Nama Nasabah = "+namaNasabah);
		System.out.println("Alamat = "+alamat);
		System.out.println("Saldo Awal = "+saldo);
		System.out.println("Saldo Sekarang = "+saldo);
	}
	void tarik(int uang){
		saldo = saldo-uang;
	}
	void setor(int uang){
		saldo = saldo+uang;
	}
	public static void main(String[] args){
		RekeningTabungan rt1 = new RekeningTabungan();
		rt1.noRek = "54727367271";
		rt1.namaNasabah = "Khamdan";
		rt1.alamat = "Pasuruan";
		rt1.saldo = 200000;
		rt1.tarik(100000);
		rt1.tampilData();
		rt1.setor(500000);
		System.out.println("Saldo ditambah = 500000 ");
		System.out.println("Saldo Sekarang = "+rt1.saldo);
	}
}