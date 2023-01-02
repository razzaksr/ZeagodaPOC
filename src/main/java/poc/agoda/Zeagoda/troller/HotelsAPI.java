package poc.agoda.Zeagoda.troller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.agoda.Zeagoda.entities.Hotels;
import poc.agoda.Zeagoda.servs.HotelServs;

@RestController
@RequestMapping("/hotel")
public class HotelsAPI {

    @Autowired
    HotelServs hserv;

    @PostMapping("/")
    public String registerNewHotel(@RequestBody Hotels hotels){
        return hserv.addNew(hotels).getName()+" has added to site";
    }
}
