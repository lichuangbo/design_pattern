package cn.edu.tit.decorator.analysis;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class FourthGradeSchoolReport extends SchoolReport {
    @Override
    void report() {
        System.out.println("尊敬的xxx家长");
        System.out.println("....");
        System.out.println(" 语文 62 数学65 体育98 自然63");
        System.out.println("....");
        System.out.println("              家长签名：     ");
    }

    @Override
    void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
