package poc.agoda.Zeagoda.servs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.agoda.Zeagoda.entities.Hotels;
import poc.agoda.Zeagoda.repos.HotelRepositories;

@Service
public class HotelServs {
    @Autowired
    HotelRepositories hrepo;

    public Hotels addNew(Hotels hotels){
        return hrepo.save(hotels);
    }
}
