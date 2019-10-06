package Java.DistantaCuvinte;

public class DistantaCuvinte {
    public static int Findhello(String str1, String str2, String big) {
        int index1 = 0;
        int result = -1;
        int index2 = 0;
        String[] strarr = big.split(" ");
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].contains(str1))
                index1 = i;
            if (strarr[i].contains(str2))
                index2 = i;
            else
                continue;
            if (index1 != 0 && index2 != 0)
                result = Math.abs((index2 - index1) - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        String big = "dog cat hello cat dog dog hello cat world";
        System.out.println(Findhello("hello", "world", big));
    }

}
