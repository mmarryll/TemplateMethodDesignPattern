//Покрытие юнит-тестами
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class Tests {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Milkshake milkshake = new BananaAndCocoaMilkshake();
        milkshake.makeMilkshake();
        Assertions.assertEquals("Milk has been added." + System.lineSeparator() + "Ice-cream has been added."
                + System.lineSeparator() + "Banana has been added." + System.lineSeparator() + "Cocoa has been added."
                + System.lineSeparator(), output.toString());
    }

    @Test
    public void test2() {
        Milkshake milkshake = new StrawberryAndCookiesMilkshake();
        milkshake.makeMilkshake();
        Assertions.assertEquals("Milk has been added." + System.lineSeparator() + "Ice-cream has been added."
                + System.lineSeparator() + "Strawberry has been added." + System.lineSeparator() + "Cookies have been added."
                + System.lineSeparator(), output.toString());
    }
    @AfterEach
    public void cleanUpStreams() {
        System.setOut(standardOut);
    }

}