package com.glowbyte.from8to17;


import lombok.AllArgsConstructor;
import lombok.Getter;

public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("Switch examples");
//		- можно склеивать несколько case  с одинаковыми действиями в одну строку с одним case
//		- новый синтаксис со стрелками, при этом break становится не нужным
//		- теперь это может быть выражением и результат будет присваиваться переменной
//		old version
//		- если мы делаем свитч по энаму то нет нет необходимости писать дефолтную ветку если используем все значения
		TestEnum value = TestEnum.A_VALUE;
		int res = 0;
		switch (value) {
		case A_VALUE:
			res = 1;
			break;
		case B_VALUE:
			res = 2;
			break;
		case C_VALUE:
			res = 3;
			break;
		case D_VALUE:
			res = 3;
			break;
		default:
			break;
		}
		System.out.println("Result = " + res);

//		new version
		int resNew = switch (value) {
			case A_VALUE -> 1;
			case B_VALUE -> 2;
			case C_VALUE, D_VALUE -> 3;
		};
		System.out.println("Result = " + resNew);


		int res2 = switch (value) {
			case A_VALUE -> 1;
			case B_VALUE -> throw new RuntimeException("Error!");
			case C_VALUE, D_VALUE -> {
				int val1 = 123;
				int val2 = 432;
//				return val2 + val1;
//				break;
				if (false) {
					throw new RuntimeException("Error2!");
				}
				yield val2 + val1;
			}
		};
		System.out.println("Result = " + res2);
	}

	@Getter
	@AllArgsConstructor
	enum TestEnum {
		A_VALUE("a"),
		B_VALUE("b"),
		C_VALUE("c"),
		D_VALUE("d");

		private final String val;
	}
}
