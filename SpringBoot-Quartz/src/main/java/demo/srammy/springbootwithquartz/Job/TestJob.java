package demo.srammy.springbootwithquartz.Job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

@DisallowConcurrentExecution    //设置任务能否并行执行，加注解则不能
public class TestJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("*********计划任务开始执行**********");
        JobDataMap dataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String param = dataMap.getString("test");//获取参数
        System.out.println(param);
        JobDataMap tdataMap = jobExecutionContext.getTrigger().getJobDataMap();
        String param1 = tdataMap.getString("test1");
        System.out.println(param1);
        System.out.println("*********计划任务结束执行**********");
        System.out.println(new Date().getTime());
    }
}
