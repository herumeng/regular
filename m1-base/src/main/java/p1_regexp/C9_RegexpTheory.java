package p1_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 特别分组
 */
public class C9_RegexpTheory {

    public static void main(String[] args) {
        C9_RegexpTheory regexpTheory = new C9_RegexpTheory();
        regexpTheory.regTheory();
    }

    private void regTheory() {
        String content = "何如梦同学  何如梦美女，何如梦漂亮哈哈哈";



//        找到 何如梦同学 、何如梦美女、何如梦漂亮 子字符串
        //String regStr = "何如梦同学|何如梦美女|何如梦漂亮";
        //上面的写法可以等价非捕获分组, 注意：不能 matcher.group(1)
        //String regStr = "何如梦(?:同学|美女|漂亮)";

        //找到 韩顺平 这个关键字,但是要求只是查找何如梦同学和 何如梦美女 中包含有的何如梦
        //下面也是非捕获分组，不能使用 matcher.group(1)
//        String regStr = "何如梦(?=同学|美女)";

        //找到 韩顺平 这个关键字,但是要求只是查找 不是 (何如梦同学 和 何如梦美女) 中包含有的何如梦
        //下面也是非捕获分组，不能使用 matcher.group(1)
        String regStr = "何如梦(?!同学|美女)";

        //创建 Pattern 对象时，指定 Pattern.CASE_INSENSITIVE，表示匹配是不区分字母大小写
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }

    }

}
