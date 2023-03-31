package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CodeGeneration codeGeneration = new CodeGeneration();
        Employee employee = new Employee();
        Output output = new Output();

        Thread employeeThread = new Thread(employee.createFileEmployee);
        Thread codeGenerator = new Thread(codeGeneration.generateCode);

        output.inputName();

        employeeThread.start();
        try {
            employeeThread.join();
        } catch (InterruptedException e) {
            employeeThread.getName();
        }

        codeGenerator.start();
        try {
            codeGenerator.join();
        } catch (InterruptedException e) {
            codeGenerator.getName();
        }
        output.connectCodeWihName();
    }
}