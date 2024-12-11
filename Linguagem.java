package com.mycompany.projectmain;
import java.util.*;
public class Linguagem {
    public static void main(String[] args) {
        Locale locale = new Locale("PORTUGUESE", "PT");
        System.out.println("Linguagem: " + locale.getDisplayLanguage());
    }
}