class Bintang{
	int n;
	
	void gambarPersegiPenuh(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void gambarPersegiKosong(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i == 0||i == 4||j == 0||j == 4){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	void gambarSegiTigaSiku(){
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void gambarSegiTigaSikuTerbalik(){
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		Bintang b = new Bintang();
		b.n = 5;
		b.gambarPersegiPenuh();
		b.gambarPersegiKosong();
		b.gambarSegiTigaSiku();
		b.gambarSegiTigaSikuTerbalik();
	}
}