package com.longapi.core.utils;

import org.apache.juli.logging.Log;
import org.slf4j.Logger;
//import org.springframework.security.core.context.SecurityContextHolder;

public class LogUtil {
    public static final int LOG_BEGIN = 0;
    public static final int LOG_END = 1;
    public static void showLog(Logger logger, int type, String method, long startTime){
        String className = logger.getName().substring(logger.getName().lastIndexOf(".") +  1 );
        //"User: Long BEGIN Controller.findByName in 0.5s"
        logger.info("USER: "
                + (type == 0 ? " begin " : " end ")
                + className + "." + method
                + (type == 1 ? " in " + (System.currentTimeMillis() - startTime) + " ms" : ""));

        //        logger.info("USER: "
//                + SecurityContextHolder.getContext().getAuthentication().getName()
//                + (type == 0 ? " begin " : " end ")
//                + className + "." + method
//                + (type == 1 ? " in " + (System.currentTimeMillis() - startTime) + " ms" : ""));

    }



}
