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

package com.izanagicraft.librarian.connection;

import java.util.concurrent.CompletableFuture;

/**
 * izanagi-librarian; com.izanagicraft.librarian.connection:MinecraftConnection
 * <p>
 * Represents the connection between Minecraft and Discord accounts, providing methods
 * to link, unlink, and check the presence of connections.
 * <p>
 * This interface is designed to be implemented to provide specific functionality for
 * managing connections between Minecraft and Discord accounts.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface MinecraftConnection {

    /**
     * Link the player's Minecraft account with their Discord account.
     *
     * @param playerId  The unique ID of the player in Minecraft.
     * @param discordId The unique ID of the user in Discord.
     * @return true if the connection is successful, false otherwise.
     */
    boolean linkMinecraftToDiscord(String playerId, String discordId);

    /**
     * Get the Discord ID linked to the specified Minecraft player.
     *
     * @param playerId The unique ID of the player in Minecraft.
     * @return The Discord ID linked to the Minecraft player, or null if not linked.
     */
    String getDiscordId(String playerId);

    /**
     * Remove the link between the player's Minecraft and Discord accounts.
     *
     * @param playerId The unique ID of the player in Minecraft.
     * @return true if the disconnection is successful, false otherwise.
     */
    boolean unlinkMinecraftFromDiscord(String playerId);

    /**
     * Check if a connection exists between the Minecraft player and Discord user.
     *
     * @param playerId The unique ID of the player in Minecraft.
     * @return true if a connection is present, false otherwise.
     */
    boolean isConnectionPresent(String playerId);

    /**
     * Asynchronously link the player's Minecraft account with their Discord account.
     *
     * @param playerId  The unique ID of the player in Minecraft.
     * @param discordId The unique ID of the user in Discord.
     * @return A CompletableFuture representing the success of the connection.
     */
    default CompletableFuture<Boolean> linkMinecraftToDiscordAsync(String playerId, String discordId) {
        return CompletableFuture.supplyAsync(() -> linkMinecraftToDiscord(playerId, discordId));
    }

    /**
     * Asynchronously get the Discord ID linked to the specified Minecraft player.
     *
     * @param playerId The unique ID of the player in Minecraft.
     * @return A CompletableFuture with the Discord ID linked to the Minecraft player,
     * or null if not linked.
     */
    default CompletableFuture<String> getDiscordIdAsync(String playerId) {
        return CompletableFuture.supplyAsync(() -> getDiscordId(playerId));
    }

    /**
     * Asynchronously remove the link between the player's Minecraft and Discord accounts.
     *
     * @param playerId The unique ID of the player in Minecraft.
     * @return A CompletableFuture representing the success of the disconnection.
     */
    default CompletableFuture<Boolean> unlinkMinecraftFromDiscordAsync(String playerId) {
        return CompletableFuture.supplyAsync(() -> unlinkMinecraftFromDiscord(playerId));
    }

    /**
     * Asynchronously check if a connection exists between the Minecraft player and Discord user.
     *
     * @param playerId The unique ID of the player in Minecraft.
     * @return A CompletableFuture with a boolean indicating if a connection is present.
     */
    default CompletableFuture<Boolean> isConnectionPresentAsync(String playerId) {
        return CompletableFuture.supplyAsync(() -> isConnectionPresent(playerId));
    }

}
