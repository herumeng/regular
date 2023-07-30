package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证url
 */
public class C12_RegexpURL {

    public static void main(String[] args) {
        C12_RegexpURL regexpTheory = new C12_RegexpURL();
        regexpTheory.regTheory();
    }

    private void regTheory() {

        // 验证url
        String content = "https://ww-w_.bilibili.com/video/BV1Eq4y1E79W/?p=17&spm_id_from=pageDriver&vd_source=7475531d64884c2e07a3dbc21c60dea0";
        String regStr = "^((http|https)://)(([\\w|-]+\\.)+[\\w|-]+)(\\/[\\w|-|/|?|=|.|&|/|%]*)";

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }

        System.out.println("该地址是否为正规链接：" + Pattern.matches(regStr, content));

    }

}
