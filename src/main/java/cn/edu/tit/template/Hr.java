package cn.edu.tit.template;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public class Hr extends Employee {
    protected void work() {
        System.out.println("回复邮件，预约面试");
    }

    @Override
    protected void comeToCompany() {
        System.out.println("开车来上班");
    }

    @Override
    protected void leaveCompany() {
        System.out.println("开车回家");
    }
}
