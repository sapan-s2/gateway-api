//package com.jlabs.filter;
//
//import com.netflix.hystrix.HystrixCommand;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Created by smita on 12/1/16.
// */
//@Configuration
//public class SimpleRouteFilter  extends ZuulFilter{
//
//
//
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 5;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return RequestContext.getCurrentContext().getRouteHost() != null
//                && RequestContext.getCurrentContext().sendZuulResponse();
//    }
//
//    @Override
//    public Object run() {
//        //between [0-20]
//        Object out = null;
//
////        final RequestContext context = RequestContext.getCurrentContext();
////        final String commandName = getCommandNameFromContext(context);
////
////        try {
////            final HystrixConfig dynamicConfig =
////                    hystrixDynamicConfigLoader.getDynamicConfig(commandName);
////
////            if (dynamicConfig == null ||
////                    dynamicConfig.getHystrixCommandProperties().getCircuitBreakerEnabled() == false) {
////                out = delegatedRunner();
////            } else {
////                final HystrixCommand<Object> hystrixCommand = build(dynamicConfig);
////                out = hystrixCommand.execute();
////            }
////
////        } catch (final Exception ex) {
////            context.set("error.status_code",
////                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
////            context.set("error.exception", ex);
////        }
//
//        return out;
//    }
//}
//
