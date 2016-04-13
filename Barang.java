class Barang{
	String kode;
	String namaBarang;
	int hargaDasar;
	float diskon;

	int hitungHargaJual(int hargaDasar){
		int diskonInt = Integer.valueOf(diskon);
		int hargaJual = hargaDasar-(diskonInt*hargaDasar);
		return hargaJual;
	}

	void tampilData(){
		System.out.println("Kode = "+kode);
		System.out.println("Nama Barang = "+namaBarang);
		System.out.println("Harga Dasar = "+hargaDasar);
		System.out.println("Diskon = "+diskon);
	}

	public static void main(String[] args){
		Barang kucing = new Barang();
		kucing.kode = "180497";
		kucing.namaBarang = "Kucing";
		kucing.diskon = 0.2f;
		kucing.hargaDasar = 200000;
		kucing.hitungHargaJual(200000);
		kucing.tampilData();
		System.out.println("Harga Jual = "+hargaJual);
	}
}