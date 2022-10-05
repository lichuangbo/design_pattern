package cn.edu.tit.adapter;

import java.util.Map;

/**
 * 中转类
 * Adapter适配器角色：通常采用继承或实现方式，和目标角色挂钩
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/11
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();

    private Map homeInfo = super.getUserHomeInfo();

    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String userName = (String) baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }


    @Override
    public String getHomeAddress() {
        String homeAddress = (String) homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getHomeTelNum() {
        String homeTelNumber = (String) homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }


    @Override
    public String getJobPosition() {
        String jobPosition = (String) officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getOfficeNumber() {
        String officeTelNumber = (String) officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
}
