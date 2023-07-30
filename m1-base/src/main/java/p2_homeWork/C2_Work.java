package p2_homeWork;

public class C2_Work {

    public static void main(String[] args) {
        C2_Work work = new C2_Work();
        work.regTheory();
    }

    private void regTheory() {

        /**
         * 要求验证是不是整数或小数
         * 要求考虑正数和负数
         *   123  -345  34.89  -87.9  -0.01  0.45  -80
         */

        String content = "-0.89";
        String regStr = "[-+]?([1-9]\\d*|0)+(\\.\\d+)+";
        String regStrZZ = "\\d+";
        String regStrZX = "\\d+.\\d+";
        String regStrFZ = "-\\d+";
        String regStrFX = "-\\d+.\\d+";

        if(content.matches(regStr)) {
            if (content.matches(regStrZZ)) {
                System.out.println(content + "：为正整数");
            } else if (content.matches(regStrZX)) {
                System.out.println(content + "：为正小数");
            } else if (content.matches(regStrFZ)) {
                System.out.println(content + "：为负整数");
            } else if (content.matches(regStrFX)) {
                System.out.println(content + "：为负小数");
            }
        }else {
            System.out.println(content + "：不是数字");
        }

    }

}
