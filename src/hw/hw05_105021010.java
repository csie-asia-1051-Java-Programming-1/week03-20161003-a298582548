package hw;
/*
 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 * Date: 2016/10/03
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw05_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = 0;
		for(int i = 0 ; v1 > 0 ; v1--){
		v2 = v1*(v1+1)+v2;    
	    }
	     System.out.println(v2);

	  
	   

}
}
