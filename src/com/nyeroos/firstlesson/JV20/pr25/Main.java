package com.nyeroos.firstlesson.JV20.pr25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        regular("0.0.0.0");
        regular("192.167.213.123");
        regular("-1.3.2.3");
        regular("joker");

        regularBrackets("(3*+*5)*–*9*×*4.");
        regularBrackets("((3*+*5)*–*9*×*4.");
        regularBrackets("(3*+*5)*–*9)*×*4.");
        regularBrackets("(3*+*5)*–*9()*×*4.");
    }

    public static void regular(String c) {
        String regex = "^(((25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]|0)\\.){3}(25[0-5]|2[0-4][0-9]|[1]?[1-9][1-9]|0))";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(c);
        if (matcher.find()) System.out.println(c.substring(matcher.start(), matcher.end()));
        else System.out.println("Wrong IP " + c);
    }

    public static void regularBrackets(String c) {
        String temp = c;
        Pattern rg = Pattern.compile("\\([^\\(\\)]*\\)");
        Pattern rgMini = Pattern.compile("[^\\(\\)]");
        temp = rgMini.matcher(temp).replaceAll("");

        Matcher mg = rg.matcher(temp);
        while (true) {
            if (mg.find()) temp = mg.replaceAll("");
             else {
                if (temp.length() == 0) System.out.println("Right: " + c);
                else System.out.println("Wrong: " + c);
                return;
            }
        }
    }
}
