package hw;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw03_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = 1;
		for(int i = 0;v1 > 0;v1--){
		v2 = v1*v2;
		}
		System.out.print(v2);
		
		
		

	}

}
