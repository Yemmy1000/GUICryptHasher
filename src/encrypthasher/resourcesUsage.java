/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypthasher;


    import java.lang.reflect.Modifier;
    import java.lang.management.RuntimeMXBean;
    import java.io.*;
    import java.net.*;
    import java.util.*;
    import java.io.LineNumberReader;
    import java.lang.management.ManagementFactory;
    import com.sun.management.OperatingSystemMXBean;
    import java.lang.management.ManagementFactory;
    import java.util.Random;

/**
 *
 * @author Life Learners Ltd
 */
public class resourcesUsage {

     public static void printUsage(Runtime runtime){
     long total, free, used;
     int mb = 1024*1024;

     total = runtime.totalMemory();
     free = runtime.freeMemory();
     used = total - free;
     System.out.println("\nTotal Memory: " + total / mb + "MB");
     System.out.println(" Memory Used: " + used / mb + "MB");
     System.out.println(" Memory Free: " + free / mb + "MB");
     System.out.println("Percent Used: " + ((double)used/(double)total)*100 + "%");
     System.out.println("Percent Free: " + ((double)free/(double)total)*100 + "%");
    }
     
     
    public static void log(Object message){
      System.out.println(message);
    }

    public static int calcCPU(long cpuStartTime, long elapsedStartTime, int cpuCount){
         long end = System.nanoTime();
         long totalAvailCPUTime = cpuCount * (end-elapsedStartTime);
         long totalUsedCPUTime = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()-cpuStartTime;
         //log("Total CPU Time:" + totalUsedCPUTime + " ns.");
         //log("Total Avail CPU Time:" + totalAvailCPUTime + " ns.");
         float per = ((float)totalUsedCPUTime*100)/(float)totalAvailCPUTime;
//             log( per);
         return (int)per;
    }


    
}
                    