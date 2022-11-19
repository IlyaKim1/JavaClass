package com.java.class19;

public class StringAndStringMethods {
    public static void main(String[] args) {
        String object1 = "Hello";
        String object2 = "Hello";
        String object3 = new String("Hello");
        int a = 20;

        System.out.println(object1 == object3);

        // 1. Change case of String
        System.out.println(object2.toUpperCase());
        System.out.println(object3.toLowerCase());

        // 2. Check equality of Strings
        System.out.println(object1.equals(object2));
        System.out.println(object1.equals(object3));

        // 3. Equals ignoring the case of String
        System.out.println(object1.equalsIgnoreCase(object2));
        System.out.println(object1.equalsIgnoreCase(object3));

        // 4. Contains
        String object4 = "Hello, Ilya, Welcome to Walmart";
        System.out.println(object4.contains(object1));
        System.out.println(object4.contains(object2));
        System.out.println(object4.toLowerCase().contains(object3.toLowerCase()));

        // 5. Character at Particular Index
        System.out.println(object4.charAt(15));

        // 6. Index of particular Char
        System.out.println(object4.indexOf('c'));

        // 7. Length of the String
        System.out.println(object4.length());

        // 8. Check if String is empty
        String obj5 = "   ";
        System.out.println(obj5.isEmpty());
//        System.out.println(obj5.isBlank()); Doesn't work with Java 8

        // 9. Trim - trimming spaces before and after String
        String obj6 = "          my name is       Hello                ";
        System.out.println(obj6.trim());

        // 10. SubString
        String obj7 = "Hello User, Welcome to Ebay";
        System.out.println(obj7.substring(6));// We tell from what index to start printing (6) the String
        System.out.println(obj7.substring(6, 10));// We tell from which index to start (6) and when to end (9)

        // 11. Format
        String title = "Hello %s, Welcome to %s";
        String user = "Ilya";
        String website = "Amazon";
        System.out.println(String.format(title, user, website));

        // 12. Replace
        String title1 = "Hello ZZZ, Welcome to $$$";
        System.out.println(title1.replace("ZZZ", user + "0").replace("$$$", website + "1"));
        // replaceAll() -> We will learn this one once we cover the regular expression

        // 13. Split
        String title2 = "Hello User, Welcome to Ebay";
        String words[] = title2.split(" ");

        System.out.println(words.length);
    }
}
