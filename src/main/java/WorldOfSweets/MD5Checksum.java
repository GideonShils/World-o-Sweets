package WorldOfSweets;

import java.io.*;
import java.security.MessageDigest;

/*
* Source: http://www.rgagnon.com/javadetails/java-0416.html
*/

public class MD5Checksum {

    public static byte[] createChecksum(String filename) throws Exception {
        InputStream fis = new FileInputStream(filename);

        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("MD5");
        int numRead;

        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);

        fis.close();
        return complete.digest();
    }

    // see this How-to for a faster way to convert
    // a byte array to a HEX string
    public static String getMD5Checksum(String filename) throws Exception {
        byte[] b = createChecksum(filename);
        String result = "";

        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }

        return result;
    }

    // reads in checksum stored in text file and compares it with the checksum calculated with the file
    // returns true if they are equal and false if they are not equal
    public static boolean compareChecksum(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file.getPath() + "_checksum.txt"));
            String checksum = br.readLine();

            String fileChecksum = getMD5Checksum(file.getPath());
            br.close();
            return checksum.equals(fileChecksum);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}