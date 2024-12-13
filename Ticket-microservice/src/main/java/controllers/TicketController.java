// Ticket-microservice/src/main/java/controllers/TicketController.java
package controllers;

import entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.TicketService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    public Ticket ajouterTicket(@RequestBody Ticket ticket) {
        return ticketService.ajouterTicket(ticket);
    }

    @GetMapping("/{id}")
    public Optional<Ticket> obtenirTicketParId(@PathVariable Long id) {
        return ticketService.obtenirTicketParId(id);
    }

    @GetMapping
    public List<Ticket> obtenirTousLesTickets() {
        return ticketService.obtenirTousLesTickets();
    }

    @PutMapping("/{id}")
    public Ticket mettreAJourTicket(@PathVariable Long id, @RequestBody Ticket ticket) {
        return ticketService.mettreAJourTicket(id, ticket);
    }

    @DeleteMapping("/{id}")
    public void supprimerTicket(@PathVariable Long id) {
        ticketService.supprimerTicket(id);
    }
}