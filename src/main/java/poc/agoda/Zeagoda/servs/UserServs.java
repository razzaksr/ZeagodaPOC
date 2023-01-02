package poc.agoda.Zeagoda.servs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.agoda.Zeagoda.repos.UserRepositories;

@Service
public class UserServs {
    @Autowired
    UserRepositories urepo;
}
