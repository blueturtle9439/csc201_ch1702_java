import java.io.*;

public class ch1702 {
    public static void main(String[] args) {

        String txt = "";
        for (int i = 0; i < 100; i++) {
            txt += ((int) (1 + Math.random() * 100))+",";
        }
        String fileName = "Exercise17_02.dat";

        try {

            FileOutputStream fw = new FileOutputStream(fileName, true);
            fw.write(txt);
          

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
