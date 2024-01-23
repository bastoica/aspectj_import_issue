package edu.demo.weaver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect Interceptor {

  private static final Logger LOG = LoggerFactory.getLogger(Interceptor.class);

  pointcut recordThreadSleep() :
    ((call(* java.lang.Object.wait(..)) ||
    call(* java.lang.Thread.sleep(..)) ||
    call(* java.util.concurrent.locks.LockSupport.parkNanos(..)) ||
    call(* java.util.concurrent.locks.LockSupport.parkUntil(..)) ||
    call(* java.util.concurrent.ScheduledExecutorService.schedule(..)) ||
    call(* java.util.concurrent.TimeUnit.*scheduledExecutionTime(..)) ||
    call(* java.util.concurrent.TimeUnit.*sleep(..)) ||
    call(* java.util.concurrent.TimeUnit.*timedWait(..)) ||
    call(* java.util.Timer.schedule*(..)) ||
    call(* java.util.TimerTask.wait(..)) ||
    call(* org.apache.hadoop.hbase.*.Procedure.suspend(..))) &&
    !within(edu.demo.weaver.*));


  before() : recordThreadSleep() {
    try {
      String sleepLocation = String.format("%s(%s:%d)",
        thisJoinPoint.getSourceLocation().getFileName(),
        thisJoinPoint.getSourceLocation().getWithinType().getName(),
        thisJoinPoint.getSourceLocation().getLine());

      LOG.warn("[WEAVER] Sleep location at {}", sleepLocation);
    } catch (Exception e) {
      LOG.error("Exception occurred in recordThreadSleep(): {}", e.getMessage());
      e.printStackTrace();
    }
  }
}
