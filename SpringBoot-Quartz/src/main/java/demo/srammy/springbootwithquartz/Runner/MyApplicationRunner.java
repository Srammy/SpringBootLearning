package demo.srammy.springbootwithquartz.Runner;

import demo.srammy.springbootwithquartz.Job.ScheduleManager;
import demo.srammy.springbootwithquartz.Job.TestJob;
import demo.srammy.springbootwithquartz.utils.Constants;
import demo.srammy.springbootwithquartz.utils.StringUtils;
import org.quartz.CronExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    private final static Logger LOGGER = LoggerFactory.getLogger(MyApplicationRunner.class);

    @Autowired
    private ScheduleManager scheduleManager;

    @Value("${quartz.jobType}")
    private String jobType;
    @Value("${quartz.jobName}")
    private String jobName;
    @Value("${quartz.jobGroupName}")
    private String jobGroupName;
    @Value("${quartz.triggerName}")
    private String triggerName;
    @Value("${quartz.triggerGroupName}")
    private String triggerGroupName;
    @Value("${quartz.time}")
    private String time;
    @Value("${spring.quartz.job-store-type}")
    private String jobStoreType;

    @Override
    public void run(ApplicationArguments applicationArguments) {
        LOGGER.info("--MyApplicationRunner--");

        boolean durability = false;
        Class jobClass = TestJob.class;

        // 存储类型
        if (Constants.jobStoreTypeJdbc.equals(jobStoreType)) {
            durability = true;
            LOGGER.info("job存储方式："+Constants.jobStoreTypeJdbc);
        } else if (Constants.jobStoreTypeMemory.equals(jobStoreType)) {
            durability = false;
            LOGGER.info("job存储方式："+Constants.jobStoreTypeMemory);
        } else {
            LOGGER.warn("不存在存储类型："+jobStoreType+"，默认为："+Constants.jobStoreTypeMemory+"请选择:"+Constants.jobStoreTypeJdbc+"或者"+Constants.jobStoreTypeMemory);
        }

        // 任务类型
        if (Constants.jobTypeSimple.equals(jobType)) {
            int interval = Constants.time;
            // 配置文件中配置的quartz.time是否符合要求。符合就采用配置文件中的，否则使用默认配置Constants.time
            if (StringUtils.testIsInt(time)) {
                interval = Integer.parseInt(time);
            }
            if (scheduleManager.checkJob(jobName,jobGroupName) && scheduleManager.checkTrigger(triggerName,triggerGroupName)) {
                LOGGER.info("Job与Trigger已存在不新增");
            } else {
                scheduleManager.addJob(jobName,jobGroupName,triggerName,triggerGroupName,
                        jobClass,durability,interval,5);
            }
        } else if (Constants.jobTypeCron.equals(jobType)) {
            // 配置文件中配置的quartz.time是否是cron表达式。是就采用配置文件中的，否则使用默认配置 Constants.cron
            if (!CronExpression.isValidExpression(time)) {
                time = Constants.cron;
            }
            if (scheduleManager.checkJob(jobName,jobGroupName) && scheduleManager.checkTrigger(triggerName,triggerGroupName)) {
                LOGGER.info("Job与Trigger已存在不新增");
            } else {
                scheduleManager.addJob(jobName, jobGroupName, triggerName, triggerGroupName,
                        jobClass, durability, time, 5);
            }
        } else {
            LOGGER.warn("--MyApplicationRunner--不存在jobType："+jobType+",请选择："+Constants.jobTypeSimple+"或者"+Constants.jobTypeCron);
        }
    }
}
