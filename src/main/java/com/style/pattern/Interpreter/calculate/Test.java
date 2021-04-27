package com.style.pattern.Interpreter.calculate;

/**
 * @author leon
 * @date 2021-04-21 18:59:21
 */
public class Test {
	public static void main(String[] args) {
		Calculate calculate = new Calculate("3 + 5");
		Integer value = calculate.calculate();
		System.out.println("value: " + value);

		Calculate calculate1 = new Calculate("200 * 2 + 100 * 2 + 6");
		Integer value1 = calculate1.calculate();
		System.out.println("value1: " + value1);

		Calculate calculate2 = new Calculate("100 * 2 + 400 * 1 + 66");
		Integer value2 = calculate2.calculate();
		System.out.println("value2: " + value2);

		//jdk pattern
		//spring expressionParser
		//优点
		//1. 扩展性强 在解释器模式中由于语法是由很多类表示 当语法修改时 只需要修改对应的非终结表达式即可
		//若扩展 则增加对应的非终结表达式即可
		//2. 增加了新的解释表达式的方式
		//3. 易于实现文法 解释器对应的文法应当是比较简单且易于实现 过于复杂的不适合解释器模式
		//缺点
		//1. 语法规则复杂时 引起类膨胀
		//2. 执行效率低
	}
}
