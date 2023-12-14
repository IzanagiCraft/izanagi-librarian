package com.izanagicraft.librarian.service;

/**
 * izanagi-librarian; com.izanagicraft.librarian.service:ServicePriority
 * <p>
 * Enumeration representing the priority levels for Izanagi services.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public enum ServicePriority {

    /**
     * Low priority. Services with low priority are considered less critical or time-sensitive.
     * They may be background or non-essential services.
     */
    LOW,

    /**
     * Medium priority. Services with medium priority have a standard level of importance.
     * They are typically used for general functionality without any specific urgency.
     */
    MEDIUM,

    /**
     * High priority. Services with high priority are more critical and time-sensitive.
     * They may be used for essential features that need prompt attention.
     */
    HIGH,

    /**
     * Highest priority. Services with the highest priority are of utmost importance.
     * They are critical and must be processed immediately, often for crucial system functions.
     */
    HIGHEST

}
