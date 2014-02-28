package log4;

import org.apache.log4j.*;
/**
 * 不使用配置文件，并输出到控制台
 * */
public class Test1 {
	static Logger log = Logger.getLogger(Test1.class.getName());

	public static void main(String args[]) {
		//为记录器添加一个Appender实例--默认设置方式
		BasicConfigurator.configure();
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
