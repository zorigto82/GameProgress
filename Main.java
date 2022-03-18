package com.company.Sohranenie;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {

        GameProgress gameProgress = new GameProgress(50, 2, 2, 200);
        GameProgress gameProgress1 = new GameProgress(60, 1, 4, 350.2);
        GameProgress gameProgress2 = new GameProgress(30, 3, 3, 256);
//
//        saveGames("C://Games//savegames//save.dat", gameProgress);
//        saveGames("C://Games//savegames//save2.dat//", gameProgress1);
//        saveGames("C://Games//savegames//save3.dat", gameProgress2);

//        zipFiles("C://Games//savegames//zip.zip", "C://Games//savegames//save.dat");
//        zipFiles("C://Games//savegames//zip.zip", "C://Games//savegames//save2.dat");
//        zipFiles("C://Games//savegames//zip.zip", "C://Games//savegames//save3.dat");

//        openZip("C://Games//savegames//zip.zip", "C://Games//savegames//");

        openProgress("C://Games//savegames//save2.dat//", gameProgress1);

    }

//    public static void saveGames(String s, GameProgress game) {
//        try (FileOutputStream fos = new FileOutputStream(s);
//             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//            oos.writeObject(game);
//        } catch (IOException ex) {
//           System.out.println (ex.getMessage());
//        }
//
//    }

//    public static void zipFiles(String i, String j) {
//        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(i));
//             FileInputStream fis = new FileInputStream(j)) {
//            ZipEntry entry = new ZipEntry("packed_test.txt");
//            zos.putNextEntry(entry);
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//            zos.write(buffer);
//            zos.closeEntry();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

//    public static void openZip(String a, String string) {
//        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(a))) {
//            ZipEntry entry;
//            while ((entry = zis.getNextEntry()) != null) {
//                String name = entry.getName();
//                FileOutputStream fout = new FileOutputStream(string  +  name);
//                for (int c = zis.read(); c != -1; c = zis.read()) {
//                    fout.write(c);
//                    zis.closeEntry();
//                    fout.close();
//                }
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

    public static void openProgress(String str, GameProgress progress) {
        try (FileInputStream fis = new FileInputStream(str);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            progress = (GameProgress) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(progress);
    }
}
