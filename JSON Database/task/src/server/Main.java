package server;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        while (!scanner.hasNext("exit")) {
            String[] input = scanner.nextLine()
                    .replaceFirst("\\s", "%")
                    .replaceFirst("\\s", "%")
                    .split("%");
            int index = Integer.parseInt(input[1]);
            try {
                String elem = dataBase.get(index);
                switch (input[0]) {
                    case "get":
                        System.out.println(elem.length() != 0 ? elem : "ERROR");
                        System.out.println("OK");
                        break;
                    case "set":
                        dataBase.set(input[2], index);
                        System.out.println("OK");
                        break;
                    case "delete":
                        dataBase.delete(index);
                        System.out.println("OK");
                        break;
                    default:
                        System.out.println("ERROR");
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }
}