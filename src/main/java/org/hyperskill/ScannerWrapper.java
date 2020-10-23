package org.hyperskill;

import java.util.Scanner;

public class ScannerWrapper {

    private final Scanner scanner;

    public ScannerWrapper(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString(){
        return scanner.nextLine().trim();
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(){
        return scanner.nextDouble();
    }
}
