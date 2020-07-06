package com.mishamba.day7.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocateUsage {
    public static void main(String[] args) {
        System.out.println("languages:\n1 - english\n2 - belarussian\nany - russian");
        for (int i = 0; i< 3; i++) {
            String country = "";
            String language = "";

            if (i == 1) {
                country = "US";
                language = "EN";
            } else if (i == 2) {
                country = "BY";
                language = "BE";
            }

            Locale current = new Locale(language, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("texts.text", current);

            String object = resourceBundle.getString("object");
            String action = resourceBundle.getString("action");

            System.out.println(language + " " + country);
            System.out.println(object + " " + action);
        }
    }
}
