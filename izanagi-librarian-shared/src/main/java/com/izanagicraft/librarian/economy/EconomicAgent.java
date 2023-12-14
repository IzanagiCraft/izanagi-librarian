package com.izanagicraft.librarian.economy;

/**
 * izanagi-librarian; com.izanagicraft.librarian.economy:EconomicAgent
 * <p>
 * The {@code EconomicAgent} interface represents an economic entity capable of managing financial balances
 * in different currencies.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface EconomicAgent {

    /**
     * Retrieves the balance of the economic agent in the specified currency.
     *
     * @param currency The {@code EconomicCurrency} for which the balance is requested.
     * @return The balance of the economic agent in the specified currency.
     */
    double getBalance(EconomicCurrency currency);

    /**
     * Sets the balance of the economic agent in the specified currency.
     *
     * @param currency   The {@code EconomicCurrency} for which the balance is set.
     * @param newBalance The new balance to set for the economic agent in the specified currency.
     */
    void setBalance(EconomicCurrency currency, double newBalance);

}
