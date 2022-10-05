package cn.edu.tit.decorator.analysis;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/9
 */
public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        // 先汇报最高成绩，然后让家长看成绩单，紧接着汇报排名
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
