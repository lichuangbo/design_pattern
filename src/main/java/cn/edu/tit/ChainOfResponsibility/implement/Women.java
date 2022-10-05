package cn.edu.tit.ChainOfResponsibility.implement;

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
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + _request;
                break;
            case 2:
                this.request = "妻子的请求是：" + _request;
                break;
            case 3:
                this.request = "母亲的请求是：" + _request;
                break;
            default:
                break;
        }
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
