package com.izanagicraft.librarian.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * izanagi-librarian; com.izanagicraft.librarian.service:IzanagiService
 * <p>
 * Annotation to mark a class as an Izanagi service.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IzanagiService {

    /**
     * Name of the Izanagi service.
     *
     * @return The name of the service.
     */
    String name();

    /**
     * Priority of the Izanagi service.
     *
     * @return The priority level, default is MEDIUM.
     */
    ServicePriority priority() default ServicePriority.MEDIUM;

}
