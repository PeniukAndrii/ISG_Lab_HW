package String;


public class MainTree {
    public static void main(String[] args) {
        String string = fixString("         onE    oF the biGGest REASONS why    Java is SO poPular is the platform     independence.     PROGRAMS can run on several different types   OF COMPUTER; as long as THE    computer    has a    JaVa RUNtime environment (jRE) installed, a jAVA program CAN run oN it");
        System.out.println(string);

    }

    public static String fixString(String string){
        StringBuilder stringBuilder = new StringBuilder();
        String stringNoSpaces = string
                .replaceAll("\\s+", " ")
                .toLowerCase()
                .trim();
        String[] strings = stringNoSpaces.split(" ");
        for (String s : strings) {
            stringBuilder.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return stringBuilder.toString();
    }
}
