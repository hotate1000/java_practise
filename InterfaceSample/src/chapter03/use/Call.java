package chapter03.use;
import chapter03.used.Calculator;
import chapter03.used.SubCalc;


public class Call {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Calculator calculator = new AddCalc();
		Calculator calculator = new SubCalc();
		Integer result = calculator.calc(10, 5);
		System.out.println("計算結果は（" + result + "）です。");
	}

}