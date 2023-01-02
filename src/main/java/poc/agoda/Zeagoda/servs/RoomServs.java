package poc.agoda.Zeagoda.servs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.agoda.Zeagoda.repos.RoomsRepositories;

@Service
public class RoomServs {
    @Autowired
    RoomsRepositories rrepo;
}
