package hw;
/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw02_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v2 =0;
		int v3 =0;
		int v4 =0;
		char checkChar;
		while(true){
		float v1 = scn.nextFloat();
		if(v1<0){
		v2++;
		}else if(v1>0){
		v3++;
		}else if(v1==0){
		v4++;
		}
		System.out.print("還想繼續打嗎?(y/n):");
		checkChar = scn.next().charAt(0);
		if(checkChar == 'n'|| checkChar =='N'){	
			System.out.println("正數有幾個:"+v3);
			System.out.println("負數有幾個:"+v2);
			System.out.println("0有幾個:"+v4);
		break;
		
		}
		
		}
		

	}
}


 