/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypthasher;

import static encrypthasher.resourcesUsage.log;
import java.lang.management.ManagementFactory;

/**
 *
 * @author Life Learners Ltd
 */
public class cpuUsage {
    
    public static float calcCPU(long cpuStartTime, long elapsedStartTime, int cpuCount){
             long end = System.nanoTime();
             long totalAvailCPUTime = cpuCount * (end-elapsedStartTime);
             long totalUsedCPUTime = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()-cpuStartTime;
             //log("Total CPU Time:" + totalUsedCPUTime + " ns.");
             //log("Total Avail CPU Time:" + totalAvailCPUTime + " ns.");
             float per = ((float)totalUsedCPUTime*100)/(float)totalAvailCPUTime;
//             log( per);
             return per;
        }
    
        public static void log(Object message){
            System.out.println(message);
         }
}
