package ExceptClass;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ExceptClass {
    public static void main(String[] args) {
        process1(-1);

    }
    static void process1(int age){
        if (age <= 0){
            throw new IllegalArgumentException();
        }
    }
}
