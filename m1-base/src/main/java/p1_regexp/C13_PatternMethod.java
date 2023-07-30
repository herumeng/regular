package p1_regexp;

import java.util.regex.Pattern;

public class C13_PatternMethod {

    public static void main(String[] args) {

        String content = "hello abc hello,哈哈哈";
//        String regStr = "hello";
        String regStr = "hello.*";

        boolean matches = Pattern.matches(regStr, content);
        System.out.println("是否整体匹配的上：" + matches);

    }

}
