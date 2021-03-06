package com.nhl.bootique.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;
import com.nhl.bootique.command.Command;

/**
 * A binding annotation for a failover {@link Command} that is executed when no
 * other Command is in effect.
 */
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface DefaultCommand {

}
