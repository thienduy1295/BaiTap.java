package TinhToan;

public class Math {
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
	
	public static boolean checkRelate_3(int n){
		for(int i=0;i<=n;i++){
			if(n%3==0||n%10==3||(n%3==0&&n%10==3)){
				return true;
			}
		}
		return false;
	}
}
