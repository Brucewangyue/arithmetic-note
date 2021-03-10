package rookie;

public class C01_printB {

    /**
     * 打印一个int类型的32位二进制
     * long 是64位二进制
     * @param num
     */
    private static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int num = -5;
//        print(num);

//        int num = Integer.MAX_VALUE;
//        print(num);

//        // 运算测试
//        int a = 12312;
//        int b = 9727827;
//
//        print(a);
//        print(b);
//        System.out.println("与运算：同时为1则1，其余为0");
//        print(a & b);
//        System.out.println("或运算：有一个为1则1，其余为0");
//        print(a | b);
//        System.out.println("亦或运算：同时为1则0，其余有1则1");
//        print(a ^ b);

        // 右移
//        int a = 1024;
//        print(a);
//        System.out.println("右移：带符号右移用符号位来补，不带符号位右移用0来补");
//        print(a >> 1);
//        int b = Integer.MIN_VALUE;
//        print(b >> 1);

        // 计算相反数
        int a = 5;
        int b = -a;
        int c = ~a +1;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        print(a);
        print(b);
  }
}
