class Mahasiswa{
	private String nim;
	private String nama;
	private float ipk;
	private MataKuliah mk;
	
	public Mahasiswa(){
		}
	
	public Mahasiswa(String nim,String nama,float ipk,MataKuliah mk){
			this.nim = nim;
			this.nama = nama;
			this.ipk = ipk;
			this.mk = mk;
		}
	
	public void setNim(String nim){
			this.nim = nim;
		}
	
	public void setNama(String nama){
			this.nama = nama;
		}
		
	public void SsetIpk(float ipk){
			this.ipk = ipk;
		}
		
	public void setMk(MataKuliah mk){
			this.mk = mk;
		}
		
	public String getNim(){
			return nim;
		}
	
	public String getnama(){
			return nama;
		}
		
	public float getIpk(){
			return ipk;
		}
		
	public MataKuliah getMk(){
			return mk;
		}
	public void tampilData(){
			System.out.println("NIM = "+nim);
			System.out.println("Nama = "+nama);
			System.out.println("IPK = "+ipk);
			mk.tampilData();
		}
		
	public static void main(String[] argv){
			MataKuliah alpro = new MataKuliah("2021","Algoritma dan Pemrograman",4);
			Mahasiswa m = new Mahasiswa("1541180005","M. Khamdan K.",3.7f,alpro);
			m.tampilData();
		}
}
