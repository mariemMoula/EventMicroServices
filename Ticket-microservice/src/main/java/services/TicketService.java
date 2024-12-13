// Ticket-microservice/src/main/java/services/TicketService.java
package services;

import entities.Ticket;
import java.util.List;
import java.util.Optional;

public interface TicketService {
    Ticket ajouterTicket(Ticket ticket);
    Optional<Ticket> obtenirTicketParId(Long id);
    List<Ticket> obtenirTousLesTickets();
    Ticket mettreAJourTicket(Long id, Ticket ticket);
    void supprimerTicket(Long id);
}