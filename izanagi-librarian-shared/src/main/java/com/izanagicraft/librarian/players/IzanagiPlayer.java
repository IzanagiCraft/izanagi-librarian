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
