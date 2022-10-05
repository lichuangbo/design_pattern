package cn.edu.tit.ChainOfResponsibility;

import java.util.logging.Filter;
import java.util.logging.Logger;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2019/12/6
 */
public class Client {
    public static void main(String[] args) {
        Demand demandA = new DemandA(); // 请求等级低
        Demand demandB = new DemandB(); // 请求等级高

        Boss boss = new Boss();
        TechnicalManager technicalManager = new TechnicalManager();
        technicalManager.setNextHandler(boss); // 设置下一级

        technicalManager.handleMessage(demandA);
        System.out.println("============================");
        technicalManager.handleMessage(demandB);

        // JDK中的应用
//        Filter.doFilter
        /*
        if (!this.iter.hasNext()) {
            this.handler.handle(exchange);
        } else {
            Filter f = (Filter)this.iter.next();
            f.doFilter(exchange, this);
        }
         */

//        Logger logger = Logger.getLogger("");
//        logger.log();
        /*
        if (this.isLoggable(record.getLevel())) {
            Filter theFilter = this.config.filter;
            if (theFilter == null || theFilter.isLoggable(record)) {}
        }
         */
    }
}
