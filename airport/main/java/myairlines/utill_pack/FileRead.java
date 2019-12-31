package myairlines.utill_pack;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRead {

    private FileRead() {
    }

    public static void output(Airlines airlines, String path) {
        try (RandomAccessFile output = new RandomAccessFile(new File(path), "rw")) {

            long sumCapacity = airlines.getAirLinesCapacity();
            long sumCarriage = airlines.getAirLinesCarriage();

            output.writeUTF(airlines.toString() + "\n");
            output.writeUTF("Максимальная грузоподъемность: " + Long.toString(sumCarriage) + "\n");
            output.writeUTF("Максимальная вместимость: " + Long.toString(sumCapacity) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
