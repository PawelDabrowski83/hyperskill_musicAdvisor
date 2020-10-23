package org.hyperskill;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    protected static final String AUTHENTICATE = "Please, provide access for application.";
    protected static final Pattern VALID_AUTHENTICATE_PATTERN =
            Pattern.compile("https://accounts\\.spotify\\.com/authorize\\?client_id=(.+?)&redirect_uri=(.+)");

    private final IUserValidator userValidator;
    private final ScannerWrapper scannerWrapper;

    public App(IUserValidator userValidator, Scanner scanner) {
        this.userValidator = userValidator;
        this.scannerWrapper = new ScannerWrapper(scanner);
    }


}
