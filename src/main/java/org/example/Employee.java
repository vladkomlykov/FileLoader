package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InterruptedIOException;

public class Employee {
    Object lock = new Object();
    public final String[] employees = {"Акимова", "Смирнов", "Денисова", "Тимофеева", "Лебедева", "Щербакова", "Титова",
            "Панова", "Поляков", "Кондратьев"};

    Runnable createFileEmployee = () ->{
        synchronized (lock) {
            try {
                createFileEmployee(employees);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            lock.notify();
        }
    };


    public void createFileEmployee(String[] employeeList) throws IOException {
        try(FileWriter writer = new FileWriter("C:\\Users\\komlyakov.va\\Desktop\\FileLoader-master\\employee.txt", false)) {
            for(int i = 0; i < 10; i++) {
                try {
                    writer.write(employeeList[i] + "\n");
                    System.out.println("Загрузка данных " + i*10 + "%");
                    Thread.sleep(1000);
                } catch (InterruptedIOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Загрузка данных завершена");
    }
}


