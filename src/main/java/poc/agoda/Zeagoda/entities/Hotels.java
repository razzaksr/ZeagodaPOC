package poc.agoda.Zeagoda.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;
    private String name;
    private String city;
    private String type;
    private String address;
    private String description;
    private int distance;
    private double rating;
    private ArrayList<ByteArrayInputStream> photos=new ArrayList<>();
    @OneToMany(fetch= FetchType.LAZY,cascade = CascadeType.ALL)
    @Nullable
    @JsonBackReference
    @JoinTable(name="HotelWithRoom",joinColumns = @JoinColumn(name="HotelId"),inverseJoinColumns = @JoinColumn(name="RoomId"))
    private Collection<Rooms> rooms=new ArrayList<>();
    private int cheapestPrice;
    private boolean featured;
}
