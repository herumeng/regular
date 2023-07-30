package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 分组
 */
public class C8_RegexpTheory {

    public static void main(String[] args) {
        C8_RegexpTheory regexpTheory = new C8_RegexpTheory();
        regexpTheory.regTheory();
    }

    private void regTheory() {
        String content = "hanshunping hansphan nnhan11111111";

        //下面就是非命名分组
        //说明
        // 1. matcher.group(0) 得到匹配到的字符串
        // 2. matcher.group(1) 得到匹配到的字符串的第1个分组内容
        // 3. matcher.group(2) 得到匹配到的字符串的第2个分组内容

        //String regStr = "(\\d\\d)(\\d\\d)";//匹配4个数字的字符串

        //命名分组： 即可以给分组取名
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";//匹配4个数字的字符串

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
            System.out.println("第1个分组内容=" + matcher.group(1));
            System.out.println("第1个分组内容[通过组名]=" + matcher.group("g1"));
            System.out.println("第2个分组内容=" + matcher.group(2));
            System.out.println("第2个分组内容[通过组名]=" + matcher.group("g2"));
        }

    }

}
