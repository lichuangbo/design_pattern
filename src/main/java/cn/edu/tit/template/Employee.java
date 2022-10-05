package cn.edu.tit.template;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public abstract class Employee {
    public final void gotoWork() {
        comeToCompany();
        work();//具体工作无法确定，不同的员工有不同的工作
        leaveCompany();
    }

    protected void comeToCompany() {
        System.out.println("来到公司");
    }

    protected abstract void work();

    protected void leaveCompany() {
        System.out.println("回到家");
    }
}
