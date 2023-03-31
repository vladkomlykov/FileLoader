package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Output {
    Employee employee = new Employee();
    List<String> codeName = new ArrayList<>();
    String name;
    int numEmployee;

    public void inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сотрудника");
        numEmployee = scanner.nextInt();

        if (numEmployee == 1) {
            name = employee.employees[0];
        }
        if (numEmployee == 2) {
            name = employee.employees[1];
        }
        if (numEmployee == 3) {
            name = employee.employees[2];
        }
        if (numEmployee == 4) {
            name = employee.employees[3];
        }
        if (numEmployee == 5) {
            name = employee.employees[4];
        }
        if (numEmployee == 6) {
            name = employee.employees[5];
        }
        if (numEmployee == 7) {
            name = employee.employees[6];
        }
        if (numEmployee == 8) {
            name = employee.employees[7];
        }
        if (numEmployee == 9) {
            name = employee.employees[8];
        }
        if (numEmployee == 10) {
            name = employee.employees[9];
        } else if (numEmployee > 10 || numEmployee <= 0) {
            inputName();
        }
    }

    public void connectCodeWihName() throws IOException {
        BufferedReader codeReader = new BufferedReader(
                new FileReader("E:\\project java\\FileLoader\\code.txt"));

        String line = codeReader.readLine();

        while (line != null) {
            codeName.add(line);
            line = codeReader.readLine();
        }
        codeReader.close();

        String[] array = codeName.toArray(new String[0]);

        for (String str : array) {
            if (numEmployee == 1) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[0]);
                break;
            }
            if (numEmployee == 2) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[1]);
                break;
            }
            if (numEmployee == 3) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[2]);
                break;
            }
            if (numEmployee == 4) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[3]);
                break;
            }
            if (numEmployee == 5) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[4]);
                break;
            }
            if (numEmployee == 6) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[5]);
                break;
            }
            if (numEmployee == 7) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[6]);
                break;
            }
            if (numEmployee == 8) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[7]);
                break;
            }
            if (numEmployee == 9) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[8]);
                break;
            }
            if (numEmployee == 10) {
                System.out.println("Сотрудник " + name + ", ваш код доступа - " + array[9]);
                break;
            }
        }
    }
}