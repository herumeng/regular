package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3_RegexpTheory {

    public static void main(String[] args) {
        C3_RegexpTheory c3RegexpTheory = new C3_RegexpTheory();
        c3RegexpTheory.regTheory();
    }

    private void regTheory() {
        String content = "abc$(a.bc(123(";

        //匹配( =>  \\(
        //匹配. =>  \\.
        //匹配( =>  \\(
//        String regStr = "\\.";
//        String regStr = "\\d\\d\\d";
        String regStr = "\\d{3}";
//        String regStr = "\\(";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));;
        }

    }

}
