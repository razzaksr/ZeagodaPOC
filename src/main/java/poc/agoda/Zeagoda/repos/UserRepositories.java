package poc.agoda.Zeagoda.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.agoda.Zeagoda.entities.Users;

@Repository
public interface UserRepositories extends JpaRepository<Users,Integer> {
}
