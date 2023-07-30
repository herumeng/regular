package p1_regexp;

/**
 *
 */
public class C17_StringRegexp {

    public static void main(String[] args) {
        C17_StringRegexp regexpTheory = new C17_StringRegexp();
        regexpTheory.regTheory();
    }

    private void regTheory() {

        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其" +
                "获得了Apple公司Mac OS X的工业标准的支持。2001年9月24日，J2EE1.3发" +
                "布。2002年2月26日，J2SE1.4发布。自此Java的计算能力有了大幅提升";

        //使用正则表达式将JDK1.3、JDK1.4替换成JDK
//        String s = content.replaceAll("JDK1.3|JDK1.4", "JDK");
        String s = content.replaceAll("JDK(1.3|1.4)", "JDK");
        System.out.println(s);

        //要求验证一个手机号   要求138、139开头
        content = "13888889999";
        if(content.matches("13(8|9)\\d{8}")){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }

        //要求按照 # 或者 - 或者 ~ 或者 数字 来分割
        content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s1 : split) {
            System.out.println(s1);
        }

    }

}
