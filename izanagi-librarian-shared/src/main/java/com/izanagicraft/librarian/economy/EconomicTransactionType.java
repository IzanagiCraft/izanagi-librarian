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
