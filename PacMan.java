class PacMan{
	int x;
	int y;
	
	void start(){
		x = 0;
		y = 0;
	}
	void kanan(int r){
		x = x+r;
	}
	void kiri(int l){
		x = x-l;
	}
	void atas(int a){
		y = y+a;
	}
	void bawah(int b){
		y = y-b;
	}
	void tampilPosisi(){
		System.out.println("Posisi pada x ="+x);
		System.out.println("Posisi pada y ="+y);
	}
	
	public static void main(String[] args){
		PacMan pacman1 = new PacMan();
		pacman1.start();
		pacman1.kanan(5);
		pacman1.kiri(2);
		pacman1.atas(4);
		pacman1.bawah(2);
		pacman1.tampilPosisi();
	}
}