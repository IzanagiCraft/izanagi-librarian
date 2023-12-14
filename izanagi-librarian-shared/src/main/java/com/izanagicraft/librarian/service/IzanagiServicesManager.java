/*
 * Copyright (c) 2023 - present | sanguine6660 <sanguine6660@gmail.com>
 * Copyright (c) 2023 - present | izanagicraft.com <contact@izanagicraft.com>
 * Copyright (c) 2023 - present | izanagicraft.com team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
