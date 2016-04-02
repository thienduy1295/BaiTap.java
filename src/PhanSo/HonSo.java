package PhanSo;

public class HonSo {
	int soNguyen;
	PhanSo ps;
	public HonSo(){
		this.soNguyen =0;
		this.ps.getTu();
		this.ps.getMau();
	}
	public HonSo(int soNguyen, PhanSo ps) {
		this.soNguyen = soNguyen;
		this.ps = ps;
	}
	public int getSoNguyen() {
		return soNguyen;
	}
	public void setSoNguyen(int soNguyen) {
		this.soNguyen = soNguyen;
	}
	public PhanSo getPs() {
		return ps;
	}
	public void setPs(PhanSo ps) {
		this.ps = ps;
	}
}
