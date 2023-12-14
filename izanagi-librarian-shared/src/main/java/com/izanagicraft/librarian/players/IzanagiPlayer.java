package com.izanagicraft.librarian.players;

import com.izanagicraft.librarian.connection.DiscordConnection;
import com.izanagicraft.librarian.connection.MinecraftConnection;
import com.izanagicraft.librarian.economy.EconomicAgent;

/**
 * izanagi-librarian; com.izanagicraft.librarian.players:IzanagiPlayer
 * <p>
 * Represents a player in the Izanagi systems.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface IzanagiPlayer extends EconomicAgent {

    /**
     * Get the connection manager for the player's Minecraft account.
     *
     * @return The {@link MinecraftConnection} instance for the player.
     */
    MinecraftConnection getMinecraftConnection();

    /**
     * Get the connection manager for the player's Discord account.
     *
     * @return The {@link DiscordConnection} instance for the player.
     */
    DiscordConnection getDiscordConnection();

}
