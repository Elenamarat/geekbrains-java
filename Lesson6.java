package lesson6;

import java.io.*;

public class Lesson6 {
    public static String fileInput(String file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fis.read()) != -1) {
            sb.append((char) b);
        }
        fis.close();
        return sb.toString();
    }

    public static void fileAppend(String file1, String file2, String file3) throws IOException {
        FileOutputStream fos = new FileOutputStream(file3, true);
        fos.write(file1.getBytes());
        fos.write(file2.getBytes());
        fos.close();
    }

    public static boolean findWord(String file, String word) {
        int result;
        File dir = new File(file);
        if(dir.isDirectory()) {
            for(File item : dir.listFiles()) {
                result = item.getName().indexOf(word);
            }
        }
        result = file.indexOf(word);
        return result >= 0 ? true: false;
    }

    public static void main(String[] args) {
        try {
            String file1 = fileInput("1.txt");
            String file2 = fileInput("2.txt");
            fileAppend(file1, file2, "3.txt");
            boolean word = findWord(file1, "asdfasd");
            System.out.println(word);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
