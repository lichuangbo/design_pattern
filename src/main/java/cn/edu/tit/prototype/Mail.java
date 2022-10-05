package cn.edu.tit.prototype;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/6
 */
public class Mail implements Cloneable{
    private String receiver;

    private String subject;

    private String appellation;

    private String context;

    private String tail;

    // 实现clone接口，重写clone方法
    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
