package dev.myhouseapp.MyHouse;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "profiles")
@Data // for getters and setters
@AllArgsConstructor // for constructors
@NoArgsConstructor

public class Profile {
    private ObjectId profile_id;
    private ObjectId house_id; // foreign key to the household
    private String user_identity;
    private String name;
    private String bio;
    private Date birth_date;
    private String email;
    private String calendar;
    private String profile_pic_url;
    private int rewards_points;
    private List<Rewards> rewards_cart;
}
