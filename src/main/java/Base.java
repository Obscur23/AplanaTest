import javafx.scene.shape.Line;

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
        System.out.println("Operation: + - * /");
        String oper = in.next();
        //in.nextLine() работает некорректно, спасибо Stackoverflow
        //Ввод действия
        if (oper.equals("+")) {
             float result = first + second;
             System.out.println("Addition ");
             System.out.printf("%+.4f", result);
             //Считаем сумму
         }
         if (oper.equals("-")) {
            float result = first - second;
            System.out.println("Difference ");
            System.out.printf("%+.4f", result);
            //Считаем разность
        }
      }
}
