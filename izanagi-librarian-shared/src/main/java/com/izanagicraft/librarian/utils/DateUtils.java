package com.izanagicraft.librarian.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * izanagi-librarian; com.izanagicraft.librarian.utils:DateUtils
 * <p>
 * Utility class for date and time related operations.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public class DateUtils {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * Private constructor to prevent instantiation of the class.
     * This constructor is not meant to be called, as all methods in this class are static.
     */
    private DateUtils() {
        // Empty
    }

    /**
     * Formats a Date object into a string representation using the default date and time format.
     *
     * @param date The Date object to format.
     * @return A string representing the formatted date and time.
     */
    public static String formatDate(Date date) {
        DateFormat df = new SimpleDateFormat(dateFormatter.toString());
        return df.format(date);
    }

    /**
     * Formats a LocalDate object into a string representation using the default date and time format.
     *
     * @param localDate The LocalDate object to format.
     * @return A string representing the formatted date and time.
     */
    public static String formatDate(LocalDate localDate) {
        return localDate.format(dateFormatter);
    }

    /**
     * Converts a Date object to a string representation of the time in HH:mm:ss format.
     *
     * @param date The Date object to convert.
     * @return A string representing the time in HH:mm:ss format.
     */
    public static String convertDateToHHMMSS(Date date) {
        DateFormat df = new SimpleDateFormat(timeFormatter.toString());
        return df.format(date);
    }

    /**
     * Converts a LocalDate object to a string representation of the time in HH:mm:ss format.
     *
     * @param localDate The LocalDate object to convert.
     * @return A string representing the time in HH:mm:ss format.
     */
    public static String convertDateToHHMMSS(LocalDate localDate) {
        return localDate.format(timeFormatter);
    }

    /**
     * Converts a Date object to a string representation using the default date and time format.
     *
     * @param date The Date object to convert.
     * @return A string representing the formatted date and time.
     */
    public static String convertDateToString(Date date) {
        return formatDate(date);
    }

    /**
     * Converts a LocalDate object to a string representation using the default date and time format.
     *
     * @param localDate The LocalDate object to convert.
     * @return A string representing the formatted date and time.
     */
    public static String convertDateToString(LocalDate localDate) {
        return formatDate(localDate);
    }

}
