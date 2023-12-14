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

package com.izanagicraft.librarian;

/**
 * izanagi-librarian; com.izanagicraft.librarian:SharedConstants
 * <p>
 * The {@code SharedConstants} class contains constants shared in IzanagiCraft projects
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public final class SharedConstants {

    /**
     * Private constructor to prevent instantiation of the class.
     * This constructor is not meant to be called, as all methods in this class are static.
     */
    private SharedConstants() {
        // Empty
    }

    /**
     * The standard prefix format.
     */
    private static final String STANDARD_PREFIX_FORMAT = "[%s]";

    /**
     * The chat prefix format.
     */
    private static final String CHAT_PREFIX_FORMAT = "[%s] ";

    /**
     * The colored prefix format.
     */
    private static final String COLORED_PREFIX_FORMAT = "&8[&r%s&r&8]&r";

    /**
     * The colored chat prefix format.
     */
    private static final String COLORED_CHAT_PREFIX_FORMAT = "&8[&r%s&r&8]&r ";

    /**
     * The color codes for IZANAGI.
     */
    private static final String IZANAGI_COLORS = "&#CB2D3EI&#D1313DZ&#D7363DA&#DD3A3CN&#E33E3BA&#E9433BG&#EF473AI";

    // Colors for SYSTEM

    /**
     * The color codes for SYSTEM.
     */
    private static final String SYSTEM_COLORS = "&#CB2D3ES&#D2323DY&#D9373CS&#E13D3CT&#E8423BE&#EF473AM";

    /**
     * The standard prefix.
     */
    public static final String STANDARD_PREFIX = String.format(STANDARD_PREFIX_FORMAT, "%s");

    /**
     * The chat prefix.
     */
    public static final String CHAT_PREFIX = String.format(CHAT_PREFIX_FORMAT, "%s");

    /**
     * The colored prefix.
     */
    public static final String COLORED_PREFIX = String.format(COLORED_PREFIX_FORMAT, "%s");

    /**
     * The colored chat prefix.
     */
    public static final String COLORED_CHAT_PREFIX = String.format(COLORED_CHAT_PREFIX_FORMAT, "%s");

    /**
     * The standard prefix for SYSTEM messages.
     */
    public static final String SYSTEM_STANDARD_PREFIX = String.format(STANDARD_PREFIX, "SYSTEM");

    /**
     * The chat prefix for SYSTEM messages.
     */
    public static final String SYSTEM_CHAT_PREFIX = String.format(CHAT_PREFIX, "SYSTEM");

    /**
     * The colored prefix for SYSTEM messages.
     */
    public static final String SYSTEM_COLORED_PREFIX = String.format(COLORED_PREFIX, SYSTEM_COLORS);

    /**
     * The colored chat prefix for SYSTEM messages.
     */
    public static final String SYSTEM_COLORED_CHAT_PREFIX = String.format(COLORED_CHAT_PREFIX, SYSTEM_COLORS);

    /**
     * The standard prefix for IZANAGI messages.
     */
    public static final String IZANAGI_STANDARD_PREFIX = String.format(STANDARD_PREFIX, "IZANAGI");

    /**
     * The chat prefix for IZANAGI messages.
     */
    public static final String IZANAGI_CHAT_PREFIX = String.format(CHAT_PREFIX, "IZANAGI");

    /**
     * The colored prefix for IZANAGI messages.
     */
    public static final String IZANAGI_COLORED_PREFIX = String.format(COLORED_PREFIX, IZANAGI_COLORS);

    /**
     * The colored chat prefix for IZANAGI messages.
     */
    public static final String IZANAGI_COLORED_CHAT_PREFIX = String.format(COLORED_CHAT_PREFIX, IZANAGI_COLORS);

    // Default server name
    public static String SERVER_NAME = "default";

    // Default language code
    public static String DEFAULT_LANG = "en";

    // ================================================================================================================= //

    /**
     * The {@code ApplicationConstants} class contains constants related to the application name, prefixes,
     * and headers/footers used in messages or display.
     */
    public static final class ApplicationConstants {

        /**
         * Private constructor to prevent instantiation of the class.
         * This constructor is not meant to be called, as all methods in this class are static.
         */
        private ApplicationConstants() {
            // Empty
        }

        /**
         * The colored name of the application.
         */
        public static String APPLICATION_NAME = IZANAGI_COLORS;

        /**
         * The prefix for various messages, colored and with placeholders.
         */
        public static String APPLICATION_PREFIX = "&8[&r${name}&r&8]&r";

        /**
         * The chat prefix with a space at the end.
         */
        public static String APPLICATION_CHAT_PREFIX = "${prefix} &7";

        /**
         * The header for display, including the colored name.
         */
        public static String APPLICATION_HEADER = "&r&8============= &r${name} &r&8=============&r";

        /**
         * The footer for display, including the colored name.
         */
        public static String APPLICATION_FOOTER = "&r&8============= &r${name} &r&8=============&r";

    }

    /**
     * The {@code ServerConfigurationConstants} class contains constants related to server configuration,
     * including default server name and language code.
     */
    public static final class ServerConfigurationConstants {

        /**
         * Private constructor to prevent instantiation of the class.
         * This constructor is not meant to be called, as all methods in this class are static.
         */
        private ServerConfigurationConstants() {
            // Empty
        }

        /**
         * The default name of the server.
         */
        public static String SERVER_NAME = "default";

        /**
         * The default language code used by the server.
         */
        public static String DEFAULT_LANG = "en";

    }

}
