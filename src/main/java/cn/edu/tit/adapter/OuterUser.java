package cn.edu.tit.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/11
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "员工姓名");
        baseInfoMap.put("mobileNumber", "员工电话");
        return baseInfoMap;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("homeAddress", "员工家庭住址");
        homeInfoMap.put("homeTelNumber", "员工家庭电话");
        return homeInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfoMap = new HashMap();
        officeInfoMap.put("jobPosition", "员工工作职位");
        officeInfoMap.put("officeTelNumber", "员工办公电话");
        return officeInfoMap;
    }
}
