package com.izanagicraft.librarian.service;

/**
 * izanagi-librarian; com.izanagicraft.librarian.service:IzanagiServiceProvider
 * <p>
 * Interface for a provider of Izanagi service.
 *
 * @param <T> Type of Izanagi service.
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface IzanagiServiceProvider<T extends IzanagiService> {
    /**
     * Get the Registered IzanagiService.
     *
     * @return Registered IzanagiService.
     */
    T getService();

    /**
     * Get the priority of the service provider.
     *
     * @return The priority level of the service provider.
     */
    ServicePriority getPriority();

}
