package cn.edu.tit.adapter;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/11
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("员工姓名。。。");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工电话号码。。。");
        return null;
    }


    @Override
    public String getHomeAddress() {
        System.out.println("员工家庭住址。。。");
        return null;
    }

    @Override
    public String getHomeTelNum() {
        System.out.println("员工家庭电话。。。");
        return null;
    }


    @Override
    public String getJobPosition() {
        System.out.println("员工工作职位。。。");
        return null;
    }

    @Override
    public String getOfficeNumber() {
        System.out.println("员工办公室号码。。。");
        return null;
    }
}
