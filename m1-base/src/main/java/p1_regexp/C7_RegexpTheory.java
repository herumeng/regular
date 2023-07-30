package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 定位符
 */
public class C7_RegexpTheory {

    public static void main(String[] args) {
        C7_RegexpTheory regexpTheory = new C7_RegexpTheory();
        regexpTheory.regTheory();
    }

    private void regTheory() {
        String content = "hanshunping hansphan nnhan";

        //String content = "123-abc";
        //以至少1个数字开头，后接任意个小写字母的字符串
        //String regStr = "^[0-9]+[a-z]*";
        //以至少1个数字开头, 必须以至少一个小写字母结束
        //String regStr = "^[0-9]+\\-[a-z]+$";

        //表示匹配边界的han[这里的边界是指：被匹配的字符串最后,
        // 也可以是空格的子字符串的后面]
        //String regStr = "han\\b";

        //和\\b的含义刚刚相反
        String regStr = "han\\B";

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));;
        }

    }

}
