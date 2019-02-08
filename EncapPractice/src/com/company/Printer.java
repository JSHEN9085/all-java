package com.company;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = 0;
        }
        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int newToner){
        if (tonerLevel > 0 && newToner <= 100){
            if(this.tonerLevel + newToner > 100){
                return -1;
            }
            this.tonerLevel += newToner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int pages){
        int pageToPrint = pages;
        if (this.duplex){
            pageToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing at duplex mode");
        }
        this.pagePrinted += pages;
        return pagePrinted;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
