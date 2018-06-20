package com.iotch.interceptor.authority.aspect;

import com.iotch.interceptor.authority.annotation.AuthValidate;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

@Component
@Aspect
public class AuthAspect {


    /**类上注解情形 */
//  @Pointcut("@within(com.ttzn.interceptor.authority.annotation.AuthValidate)")
    @Pointcut("execution(* com.iotch.web.*.*(..)) && @within(com.iotch.interceptor.authority.annotation.AuthValidate)")
    public void aspect(){

    }
    /**方法上注解情形 */
    @Pointcut("execution(* com.iotch.web.*.*(..)) && @annotation(com.iotch.interceptor.authority.annotation.AuthValidate)")
    public void aspect2(){

    }
    /**aop实际拦截两种情形*/
    @Around("aspect()")
    public Object doBefore(ProceedingJoinPoint point) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<?> classz = target.getClass();
        Method m = ((MethodSignature) point.getSignature()).getMethod();
        System.out.println("11111111111111111111111111111111111111111111111111111method:"+method);
        try {
            if (classz!=null && m != null ) {
                boolean isClzAnnotation= classz.isAnnotationPresent(AuthValidate.class);
                boolean isMethondAnnotation=m.isAnnotationPresent(AuthValidate.class);
                AuthValidate authValidate=null;
                //如果方法和类声明中同时存在这个注解，那么方法中的会覆盖类中的设定。
                if(isMethondAnnotation){
                    authValidate=m.getAnnotation(AuthValidate.class);
                }else if(isClzAnnotation){
                    authValidate=classz.getAnnotation(AuthValidate.class);
                }
                String value=authValidate.isNeedValidate();
                Object obj=session.getAttribute("LOGINUSER");
                String curUserType=obj==null?"":obj.toString();
                //进行角色访问的权限控制，只有当前用户是需要的角色才予以访问。
                //boolean isEquals=StringUtils.checkEquals(value, curUserType);
                if(true){
                    try {
                        return point.proceed();
                    } catch (Throwable e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("222222222222222222222222222");
                }

            }
        }catch(Exception e){

        }
        return null;
    }
}
