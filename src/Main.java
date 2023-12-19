import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во диапазонов:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Введите диапазон в формате число-число:");
            String range = scanner.next();
            String[] number = range.split("-");
            int a = Integer.parseInt(number[0]);
            int b = Integer.parseInt(number[1]);

            if (b > a)
            {
                NumberRandom numrandom = new NumberRandom(a,b);
                System.out.print("Длина диапазона равна: ");
                System.out.println(numrandom.Length(a,b));
                System.out.print("Сгенерированное случайное число из диапазона: ");
                System.out.println(numrandom.Number(a,b));
            } else
            {
                System.out.println("Ошибка ввода диапазона, верхняя граница задана некорректно. Повторите ввод");
                n = n+1;
            }
        }
    }
}
