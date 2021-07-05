package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path to file");
        String path = new Scanner(System.in).nextLine();
        System.out.println("Enter the words to searching");
        String regex = new Scanner(System.in).nextLine();

        Pattern p = Pattern.compile(regex);

        BufferedReader b = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        while (b.ready())
            sb.append(b.readLine()).append("\n");//все добавляем в StringBuilder
        b.close();

        Matcher m = p.matcher(sb);
        while (m.find())
            System.out.print(m.group());

    }
}