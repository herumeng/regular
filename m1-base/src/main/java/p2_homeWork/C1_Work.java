package p2_homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1_Work {

    public static void main(String[] args) {
        C1_Work work = new C1_Work();
        work.regTheory();
    }

    private void regTheory() {

        /**
         * 规定电子邮件规则为：
         * 1、只能有一个@
         * 2、@前边是用户名，可以是a-z A-Z 0-9 _ -字符
         * 3、@后面是域名，并且域名只能是英文字母，比如souhu.com 、daxunhua.cn
         * 4、写出对应的正则表达式，验证输入的字符串是否为满足规则
         */

        String content = "he-ru_meng@qq.com.cn";
//        content = "herumeng";

        String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";
//        String regStr = "(\\w|-)+";

        // String 的 matches是整体匹配，不带定位符 ^ $ 亦可
        if(content.matches(regStr)){
            System.out.println("满足规则");
        }else {
            System.out.println("不满足规则");
        }


    }

}
