package cn.edu.tit.ChainOfResponsibility.analysis;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/8
 */
public class Women implements IWomen {
    private int type = 0;

    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type;
        this.request = _request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
