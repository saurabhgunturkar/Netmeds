// package utils;

// import java.io.File;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// import org.apache.log4j.Logger;
// import org.apache.log4j.PatternLayout;
// import org.apache.log4j.RollingFileAppender;

// public class LoggerHandler {

//     public static Logger logger = Logger.getLogger(LoggerHandler.class);

//     static {
// 		try {

// 			File logsDir = new File("logs");
// 			if (!logsDir.exists()) {
// 				logsDir.mkdirs();
// 			}

// 			String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
// 			String logFileName = "src/logs/logfile-" + date + ".log";

// 			RollingFileAppender fileAppender = new RollingFileAppender();
// 			fileAppender.setFile(logFileName);
// 			fileAppender.setMaxFileSize("10MB");
// 			fileAppender.setMaxBackupIndex(10);
// 			fileAppender.setLayout(new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} [%p] %c %M - %m%n"));
// 			fileAppender.setAppend(true);
// 			fileAppender.activateOptions();

// 			Logger.getRootLogger().addAppender(fileAppender);
// 		} catch (Exception e) {
// 			logger.error("Failed to add appender to logger", e);
// 		}
// 	}

//     public static void fatal(String message){
//         //Represents a critical error that causes the application to stop functioning and requires immediate attention.
//         logger.fatal(message);
//     }

//     public static void trace(String message){
//         //Captures the most detailed information about a program's execution, including function calls and data flow, primarily used for in-depth debugging.
//         logger.trace(message);
//     }

//     public static void error(String message){
//         //Signals a significant problem that affects application functionality but may not necessarily stop execution.
//         logger.error(message);
//     }

//     public static void debug(String message){
//         //Provides detailed information about the application's state, useful for pinpointing specific issues during development.
//         logger.debug(message);
//     }

//     public static void info(String message){
//         logger.info(message);
//     }

//     public static void warn(String message){
//         //Indicates a potential issue that may not be critical but warrants monitoring and investigation
//         logger.warn(message);
//     }


    
// }
