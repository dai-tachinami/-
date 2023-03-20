package jp.co.fl.superintro.ch8;

import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int leftnum = (int)(Math.random()*9)+1;
			int rightnum = (int)(Math.random()*9)+1;
	
			System.out.println("****************");
			System.out.println("*  High & Low  *");
			System.out.println("****************");
		
			System.out.println("[問題表示]");
			System.out.println("*****   *****");
			System.out.println("*   *   *   *");
			System.out.println("* "+leftnum+" *   * * *");
			System.out.println("*   *   *   *");
			System.out.println("*****   *****");
			System.out.print("High   or   Low   ?(h/l)   >");
			String select = sc.nextLine();
			
			if(select.equals("h")) {
				System.out.println(" →Highを選択しました。 ");
			}else if(select.equals("l")) {
				System.out.println(" →Lowを選択しました。 ");
			}
			
			System.out.println("[結果表示]");
			System.out.println("*****   *****");
			System.out.println("*   *   *   *");
			System.out.println("* "+leftnum+" *   * "+rightnum+" *");
			System.out.println("*   *   *   *");
			System.out.println("*****   *****");
			String result = null;
			
			if(leftnum < rightnum) {
				result = "h";
			}else if(leftnum > rightnum) {
				result = "l";
			}else{
				result = select;				
			}
			
			if(select.equals(result)) {
				System.out.println("→You Win!");
			}else{
				System.out.println("→You Lose...");
				break;
				
			}
			
			System.out.println("--ゲーム終了--");
			
		}
	}
}

