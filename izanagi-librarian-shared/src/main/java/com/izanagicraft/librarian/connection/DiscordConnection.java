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
 * izanagi-librarian; com.izanagicraft.librarian.connection:DiscordConnection
 * <p>
 * Represents the connection between Discord and Minecraft accounts, providing methods
 * to link, unlink, and check the presence of connections.
 * <p>
 * This interface is designed to be implemented to provide specific functionality for
 * managing connections between Discord and Minecraft accounts.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public interface DiscordConnection {

    /**
     * Link the Discord user's account with their Minecraft account.
     *
     * @param discordId The unique ID of the user in Discord.
     * @param playerId  The unique ID of the player in Minecraft.
     * @return true if the connection is successful, false otherwise.
     */
    boolean linkDiscordToMinecraft(String discordId, String playerId);

    /**
     * Get the Minecraft ID linked to the specified Discord user.
     *
     * @param discordId The unique ID of the user in Discord.
     * @return The Minecraft ID linked to the Discord user, or null if not linked.
     */
    String getMinecraftId(String discordId);

    /**
     * Remove the link between the Discord user's account and their Minecraft account.
     *
     * @param discordId The unique ID of the user in Discord.
     * @return true if the disconnection is successful, false otherwise.
     */
    boolean unlinkDiscordFromMinecraft(String discordId);

    /**
     * Check if a connection exists between the Discord user and Minecraft player.
     *
     * @param discordId The unique ID of the user in Discord.
     * @return true if a connection is present, false otherwise.
     */
    boolean isConnectionPresent(String discordId);

    /**
     * Asynchronously link the Discord user's account with their Minecraft account.
     *
     * @param discordId The unique ID of the user in Discord.
     * @param playerId  The unique ID of the player in Minecraft.
     * @return A CompletableFuture representing the success of the connection.
     */
    default CompletableFuture<Boolean> linkDiscordToMinecraftAsync(String discordId, String playerId) {
        return CompletableFuture.supplyAsync(() -> linkDiscordToMinecraft(discordId, playerId));
    }

    /**
     * Asynchronously get the Minecraft ID linked to the specified Discord user.
     *
     * @param discordId The unique ID of the user in Discord.
     * @return A CompletableFuture with the Minecraft ID linked to the Discord user,
     * or null if not linked.
     */
    default CompletableFuture<String> getMinecraftIdAsync(String discordId) {
        return CompletableFuture.supplyAsync(() -> getMinecraftId(discordId));
    }

    /**
     * Asynchronously remove the link between the Discord user's account and their Minecraft account.
     *
     * @param discordId The unique ID of the user in Discord.
     * @return A CompletableFuture representing the success of the disconnection.
     */
    default CompletableFuture<Boolean> unlinkDiscordFromMinecraftAsync(String discordId) {
        return CompletableFuture.supplyAsync(() -> unlinkDiscordFromMinecraft(discordId));
    }

    /**
     * Asynchronously check if a connection exists between the Discord user and Minecraft player.
     *
     * @param discordId The unique ID of the user in Discord.
     * @return A CompletableFuture with a boolean indicating if a connection is present.
     */
    default CompletableFuture<Boolean> isConnectionPresentAsync(String discordId) {
        return CompletableFuture.supplyAsync(() -> isConnectionPresent(discordId));
    }

}
