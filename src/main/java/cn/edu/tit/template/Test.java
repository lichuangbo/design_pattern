package cn.edu.tit.template;

import javax.servlet.http.HttpServlet;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.AbstractList;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/5
 */
public class Test {
    public static void main(String[] args) {
        Employee developer = new Developer();
        developer.gotoWork();

        Employee hr = new Hr();
        hr.gotoWork();

        // JDK中的应用
//        httpServlet doXxx()默认发送不支持异常
//        String msg = lStrings.getString("http.method_post_not_supported");

//        AbstractList,AbstractSet  ArrayList的父类

//        InputStream, OutputStream, Reader, Writer
    }
}
