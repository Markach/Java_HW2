/*Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке). */
        
public class Task2 {
    public static void main (String[] args){
        String str1 ="AFGH";
        String str2 ="HGFA";
		System.out.println("The given strings are: "+str1+"  and  "+str2);
        if (checkForRotation(str1, str2)) {	
            System.out.println("\nStrings are rotations of each other");
        } else {	
            System.out.println("\nStrings are not rotations of each other");
        }
    }

    static boolean checkForRotation (String str1, String str2){
        String str3 = new StringBuilder(str2).reverse().toString();  // Перевернем строку, а затем сравним равны ли они
        return (str1.equals(str3));
    }
}