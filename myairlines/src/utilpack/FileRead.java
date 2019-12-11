package utilpack;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRead {

    private FileRead() {
    }

    public static void output(AirLines airLines, String path) {
        try (RandomAccessFile output = new RandomAccessFile(new File(path), "rw")) {

            long sumCapacity = airLines.getAirLinesCapacity();
            long sumCarriage = airLines.getAirLinesCarriage();

            output.writeUTF(airLines.toString() + "\n");
            output.writeUTF("Sum carriage: " + Long.toString(sumCarriage) + "\n");
            output.writeUTF("Sum capacity: " + Long.toString(sumCapacity) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
