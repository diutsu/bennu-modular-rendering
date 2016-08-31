package org.fenixedu.bennu.rendering.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by nurv on 06/04/15.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BennuIntersections.class)
public @interface BennuIntersection {
    String location();

    String position() default "";

    int priority() default Integer.MAX_VALUE;

    String file() default "";
}
