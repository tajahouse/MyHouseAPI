package dev.myhouseapp.MyHouse;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "rewards")
@Data // for getters and setters
@AllArgsConstructor // for constructors
@NoArgsConstructor
public class Rewards {
    @Id
    private ObjectId reward_id;
    private String reward_name;
    private String reward_description;
    private int cost;
    private boolean approved;
}
