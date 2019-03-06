package com.company;

import java.util.*;

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<Seat>();
//    private List<Seat> seats = new LinkedList<Seat>();
//    private Collection<Seat> seats = new HashSet<>();
//    private Collection<Seat> seats = new LinkedHashSet<>();


    public Theatre(String theatreName, int rowNum, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (rowNum - 1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        int low = 0;
        int high = seats.size() - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);
            //The Java String compareTo() method is used for comparing two strings lexicographically.
            //If both the strings are equal then this method returns 0 else it returns positive or negative value.
            if(cmp < 0){
                low = mid + 1;
            } else if(cmp > 0){
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public void getSeats() {
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
