import java.io.*;

public class ch1702 {
    public static void main(String[] args) {

        String txt = "";
        for (int i = 0; i < 100; i++) {
            txt += ((int) (1 + Math.random() * 100))+",";
        }
        String fileName = "Exercise17_02.dat";

        try {

            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
            fw.write(txt);
            fw.flush();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}