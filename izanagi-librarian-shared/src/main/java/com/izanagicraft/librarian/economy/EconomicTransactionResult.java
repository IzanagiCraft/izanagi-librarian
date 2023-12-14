package com.izanagicraft.librarian.economy;

/**
 * izanagi-librarian; com.izanagicraft.librarian.economy:EconomicTransactionResult
 * <p>
 * The {@code EconomicTransactionResult} interface represents the result of an economic transaction.
 * It provides information about whether the transaction was performed, a message describing the result,
 * and the type of the transaction result.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface EconomicTransactionResult {

    /**
     * Checks whether the economic transaction was performed successfully.
     *
     * @return {@code true} if the transaction was performed successfully, {@code false} otherwise.
     */
    boolean isPerformed();

    /**
     * Retrieves a message describing the result of the economic transaction.
     *
     * @return A message describing the result of the economic transaction.
     */
    String getMessage();

    /**
     * Retrieves the type of the economic transaction result.
     *
     * @return The type of the economic transaction result, represented by {@code EconomicTransactionResultType}.
     */
    EconomicTransactionResultType getResult();

    /**
     * Retrieves the processed transaction associated with the result.
     *
     * @return The processed transaction, represented by {@code EconomicTransaction}.
     */
    EconomicTransaction getProcessedTransaction();

}
