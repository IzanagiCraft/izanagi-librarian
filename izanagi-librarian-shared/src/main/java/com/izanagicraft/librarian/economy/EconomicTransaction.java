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

import java.util.Currency;

/**
 * izanagi-librarian; com.izanagicraft.librarian.economy:EconomicTransaction
 * <p>
 * The {@code EconomicTransaction} interface represents an economic transaction between two agents.
 * It provides methods to retrieve information about the sender, receiver, amount, currency, and type of the transaction.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface EconomicTransaction {

    /**
     * Retrieves the economic agent who initiated the transaction (sender).
     *
     * @return The sender of the economic transaction, represented by {@code EconomicAgent}.
     */
    EconomicAgent getSender();

    /**
     * Retrieves the economic agent who received the transaction (receiver).
     *
     * @return The receiver of the economic transaction, represented by {@code EconomicAgent}.
     */
    EconomicAgent getReceiver();

    /**
     * Retrieves the amount involved in the economic transaction.
     *
     * @return The amount of the economic transaction.
     */
    double getAmount();

    /**
     * Retrieves the currency in which the economic transaction took place.
     *
     * @return The currency of the economic transaction, represented by {@code Currency}.
     */
    Currency getCurrency();

    /**
     * Retrieves the type of the economic transaction.
     *
     * @return The type of the economic transaction, represented by {@code EconomicTransactionType}.
     */
    EconomicTransactionType getTransactionType();

}
