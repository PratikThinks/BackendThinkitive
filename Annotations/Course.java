package Annotations;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Course{
    String cid() default "444";
    String cname() default "java";
    int cprice() default 2000;
    
}
