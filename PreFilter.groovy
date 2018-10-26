import com.netflix.zuul.ZuulFilter
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import com.netflix.zuul.context.RequestContext
import javax.servlet.http.HttpServletRequest

class PreFilter extends ZuulFilter {

    Logger logger = LogManager.getLogger(PreFilter.class)

    @Override
    String filterType() {
        return "pre"
    }

    @Override
    int filterOrder() {
        return 1000
    }

    @Override
    boolean shouldFilter() {
        return true
    }
                
    @Override
    Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest()
        logger.info("this is a pre filter: Send{} request to{}",
                request.getMethod(),request.getRequestURL().toString())
        return null
    }
}