package com.lu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.netflix.zuul.util.ZuulRuntimeException;
import org.springframework.stereotype.Component;


/**
 * @CLassName ThrowExceptionFilter
 * @Description TODO
 * @Author ll
 * @Date 2018/10/26 10:36
 **/
@Component
public class ThrowExceptionFilter extends ZuulFilter {

    private static Logger logger = LogManager.getLogger(ThrowExceptionFilter.class);

    @Override
    public String filterType() {
        return  "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        logger.info("This is a pre filter, it will throw a RuntimeException");
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            doSomething();
           int i = 1/0;
        } catch (Exception e) {
            throw new ZuulRuntimeException(e);
        }
        return null;
    }

    private void doSomething(){
         throw new RuntimeException("Exist some errors...");
    }
}
