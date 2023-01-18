/*Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
Используем метод StringBuilder.append(). */

public class Task4 {
    public static void main(String[] args) throws Exception{
        StringBuilder stringBuilder = createString(3, 56);
        System.out.println(stringBuilder);
    }

    public static StringBuilder createString(int x, int y) {
        StringBuilder result = new StringBuilder();
        result.append(x).append(" + ").append(y).append(" = ").append(x + y).append("\n")
        .append(x).append(" - ").append(y).append(" = ").append(x - y).append("\n")
        .append(x).append(" * ").append(y).append(" = ").append(x * y);
        return result;
    }
}
