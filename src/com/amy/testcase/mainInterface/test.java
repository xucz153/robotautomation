package com.amy.testcase.mainInterface;

import org.apache.log4j.Logger;

public class test {
	private static Logger logger = Logger.getLogger(test.class);
	
	public static void main(String[] args) {  
        // System.out.println("This is println message.");  

        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  
    }  

}
