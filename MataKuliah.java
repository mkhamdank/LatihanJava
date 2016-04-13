class MataKuliah{
	private String kodeMK;
	private String namaMK;
	private int sks;
	
	public MataKuliah(){
		}
	
	public MataKuliah(String kodeMK,String namaMK,int sks){
			this.kodeMK = kodeMK;
			this.namaMK = namaMK;
			this.sks = sks;
		}
	
	public void setKodeMK(String kodeMK){
			this.kodeMK = kodeMK;
		}
	
	public void setNamaMK(String namaMK){
			this.namaMK = namaMK;
		}
	public void setSks(int sks){
			this.sks = sks;
		}
	public String getKodeMK(){
			return kodeMK;
		}
	public String getNamaMK(){
			return namaMK;
		}
	public int getSks(){
			return sks;
		}
	void tampilData(){
			System.out.println("Kode Mata Kuliah = "+kodeMK);
			System.out.println("Nama Mata Kuliah = "+namaMK);
			System.out.println("SKS = "+sks);
		}
}
