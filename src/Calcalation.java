import java.util.*;
class Calculation{
    public static void main(String[]arg){
        System.out.println("Введите операцию");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Введите числа через пробел");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        switch(str){
            case "+":
                System.out.print("Ответ " + (x1+x2));
                break;

            case "-":
                System.out.print("Ответ " +  (x1-x2));
                break;

            case "*":
                System.out.print("Ответ " + (x1*x2));
                break;

            case "/":
                if(x2==0)
                    System.out.print("Ошибка! Деление на ноль");
                else {
                    System.out.println("Ответ " + (x1 / x2));
                    if (x1 % x2 != 0)
                        System.out.print("Остаток от деления равен " + (x1 % x2));
                }
                break;

            default:
                System.out.print("Была введена неверная команда");
                break;

        }

    }
}
