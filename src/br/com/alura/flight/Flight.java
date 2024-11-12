package br.com.alura.flight;

import java.time.LocalDateTime;

public class Flight {
    private int numberFlight = (int) (Math.random()*4000 + 1);
    private String from;
    private String to;
    private int chairAmount;
    private int chairLimit;
    private LocalDateTime dateHour;

    public LocalDateTime getDateHour() {
        return dateHour;
    }

    public void setDateHour(LocalDateTime dateHour) {
        this.dateHour = dateHour;
    }

    public int getChairAmount() {
        return chairAmount;
    }

    public void setChairAmount(int chairAmount) {
        this.chairAmount = chairAmount;
    }

    public void setNumberFlight(int numberFlight) {
        this.numberFlight = numberFlight;
    }

    public int getChairLimit() {
        return chairLimit;
    }

    public void setChairLimit(int chairLimit) {
        this.chairLimit = chairLimit;
    }

    public int getNumberFlight() {
        return numberFlight;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight(String from, String to, LocalDateTime dateHour, int chairLimit) {
        this.from = from;
        this.to = to;
        this.dateHour = dateHour;
        this.chairLimit = chairLimit;
    }
}
