package eventostec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import eventostec.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, UUID>{

}
