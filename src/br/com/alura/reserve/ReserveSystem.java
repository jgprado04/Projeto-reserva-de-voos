package br.com.alura.reserve;

import br.com.alura.exception.ReserveException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReserveSystem {
    public static List<Reserve> reserveList = new ArrayList<>();

    public static void flightReserve(Reserve r) {
        try {
            if(r.getFlight().getChairAmount() > r.getFlight().getChairLimit()) {
                throw new ReserveException("Sorry, our flight are full!");
            }

            reserveList.add(r);
        } catch (ReserveException e) {
            System.err.println("The error is: " + e.getMessage());
        }
    }

    public static void cancelReserve(Reserve r) {
        reserveList.remove(reserveList.indexOf(r));
    }

    public static void showReserves() {
        reserveList.sort(Comparator.comparing(Reserve -> Reserve.getFlight().getDateHour()));
        reserveList.forEach(System.out::println);
    }
}
