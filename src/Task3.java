/**Напишите программу, чтобы перевернуть строку с помощью рекурсии. */

public class Task3 {
    public static void main(String[] args) {
        String str ="ABCDIFG";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        if (str.length() <= 1) {                       // Условие выхода из рекурсии
           return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
      }                //возвращает подстроку с определенного index    // получает символ по index
}
