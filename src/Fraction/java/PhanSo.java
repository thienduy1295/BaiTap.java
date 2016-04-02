package Fraction.java;

public class PhanSo {
	int tu;
	int mau;
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		if(this.mau != 0){
			this.mau = mau;
		}
		else
			System.out.println("Mẫu không thể bằng 0");
	}
	public PhanSo(){
		setTu(0);
		setMau(1);
	}
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	PhanSo Cong(PhanSo b){
		PhanSo kq = new PhanSo();
		kq.setTu(this.getTu()*b.getMau()+this.getMau()*b.getTu());
		kq.setMau(this.getMau()*b.getMau());
		return kq;
	}
	PhanSo Tru(PhanSo b){
		PhanSo kq = new PhanSo();
		kq.setTu(this.getTu()*b.getMau()-this.getMau()*b.getTu());
		kq.setMau(this.getMau()*b.getMau());
		return kq;
	}
	PhanSo Nhan(PhanSo b){
		PhanSo kq = new PhanSo();
		kq.setTu(this.getTu()*b.getTu());
		kq.setMau(this.getMau()*b.getMau());
		return kq;
	}
	PhanSo Chia(PhanSo b){
		PhanSo kq = new PhanSo();
		kq.setTu(this.getTu()*b.getMau());
		kq.setMau(this.getMau()*b.getTu());
		return kq;
	}
	public int UCLN(int a,int b){
		while(a!=b){
			if(a>b){
				a=a-b;
			}
			else{
				b=b-a;
			}
		}
		return a;
	}
	public void Xuat(){
		if(this.getTu()%this.getMau()==0){
			System.out.println(this.getTu()/this.getMau());
		}
		else{
			System.out.println(this.getTu()+"/"+this.getMau());
		}
	}

	public PhanSo rutGon(){
		int ucln = UCLN(this.getTu(),this.getMau());
		this.setTu(this.getTu()/ucln);
		this.setMau(this.getMau()/ucln);
		return this;
	}
}
