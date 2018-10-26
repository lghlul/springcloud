package com.lu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * @CLassName ErrorFilter
 * @Description TODO
 * @Author ll
 * @Date 2018/10/26 11:46
 **/
@Component
public class ErrorFilter extends ZuulFilter {

    private static Logger logger = LogManager.getLogger(ErrorFilter.class);
    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
       /* RequestContext ctx= RequestContext.getCurrentContext();
        Throwable throwable= ctx.getThrowable();
        logger.error("this is a ErrorFilter : {) ", throwable.getCause().getMessage());
        ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        ctx.set("error.exception", throwable.getCause());*/
        return null;
    }
}
