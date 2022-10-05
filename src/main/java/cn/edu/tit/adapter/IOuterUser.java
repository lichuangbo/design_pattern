package cn.edu.tit.adapter;

import java.util.Map;

/**
 * Adaptee源角色
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/11
 */
public interface IOuterUser {
    // 个人信息
    Map getUserBaseInfo();

    // 家庭信息
    Map getUserHomeInfo();

    // 工作信息
    Map getUserOfficeInfo();
}
