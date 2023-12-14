package com.izanagicraft.librarian.service;

import java.util.List;

/**
 * izanagi-librarian; com.izanagicraft.librarian.service:IzanagiServicesManager
 * <p>
 * Interface for managing Izanagi services and their providers.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface IzanagiServicesManager {

    /**
     * Add a service provider to the manager.
     *
     * @param serviceProvider The service provider to add.
     */
    void addServiceProvider(IzanagiServiceProvider<?> serviceProvider);

    /**
     * Get a list of Izanagi services of a specified type.
     *
     * @param serviceType The type of Izanagi service.
     * @return List of Izanagi services of the specified type.
     */
    List<IzanagiService> getService(Class<? extends IzanagiService> serviceType);

}
