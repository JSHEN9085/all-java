package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count " + printer.getPagePrinted());

        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagePrinted());

        pagesPrinted = printer.printPage(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagePrinted());

    }
}
