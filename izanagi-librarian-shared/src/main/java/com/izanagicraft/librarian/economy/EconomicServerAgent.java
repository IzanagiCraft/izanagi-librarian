package com.izanagicraft.librarian.economy;

/**
 * izanagi-librarian; com.izanagicraft.librarian.economy:EconomicServerAgent
 * <p>
 * The {@code EconomicServerAgent} interface extends the {@code EconomicAgent} interface and represents a specialized
 * economic agent that provides a default implementation for retrieving balance.
 * This implementation returns {@code Double.MAX_VALUE} as a placeholder for an infinite or undefined balance.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface EconomicServerAgent extends EconomicAgent {

    /**
     * Overrides the default implementation of {@code getBalance} in {@code EconomicAgent}.
     * This method returns {@code Double.MAX_VALUE} to represent an infinite or undefined balance.
     *
     * @param currency The {@code EconomicCurrency} for which the balance is requested.
     * @return The balance of the economic server agent, which is represented by {@code Double.MAX_VALUE}.
     */
    @Override
    default double getBalance(EconomicCurrency currency) {
        return Double.MAX_VALUE;
    }

}
