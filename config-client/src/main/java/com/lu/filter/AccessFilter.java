/*
package com.lu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

*/
/**
 * @CLassName AccessFilter
 * @Description TODO
 * @Author ll
 * @Date 2018/10/18 10:30
 **//*

public class AccessFilter extends ZuulFilter {
    private static Logger logger = LogManager.getLogger(AccessFilter.class);
    */
/*
     * @author ll
     * @Description 过滤器的类型， 它决定过滤器在请求的哪个生命周期中执行。 这里定义为pre, 代表会在请求被路由之前执行
     * @date 2018/10/18 10:30
     * @param []
     * @return java.lang.String
     *
     * pre: 可以在请求被路由之前调用。
     * routing: 在路由请求时被调用。
     * post: 在 routing 和 error 过滤器之后被调用。
     * error: 处理请求时发生错误时被调用。
     *//*

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    */
/*
     * @author ll
     * @Description 过滤器的执行顺序。 当请求在 一个阶段中存在多个过滤器时， 需要根据该方法返回的值来依次执行 order值越大，优先级越低
     * @date 2018/10/18 10:31
     * @param []
     * @return int
     *//*

    @Override
    public int filterOrder() {
        return 0;
    }
    */
/*
     * @author ll
     * @Description 判断该过滤器是否需要被执行。 这里我们直接返回了true, 因此该过滤器对所有请求都会生效。 实际运用中我们可以利用该函数来指定过滤器的
     *              有效范围
     * @date 2018/10/18 10:31
     * @param []
     * @return boolean
     *//*

    @Override
    public boolean shouldFilter() {
        return true;
    }
    */
/*
     * @author ll
     * @Description 过滤器的具体逻辑
     * @date 2018/10/18 10:31
     * @param []
     * @return java.lang.Object
     *//*

    @Override
    public Object run() {
        logger.info("filter");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            logger.warn("access token is empty");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(200);
            currentContext.setResponseBody("asda");
            return null;
        }
        logger.info("access token ok");
        return null;
    }
}
*/
