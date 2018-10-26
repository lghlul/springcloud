import com.netflix.zuul.ZuulFilter
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import com.netflix.zuul.context.RequestContext
import javax.servlet.http.HttpServletResponse

class PostFilter extends ZuulFilter {

    Logger logger = LogManager.getLogger(PostFilter.class)

    @Override
    String filterType() {
        return "post"
    }

    @Override
    int filterOrder() {
        return 2000
    }

    @Override
    boolean shouldFilter() {
        return true
    }
                
    @Override
    Object run() {
        logger.info("this is a post filter: Receive response")
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse()
        response.getOutputStream().print(", I am zhaiyongchao")
        response.flushBuffer()
        return null
    }
}