package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex05_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int pEn = scn.nextInt();
		float aPple = pEn%2 ;
		if(aPple==0){
		System.out.print("是偶數");
		}else{
		System.out.print("是奇數");
		}

	}

}
