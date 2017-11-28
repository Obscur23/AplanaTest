import java.util.Scanner;

/**
 * @author Anton U.
 * Складываем два числа, выводим результат
 */
public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Инициализируем сканер
        System.out.println("First Digit");
        float first = in.nextFloat();
        //Ввод первого после подсказки
        System.out.println("Second Digit");
        float second = in.nextFloat();
        //Ввод второго после подсказки
        float result = first + second;
        //Считаем
        System.out.println("Summa");
        System.out.printf("%+.4f", result);
        //Вывод
    }
}
