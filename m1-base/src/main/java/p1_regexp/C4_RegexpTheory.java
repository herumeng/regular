package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符匹配符的使用
 */
public class C4_RegexpTheory {

    public static void main(String[] args) {
        C4_RegexpTheory c4RegexpTheory = new C4_RegexpTheory();
        c4RegexpTheory.regTheory();
    }

    private void regTheory() {
        String content = "aa13c8a @ bcd ABC*";

//        String regStr = "[a-z]+"; // 没有带限定符，   匹配内容为a-z之间任意一个字符
//        String regStr = "[A-Z]+"; // 没有带限定符，   匹配内容为A-Z之间任意一个字符
//        String regStr = "abc"; // 匹配abc字符串，【默认区分大小写】
//        String regStr = "(?i)abc"; // 匹配abc字符串，加上(?i)【不区分大小写】
//        String regStr = "a(?i)bc"; // 匹配abc字符串，bc不区分大写
//        String regStr = "a((?i)b)c"; // 匹配abc字符串，只有b不区分大写
//        String regStr = "[0-9]"; // 匹配 0-9 之间的字符串
//        String regStr = "[^a-z]"; // 匹配 不在 a-z 之间的字符串
//        String regStr = "[^0-9]"; // 匹配 不在 0-9 之间的字符串
//        String regStr = "\\D"; // 匹配 不在 0-9 之间的字符串
//        String regStr = "\\w"; // 匹配 大小写英文字母、数字、下划线
//        String regStr = "\\W"; // 匹配  等价于[^0-9a-zA-Z_]
//        String regStr = "\\s"; // 匹配  任何空白字符
//        String regStr = "\\s"; // 匹配  任何 非 空白字符
        String regStr = "."; // .匹配  除\n意外的所有字符， 如果要匹配.本身则需要\\.

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));;
        }

    }

}
