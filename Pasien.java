class Pasien{
	String nama;
	String alamat;
	String jenis;
	
	void tampilData(){
		System.out.println("Nama = "+nama);
		System.out.println("Alamat = "+alamat);
		System.out.println("Jenis = "+jenis);
	}
	int hitungTotalBiaya(int totalBiaya){
		totalBiaya = hitungTarifDokter(0) + hitungTarifObat(0);
		System.out.println("Total Biaya = "+totalBiaya);
		return totalBiaya;
	}
	int hitungTarifDokter(int tarifDokter){
		if(jenis == "Umum"){
			tarifDokter = tarifDokter + 7500;
		}
		else if(jenis == "Asuransi"){
			tarifDokter = tarifDokter + 0;
		}
		System.out.println("Tarif Dokter = "+tarifDokter);
		return tarifDokter;
	}
	int hitungTarifObat(int tarifObat){
		if(jenis == "Umum"){
			tarifObat = tarifObat + 15000;
		}
		else if(jenis == "Asuransi"){
			tarifObat = tarifObat + 12000;
		}
		System.out.println("Tarif Obat = "+tarifObat);
		return tarifObat;
	}
	public static void main(String[] args){
		Pasien p1 = new Pasien();
		p1.nama = "Khamdan";
		p1.alamat = "Pasuruan";
		p1.jenis = "Umum";
		p1.tampilData();
		p1.hitungTotalBiaya(0);
	}
}