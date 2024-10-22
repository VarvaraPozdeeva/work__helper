package com.glowbyte.from8to17;

public class TextBlocks {
	public static void main(String[] args) {
		String example = """
             Тут находится
                  какой-то
                       интересный
                  "текст"!
             К текущей строке приклеется \
             следующая из-за слэша \\ в конце
             Кавычки ' " не нужно экранировать
             но все еще нужно экранировать обратный слэш \\
             Форматирование,  %s, тоже поддерживается
        """;

		String newStr = example.formatted("как и с обычной строкой");
		System.out.println(newStr);
	}
}
