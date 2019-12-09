package application.jpa.repositories;

import application.jpa.entities.ClientVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientVersionRepository extends JpaRepository<ClientVersion,Long> {
}
