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
