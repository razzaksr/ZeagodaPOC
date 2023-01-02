package poc.agoda.Zeagoda.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.agoda.Zeagoda.entities.Rooms;

@Repository
public interface RoomsRepositories extends JpaRepository<Rooms,Integer> {
}
