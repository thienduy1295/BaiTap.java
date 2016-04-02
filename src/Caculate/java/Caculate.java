package Caculate.java;

public class Caculate {
	// Ham kiem tra so nguyen to
	public static boolean checkSNT(int n){
		int count=0;
		for(int i = 1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count == 2){
			return true;
		}
		return false;
	}
	//Ham kiem tra so chua so 3 hoac chia het cho 3
	public static boolean checkRelate_3(int n){
		for(int i=0;i<=n;i++){
			if(n%3==0||n%10==3||(n%3==0&&n%10==3)){
				return true;
			}
		}
		return false;
	}
	//Ham kiem tra nam nhuan
	public static boolean checkNamNhuan(int n){
		if((n%4==0&&n%100!=0)||n%400==0){
			return true;
		}
		return false;
	}
	//Ham kiem tra so chinh phuong
	public static boolean checkSoChinhPhuong(int n){
		for(int i =1;i<=n;i++){
			if(i*i==n){
				return true;
			}
		}
		return false;
	}
	//Ham kiem tra so lap phuong
	public static boolean checkSoLapPhuong(int n){
		for(int i =1;i<=n;i++){
			if(i*i*i==n){
				return true;
			}
		}
		return false;
	}
	//Ham kiem tra so doi xung
	public static boolean checkSoDoiXung(int n){
		int soDu = 0;
		int soDao = 0;
		if(n<0){
			return false;
		}
		else{
			while (n > 0) {
				soDu = n % 10;
				soDao = soDao * 10 + soDu;
				n = n / 10;
			}
		}
		if(soDao == n){
			return true;
		}
		return false;
	}
	//So hoan thien
	public static boolean checkSoHoanThien(int n) {
		int i = 1;
		int tong = 0;
		do {
			if (n % i == 0) {
				tong = tong + i;
				i++;
			}
		} while (i <= n / 2);
		if (tong == n)
			return true;
		return false;
	}
	//Fibonacci
	public static int Fibonacci(int a) {
		int tong = 0;
		int star = 1;
		int i = 0, t;
		System.out.println("Tổng");
		do {
			System.out.print(" " + tong);
			t = tong;
			tong = tong + star;
			star = t;
			i++;
		} while (i < a);
		return 0;
	}


}
