/**Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().*/
public class Task6 {
    public static void main(String[] args) throws Exception{
        StringBuilder stringBuilder = Task4.createString(3, 56);
        System.out.println(stringBuilder);
        exchangeString2(stringBuilder, "=", "равно");
        System.out.println(stringBuilder);
    }

    public static StringBuilder exchangeString2(StringBuilder stringBuilder, String oldStr, String newStr) {
        int pos;
        while ((pos = stringBuilder.indexOf(oldStr)) != -1) {
            stringBuilder.replace(pos, pos+1, newStr);
        }
        return stringBuilder;
    }
}