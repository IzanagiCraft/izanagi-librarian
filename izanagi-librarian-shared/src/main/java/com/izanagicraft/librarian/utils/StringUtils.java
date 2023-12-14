package com.izanagicraft.librarian.utils;

import java.util.Collection;
import java.util.UUID;

/**
 * izanagi-librarian; com.izanagicraft.librarian.utils:StringUtils
 * <p>
 * A utility class for various string manipulation and comparison operations.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public final class StringUtils {

    /**
     * Private constructor to prevent instantiation of the class.
     * This constructor is not meant to be called, as all methods in this class are static.
     */
    private StringUtils() {
        // Empty
    }

    /**
     * Checks whether a given string is a valid UUID version 4.
     *
     * @param input The string to be checked.
     * @return True if the input is a valid UUID version 4, false otherwise.
     */
    public static boolean isUUIDv4(String input) {
        try {
            UUID uuid = UUID.fromString(input);
            return uuid.version() == 4;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    /**
     * Checks if a string starts with a specified prefix, ignoring case.
     *
     * @param string The string to be checked.
     * @param prefix The prefix to compare with the start of the string.
     * @return True if the string starts with the given prefix (ignoring case), false otherwise.
     */
    public static boolean startsWithIgnoreCase(String string, String prefix) {
        if (string.length() < prefix.length()) {
            return false;
        }
        return string.regionMatches(true, 0, prefix, 0, prefix.length());
    }

    /**
     * Copies strings from the available collection that start with the specified input,
     * ignoring case, and appends them to the toAppend collection.
     *
     * @param input     The input string used as a filter.
     * @param available The collection of available strings.
     * @param toAppend  The collection to which the matching strings are appended.
     */
    public static void copyPartialMatches(String input, Collection<String> available, Collection<String> toAppend) {
        for (String string : available) {
            if (startsWithIgnoreCase(string, input)) {
                toAppend.add(string);
            }
        }
    }

    /**
     * Creates a formatted prefix based on the given format and prefix.
     *
     * @param format The format string with a placeholder for the prefix.
     * @param prefix The prefix to be inserted into the format.
     * @return The formatted prefix string.
     */
    public static String prefix(String format, String prefix) {
        return String.format(format, prefix);
    }

}
