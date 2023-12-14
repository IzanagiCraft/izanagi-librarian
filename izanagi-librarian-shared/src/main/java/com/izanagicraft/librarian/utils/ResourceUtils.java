package com.izanagicraft.librarian.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * izanagi-librarian; com.izanagicraft.librarian.utils:ResourceUtils
 * <p>
 * A utility class for working with resources, such as saving and reading files.
 *
 * @author <a href="https://github.com/sanguine6660">@sanguine6660</a>
 * @since 14.12.2023
 */
public final class ResourceUtils {

    /**
     * Private constructor to prevent instantiation of the class.
     * This constructor is not meant to be called, as all methods in this class are static.
     */
    private ResourceUtils() {
        // Empty
    }

    /**
     * Saves a resource from the classpath to a specified folder.
     *
     * @param folder       The target folder to save the resource to.
     * @param resourcePath The path of the resource to be saved.
     * @param overwrite    Whether to overwrite the file if it already exists.
     */
    public static void saveResource(File folder, String resourcePath, boolean overwrite) {
        if (!resourcePath.startsWith("/")) {
            resourcePath = "/" + resourcePath;
        }
        File file = new File(folder, resourcePath);
        if (!file.exists() || overwrite) {
            try (InputStream in = ResourceUtils.class.getResourceAsStream(resourcePath)) {
                Files.copy(in, file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Reads the content of a resource file and returns it as a string.
     *
     * @param resourcePath The path of the resource file to read.
     * @return The content of the resource file as a string, or null if an error occurs.
     */
    public static String readToString(String resourcePath) {
        try {
            return new String(ResourceUtils.class.getClassLoader().getResourceAsStream(resourcePath).readAllBytes(), StandardCharsets.UTF_8);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

}
