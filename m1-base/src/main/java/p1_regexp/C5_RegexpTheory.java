package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 选择匹配符
 */
public class C5_RegexpTheory {

    public static void main(String[] args) {
        C5_RegexpTheory c5RegexpTheory = new C5_RegexpTheory();
        c5RegexpTheory.regTheory();
    }

    private void regTheory() {
        String content = "abc 何如梦 990 **@";

        String regStr = "[a-z]+|[0-9]+"; // | 选择匹配符

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));;
        }

    }

}
