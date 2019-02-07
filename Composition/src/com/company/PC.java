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

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
