package com.bangi;

public class Strings {
    public static void main(String[] args) {
        String firstName = new String("Deekshith");
        StringBuilder middleName = new StringBuilder("middle name");
        StringBuffer lastName = new StringBuffer("Bangi");

        concat1(firstName);
        concat2(middleName);
        concat3(lastName);
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
    }
    private static void  concat1(String firstName) {
        firstName += "concat1";
    }
    private static void  concat2(StringBuilder middleName){
        middleName.append(" concat2");
    }
    private static void  concat3(StringBuffer lastName) {
        lastName.append(" concat3");
    }
}
