package Array.java;

import java.util.ArrayList;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		Random rd = new Random();
		for(int i=0;i<a.length;i++){
			a[i] = rd.nextInt(100);
		}
		int count = a.length;
		for(int i =0;i<count-1;i++){
			for(int j=i+1;i<=count-1;i++){
				if(a[i]>a[j]){
					swap(a, i, j);
				}
			}
		}
		outPut(a);
	}
	static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void outPut(int[]a){
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]+"\t");
		}
		System.out.println("");
	}
}
