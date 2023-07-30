package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 应用实例
 */
public class C11_RegexpInstance {

    public static void main(String[] args) {
        C11_RegexpInstance regexpTheory = new C11_RegexpInstance();
        regexpTheory.regTheory();
    }

    private void regTheory() {

        // 汉字
//        String content = "何如梦美女";
//        String regStr = "^[\u0391-\uffe5]+$";

        // 邮政编码
        // 要求：1.是1-9开头的一个六位数.  比如：123890
        //      2.
        //      3.
//        String content = "123890a";
//        String regStr = "^[1-9]\\d{5}$";

        // QQ号码
        // 要求:  是1-9开头的一个(5位数-10位数)  比如:  12389 , 1345687 , 187698765
//        String content = "187698765";
//        String regStr = "^[1-9]\\d{4,9}$";

        // 手机号码
        // 要求: 必须以13,14,15,18 开头的11位数 , 比如 13588889999
        String content = "18588889999";
//        String regStr = "^(?:13|14|15|18)\\d{9}$";
        String regStr = "^1[3|4|5|8]\\d{9}$";

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }

    }

}
