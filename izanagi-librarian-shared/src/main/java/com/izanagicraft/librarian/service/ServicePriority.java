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
