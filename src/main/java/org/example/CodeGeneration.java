package org.example;

import java.io.*;
import java.io.IOException;
public class CodeGeneration {
    Runnable generateCode = () -> {
        generateFile(codeGenerating());
    };
    int[] codeArray;
    public int[] codeGenerating() {
        codeArray = new int[10];
        int maxNum = 999999;
        int minNum = 100000;
        for (int i = 0; i < 10; i++) {
            codeArray[i] = (int) ((Math.random() * ++maxNum) + minNum);
        }
        return codeArray;
    }

    public void generateFile(int[] codeArray) {
        try (FileWriter writer = new FileWriter("C:\\Users\\komlyakov.va\\Desktop\\FileLoader-master\\code.txt", false)) {
            for (int i = 0; i < 10; i++) {
                try {
                    writer.write(codeArray[i] + "\n");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Генерация кода доступа " + i * 10 + "%");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Генерация завершена");
    }
}
