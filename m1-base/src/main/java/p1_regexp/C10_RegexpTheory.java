package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 非贪婪匹配
 */
public class C10_RegexpTheory {

    public static void main(String[] args) {
        C10_RegexpTheory regexpTheory = new C10_RegexpTheory();
        regexpTheory.regTheory();
    }

    private void regTheory() {
        String content = "hello111111, ooo";


//        String regStr = "\\d+"; //默认是贪婪匹配
        String regStr = "\\d+?"; //非贪婪匹配

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }

    }

}
