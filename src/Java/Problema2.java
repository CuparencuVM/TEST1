package Java;

public class Problema2 {
    public static String kj(String a) {
        String[] spl=a.split("\\s");
        for(int i=spl.length-1;i>=0;i--){
            System.out.print(spl[i]+"\t");
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(kj("A B C D E F"));
    }
}
