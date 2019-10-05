package Java;

public class Isbn {

    public static void main(String[] args) {

    }

    public static boolean Isbn (String numbers) {

        int i = numbers.length();
                if ( i != 10)
                    return false;

        numbers = numbers.replaceAll("-", ""); // inlocuim liniutele cu nimic
        for ( int i = 0 ; i < numbers.length() -1 ; i ++) {
            char a = numbers.charAt(i);
            int sum = 0;
         //   sum = Character.getNumericValue()







        }



    }


}
