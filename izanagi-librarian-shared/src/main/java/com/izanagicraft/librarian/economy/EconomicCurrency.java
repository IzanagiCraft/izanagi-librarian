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

package com.izanagicraft.librarian.economy;

/**
 * izanagi-librarian; com.izanagicraft.librarian.economy:EconomicCurrency
 * <p>
 * The {@code EconomicCurrency} interface represents a currency in an economic system.
 * It provides methods to retrieve the unique identifier, currency code, and name of the currency.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface EconomicCurrency {

    /**
     * Retrieves the unique identifier of the currency.
     *
     * @return The unique identifier of the currency.
     */
    String getId();

    /**
     * Retrieves the currency code of the currency.
     *
     * @return The currency code of the currency.
     */
    String getCode();

    /**
     * Retrieves the name of the currency.
     *
     * @return The name of the currency.
     */
    String getName();

}
