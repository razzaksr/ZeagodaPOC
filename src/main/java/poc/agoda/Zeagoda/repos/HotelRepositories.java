package poc.agoda.Zeagoda.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.agoda.Zeagoda.entities.Hotels;

@Repository
public interface HotelRepositories extends JpaRepository<Hotels,Integer> {
}
