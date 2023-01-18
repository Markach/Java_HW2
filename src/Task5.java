/*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt(). */

public class Task5 {
    public static void main(String[] args) throws Exception{
        StringBuilder stringBuilder = Task4.createString(3, 56);
        System.out.println(stringBuilder);
        exchangeString(stringBuilder, "=", "равно");
        System.out.println(stringBuilder);
    }

    public static StringBuilder exchangeString(StringBuilder stringBuilder, String oldStr, String newStr) {
        int pos;
        while ((pos = stringBuilder.indexOf(oldStr)) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, newStr);
        }
        return stringBuilder;
    }
}

