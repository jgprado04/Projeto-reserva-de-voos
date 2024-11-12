package br.com.alura.main;

import br.com.alura.client.Client;
import br.com.alura.flight.Flight;
import br.com.alura.reserve.Reserve;
import br.com.alura.reserve.ReserveSystem;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("João", "144.643.794-94", 20);
        Client c2 = new Client("Lorena", "111.613.791-91", 19);
        Client c3 = new Client("Rodrigo Prado Lima", "213.463.312-22", 29);

        LocalDateTime d1 = LocalDateTime.of(2024, 8, 1, 10, 15);
        Flight f1 = new Flight("Brazil", "Argentina", d1, 2);

        Reserve r1 = new Reserve(c1, f1);
        Reserve r2 = new Reserve(c2, f1);
        //Reserve r3 = new Reserve(c3, f1);

        ReserveSystem.showReserves();
    }
}
