package exercise.Stefan;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("CinemaDigiPlex", 10, 12);

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        Collections.reverse(seatCopy);
        Collections.reverse(theatre.seats);
        printList(seatCopy);
        printList(theatre.seats);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02"))
            System.out.println("Reserved");
        else
            System.out.println("Unreserved");

	    /*if (theatre.reserveSeat("D02"))
            System.out.println("The reservation was successfully done");
	    else
            System.out.println("The seat is reserved");
	    theatre.cancelSeat("D02");*/
    }

    private static void printList (List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list)
            System.out.print(seat.getSeatNumber() + " ");
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
