package server;

import java.util.Arrays;

public class DataBase {
    private final String[] date = new String[100];

    DataBase() {
        Arrays.fill(date, "");
    }

    public void set(String line, int ceil) {
        date[--ceil] = line;
    }

    public String get(int ceil) {
        return date[--ceil];
    }

    public void delete(int ceil) {
        date[--ceil] = "";
    }
}