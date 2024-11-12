package br.com.alura.reserve;

import br.com.alura.client.Client;
import br.com.alura.flight.Flight;

public class Reserve {
    private Client client;
    private Flight flight;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Reserve(Client c, Flight f) {
        this.setClient(c);
        this.setFlight(f);
        f.setChairAmount(f.getChairAmount() + 1);
        ReserveSystem.flightReserve(this);
    }

    @Override
    public String toString() {
        return client.getName() + " - from " + flight.getFrom() + " to " + flight.getTo() + " in " + getFlight().getDateHour();
    }

}
