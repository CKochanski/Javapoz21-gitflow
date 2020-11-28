package pl.sda;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
    }
}
