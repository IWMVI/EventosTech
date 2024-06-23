package eventostec.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import eventostec.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
