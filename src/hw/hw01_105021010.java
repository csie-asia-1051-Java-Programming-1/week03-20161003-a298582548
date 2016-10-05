package hw;
/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)
 * Date: 2016/10/03
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw01_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long v1 = scn.nextLong();
	    int v2 = 0;
		while(v1>0){
	    v1 = v1/10;
	    v2 = v2+1;	
		}
		System.out.print(v2);
		

	}

}
