package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/evidence.csv")

    public void test(int expected, int first, int second) {

        SQRService service = new SQRService();

        int actual = service.calculationOfNumberOfSquares(first, second);

        Assertions.assertEquals(expected, actual);
    }
}
