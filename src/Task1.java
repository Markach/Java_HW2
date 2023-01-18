/*Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки). */

public class Task1 {
    public static void main(String[] args) throws Exception {
        String str1 = "The method returns 0 if the string is equal to the other string";
        String str2 = "The method returns 0 if the string is equal to the other string";
        strCompare(str1, str2);
        strEquals(str1, str2); 
    }
    
    public static void strCompare(String str1, String str2) {
        // str1.compareTo(str2);                 // сравнивает две строки, если равны возвращает 0
        if(str1.compareTo(str2) == 0) { 
            System.out.println("Строки равны");
        } else { 
            System.out.println("Строки не равны");
        }
    }

    public static void strEquals(String str1, String str2) {
        System.out.println(str1.equals(str2));    // сравнивает строки с учетом регистра, возвращает boolean
    }
}

