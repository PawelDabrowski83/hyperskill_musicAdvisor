package org.hyperskill;

public class AppAccesor implements IUserValidator{
    private boolean isAuthenticated = false;

    public void auth(ScannerWrapper scanner) {
        System.out.println(App.AUTHENTICATE);
        String authLink = scanner.getString();
        if (authLink == null || authLink.isBlank()){
            isAuthenticated = false;
        } else {
            isAuthenticated = App.VALID_AUTHENTICATE_PATTERN.matcher(authLink).matches();
        }
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}
