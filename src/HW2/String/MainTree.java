package HW2.String;

public class MainTree {
    public static void main(String[] args) {
        String result = fixString("         onE    oF the biGGest REASONS why    Java is SO poPular is the platform     independence.     PROGRAMS can run on several different types   OF COMPUTER; as long as THE    computer    has a    JaVa RUNtime environment (jRE) installed, a jAVA program CAN run oN it");
        System.out.println(result);
    }

    public static String fixString(String string){
        String kek = "";
        String s2 = string
                .replaceAll("\\s+", " ")
                .toLowerCase()
                .trim();
        String[] strings = s2.split(" ");
        for (String s : strings) {
            String s3 = s.substring(0, 1)
                    .toUpperCase()
                    + s.substring(1);
            kek = kek.concat(s3 + " ");
        }
        return kek;
    }
}
