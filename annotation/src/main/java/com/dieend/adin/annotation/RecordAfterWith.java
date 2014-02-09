package com.dieend.adin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention( RetentionPolicy.CLASS)
@Target(ElementType.METHOD)

public @interface RecordAfterWith {
	String eventName();
	Type type() default Type.DEFAULT;
}
