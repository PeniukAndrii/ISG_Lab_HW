package HW2.String;

import java.util.Arrays;

public class MainTree {
    public static void main(String[] args) {
        StringBuilder stringBuilder = fixString("         onE    oF the biGGest REASONS why    Java is SO poPular is the platform     independence.     PROGRAMS can run on several different types   OF COMPUTER; as long as THE    computer    has a    JaVa RUNtime environment (jRE) installed, a jAVA program CAN run oN it");
        System.out.println(stringBuilder);

    }

    public static StringBuilder fixString(String string){
        StringBuilder stringBuilder = new StringBuilder();
        String stringNoSpaces = string
                .replaceAll("\\s+", " ")
                .toLowerCase()
                .trim();
        String[] strings = stringNoSpaces.split(" ");
        for (String s : strings) {
            String stringDone = s.substring(0, 1).toUpperCase() + s.substring(1);
            stringBuilder
                    .append(stringDone)
                    .append(" ");
        }
        return stringBuilder;
    }
}
