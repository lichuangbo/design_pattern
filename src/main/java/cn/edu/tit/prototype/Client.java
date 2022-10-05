package cn.edu.tit.prototype;

import java.util.Random;

/**
 * 不通过new关键字来产生对象，而是通过对象复制来的方式就是原型模式
 * @author lichuangbo
 * @version 1.0
 * @created 2020/5/6
 */
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        /*int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while (i < MAX_COUNT) {
            mail.setAppellation(getRandString(5) + " 先生(女士)");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            sendMail(mail);
            i++;
        }*/

        /*
         * 单线程发送邮件，当邮件数非常大时，耗时太长
         * 使用多线程发送，线程不安全，线程1还未发送出去，线程2启动就修改了
         * 可以添加线程同步，但是也可以使用本例的对象复制*/
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生(女士)");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！" + mail.getTail());
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
