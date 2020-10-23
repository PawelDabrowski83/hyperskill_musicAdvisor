package org.hyperskill;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;

public class ScannerWrapperTest {

    Scanner scanner = mock(Scanner.class);
    ScannerWrapper scannerWrapper = new ScannerWrapper(scanner);

    @Test
    public void shouldGetStringWork(){
        // given
        String expected = "expectedString";
        when(scanner.nextLine()).thenReturn(expected);

        // then
        String actual = scannerWrapper.getString();
        assertThat("scannerWrapper gets a string", actual.equals(expected));


    }
}
