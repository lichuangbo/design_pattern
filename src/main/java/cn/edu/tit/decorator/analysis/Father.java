package cn.edu.tit.decorator.analysis;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class Father {
    public static void main(String[] args) {
//        SchoolReport sr = new FourthGradeSchoolReport();
//        sr.report();

        /**
         * 情形1：汇报完最高成绩，直接要签名，怎么办？
         * 情形2：不看最高成绩，要先看排名，怎么办？
         *
         * 修饰条件排列组合，全都继承FourthGradeSchoolReport，去做扩展，类会非常多，显然不行
         * 当修饰的条件非常多时，继承会出现类爆炸
         */
        SchoolReport sr = new SugarFourthGradeSchoolReport();
        sr.report();
        sr.sign("张三");
    }
}
