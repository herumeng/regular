package p2_homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3_Work {

    public static void main(String[] args) {
        C3_Work work = new C3_Work();
        work.regTheory();
    }

    private void regTheory() {

        /**
         * 对url进行解析
         * https://www.sohu.com:8080/abc/index.html
         * 1、要求得到的协议是：  https
         * 2、域名是：  www.sohu.com
         * 3、端口是：  8080
         * 4、文件名是：  index.html
         */

        String content = "https://www.sohu.com:8080/aaa/xxx////index.html";

//        String regStr = "(?<xieyi>http[s]?)://(?<yuming>([a-zA-Z]+.)+[a-zA-Z]+):(?<duankou>\\d+)/(([\\w-])+\\/)*(?<wenjian>[a-zA-Z]+\\.[a-zA-Z]+)";
        String regStr = "([a-zA-Z]+)://([\\w.]+):(\\d+)[\\w-/]*/([a-zA-Z.]+[a-zA-Z]+)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println("要求得到的协议是：" + matcher.group(1));
            System.out.println("域名是：" + matcher.group(2));
            System.out.println("端口是：" + matcher.group(3));
            System.out.println("文件名是：" + matcher.group(4));
        }

    }

}
