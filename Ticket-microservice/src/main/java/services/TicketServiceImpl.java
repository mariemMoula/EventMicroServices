// Ticket-microservice/src/main/java/services/TicketServiceImpl.java
package services;

import entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repositories.TicketRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket ajouterTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Optional<Ticket> obtenirTicketParId(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public List<Ticket> obtenirTousLesTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket mettreAJourTicket(Long id, Ticket ticket) {
        if (ticketRepository.existsById(id)) {
            ticket.setIdTicket(id);
            return ticketRepository.save(ticket);
        }
        return null;
    }

    @Override
    public void supprimerTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}