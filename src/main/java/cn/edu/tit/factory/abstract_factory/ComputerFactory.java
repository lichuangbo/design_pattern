package cn.edu.tit.factory.abstract_factory;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/1
 */
public class ComputerFactory extends AbstractFactory {
    public Mobile getMobile(String mobile) {
        return null;
    }

    public Computer getComputer(String computer) {
        if (computer.equals("Dell")) {
            return new Dell();
        } else if (computer.equals("Lenovo")) {
            return new Lenovo();
        } else {
            return null;
        }
    }
}
