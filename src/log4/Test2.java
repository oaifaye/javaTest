package log4;

import org.apache.log4j.*;

/**
 * 使用配置文件，并输出到日志文件
 * */

public class Test2 {
	static Logger log = Logger.getLogger(Test2.class.getName());

	public static void main(String args[]) {
		PropertyConfigurator.configure("src/log4/log4j.properties");

		// logging的各种方法
		log.debug("Start of main()");
		log.info("Just testing a log message with priority set to INFO");
		log.warn("Just testing a log message with priority set to WARN");
		log.error("Just testing a log message with priority set to ERROR");
		log.fatal("Just testing a log message with priority set to FATAL");
		// 另一种不方便的格式
		log.log(Priority.DEBUG, "Testing a log message use a alternate form");
		log.debug("End of main().");
	}
}
