import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public final class IOUtils {

    private IOUtils() {

    }


    public static void saveText(String filename, String textToWrite) {

        try {
            FileUtils.write(new File(filename + ".txt"), textToWrite, Charsets.toCharset("UTF-8"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


    public static void saveFile(String fileName,  Object objectToSave) {

        try (FileOutputStream fos = new FileOutputStream(fileName + ".ser_obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(objectToSave);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
