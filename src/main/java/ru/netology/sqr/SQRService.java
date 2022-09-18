package ru.netology.sqr;

public class SQRService {
    public static int calculationOfNumberOfSquares(int min, int max) {
        int answer = 0;

        for (int i = 10; i <= 99; i++) {
            int square = i * i;

            if (square >= min && square <= max) {
                answer += 1;
            }
        }

        return answer;
    }
}
