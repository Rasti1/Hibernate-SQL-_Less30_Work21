package org.example.app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateUserView {

    public Map<String, String> getData() {
        System.out.println("\nCREATE FORM");
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        map.put("name", scanner.nextLine().trim());
        System.out.print("Input email in format example@mail.com: ");
        map.put("email", scanner.nextLine().trim());
        return map;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }


}
