Что нового появилось в языке с каждой следующей версией

**Java 9**

1. Модули
2. [Try-with-resources](/docs/try.md)  (проверить, что именно нового?)
3. Diamond для анонимных классов 
4. Private методы в интерфейсах

**Java 10**

1. неявная типизация локальных переменных (использование var для объявления локальных переменных, при этом должна 
   быть явная инициализация)

**Java 11**

1. Неявная типизация в лямбда выражениях (аннотации, можно применять к локальным переменным и лямбда-формулам: 
   `@Nonnull var x = new Foo(); (@Nonnull var x, @Nullable var y) -> x.process(y))`
2. Обновление класса String - (новые методы `strip()`и `isBlank()` работают не только с пробелами, `repeat()`, `lines
   ()`)

**Java 14**

1. [Switch выражения](/docs/switch.md)

**Java 15**

1. [Текстовые блоки](/docs/textBloks.md)

**Java 16**

1. [Сопоставление с образцом для instanceof](/docs/instanceof.md)
2. Record 

**Java 17**

1. [Sealed клас](/docs/sealed.md)

полезные ссылки
https://docs.oracle.com/en/java/javase/23/language/java-language-changes.html#GUID-0DF89F53-9232-44E3-80A4-48DD0C2CF359
https://habr.com/ru/companies/jugru/articles/652821/
https://dzen.ru/a/Y1RzttU6iSw6OKNq
https://habr.com/ru/articles/593243/

