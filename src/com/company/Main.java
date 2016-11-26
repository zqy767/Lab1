package com.company;
import com.sun.org.apache.xerces.internal.impl.dv.xs.IntegerDV;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.regex.*;
import  java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Select s = new Select();
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        while (!exp.equals("exit")) {
            s.divide(exp);
        }
    }
}
