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
 * izanagi-librarian; com.izanagicraft.librarian.economy:EconomicTransactionType
 * <p>
 * The {@code EconomicTransactionType} enum represents the types of economic transactions that can occur.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public enum EconomicTransactionType {

    /**
     * Represents a purchase transaction where an agent acquires goods or services from another agent.
     */
    PURCHASE,

    /**
     * Represents a sale transaction where an agent sells goods or services to another agent.
     */
    SALE,

    /**
     * Represents a transfer transaction where an agent transfers funds from one account to another.
     */
    TRANSFER,

    /**
     * Represents a refund transaction where an agent returns funds to another agent.
     */
    REFUND,

    /**
     * Represents an unspecified or unknown type of economic transaction.
     */
    UNKNOWN;
}
