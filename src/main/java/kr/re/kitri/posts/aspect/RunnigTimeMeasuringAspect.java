package kr.re.kitri.posts.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RunnigTimeMeasuringAspect {

    public static Logger logger =
            LoggerFactory.getLogger(RunnigTimeMeasuringAspect.class);

    @Around("execution(* kr.re.kitri.posts.dao.*.*(..))")
    public Object measureRunningTime(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long runningTime = System.currentTimeMillis() - startTime;
        logger.info(
                pjp.getSignature().getDeclaringTypeName() + "."
                + pjp.getSignature().getName() + " 의 실행 시간은 "
                + runningTime + "밀리초 입니다."
        );
        return obj;
    }
}
