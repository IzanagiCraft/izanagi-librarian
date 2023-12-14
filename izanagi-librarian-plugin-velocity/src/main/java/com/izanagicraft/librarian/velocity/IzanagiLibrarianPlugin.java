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

package com.izanagicraft.librarian.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyShutdownEvent;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;

import java.io.File;
import java.nio.file.Path;
import java.util.logging.Logger;

/**
 * izanagi-librarian; com.izanagicraft.librarian.velocity:IzanagiLibrarianPlugin
 * <p>
 * The main class for the Izanagi Librarian Velocity plugin.
 * This class is responsible for handling initialization and shutdown events in the Velocity proxy.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public class IzanagiLibrarianPlugin {

    private ProxyServer server;
    private Logger logger;
    private @DataDirectory Path dataDir;
    private File dataFolder;

    /**
     * Constructor for the Izanagi Librarian Velocity plugin.
     *
     * @param server  The Velocity ProxyServer instance.
     * @param logger  The Logger instance for logging.
     * @param dataDir The data directory for storing plugin data.
     */
    @Inject
    public IzanagiLibrarianPlugin(ProxyServer server, Logger logger, @DataDirectory Path dataDir) {
        this.server = server;
        this.logger = logger;
        this.dataFolder = dataDir.toFile();
        if (!this.dataFolder.exists()) {
            // Create the data folder if it doesn't exist.
            this.dataFolder.mkdirs();
        }
        this.onLoad();
    }

    /**
     * Method called during the plugin's initialization phase.
     * You can perform any necessary setup tasks here.
     */
    private void onLoad() {
        // TODO: Add any initialization tasks here.
    }

    /**
     * Event handler for the ProxyInitializeEvent.
     * Called when the plugin is enabled.
     *
     * @param event The ProxyInitializeEvent instance.
     */
    @Subscribe
    public void onEnable(ProxyInitializeEvent event) {
        // TODO: Add any tasks to be performed when the plugin is enabled.
    }

    /**
     * Event handler for the ProxyShutdownEvent.
     * Called when the plugin is disabled.
     *
     * @param event The ProxyShutdownEvent instance.
     */
    @Subscribe
    public void onDisable(ProxyShutdownEvent event) {
        // TODO: Add any tasks to be performed when the plugin is disabled.
    }

}
