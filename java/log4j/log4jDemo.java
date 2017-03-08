/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logapp;
import org.apache.log4j.Logger;
/**
 *
 * @author cector
 */
public class LogApp {
    private static Logger log = Logger.getLogger(LogApp.class);

    /**
     * @param args the command line arguments
     * log4j的properties文件直接放置在src目录下，程序启动后加载jar包后直接读取
     */
    public static void main(String[] args) {
        // TODO code application logic here
        log.debug("This debug level Log!");
        log.info("This info level Log!");
        log.error("This error level Log!");
    }
}
