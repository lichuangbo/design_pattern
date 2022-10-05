package cn.edu.tit.adapter;

/**
 * Target目标角色：正在系统中运行，不大可能会修改了
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/11
 */
public interface IUserInfo {
    // 个人
    String getUserName();

    String getMobileNumber();

    // 家庭
    String getHomeAddress();

    String getHomeTelNum();

    // 工作
    String getJobPosition();

    String getOfficeNumber();
}
