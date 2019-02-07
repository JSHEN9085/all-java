package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    // PC has many components(classes), and each of component(class) has many properties

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
