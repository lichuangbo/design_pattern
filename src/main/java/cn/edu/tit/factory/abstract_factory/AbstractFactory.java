package cn.edu.tit.factory.abstract_factory;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public abstract class AbstractFactory  {
    public abstract Mobile getMobile(String mobile);
    public abstract Computer getComputer(String computer);
}
