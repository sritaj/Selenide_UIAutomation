package utils;

import java.io.File;
import java.io.IOException;

public class CleanupImpl {

    private CleanupImpl() {
    }

    /**
     * Deletes all files and directories in the specified directory path.
     *
     * @param directoryPath the path of the directory to clean up
     */
    public static void cleanUpDirectory(String directoryPath) {
        File directory = new File(System.getProperty("user.dir") + directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] contents = directory.listFiles();
            if (contents != null) {
                for (File file : contents) {
                    try {
                        if (file.isDirectory()) {
                            deleteRecursive(file);
                        } else {
                            file.delete();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Recursively deletes the specified file or directory and all of its contents.
     * If the file or directory cannot be deleted, an IOException will be thrown.
     *
     * @param file the file or directory to delete
     * @throws IOException if the file or directory cannot be deleted
     */
    private static void deleteRecursive(File file) throws IOException {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File subFile : contents) {
                if (subFile.isDirectory()) {
                    deleteRecursive(subFile);
                } else {
                    subFile.delete();
                }
            }
        }
        file.delete();
    }

}
