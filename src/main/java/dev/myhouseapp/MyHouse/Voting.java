package dev.myhouseapp.MyHouse;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "votes")
@Data // for getters and setters
@AllArgsConstructor // for constructors
@NoArgsConstructor
public class Voting {
    @Id
    private ObjectId vote_id;
    private ObjectId house_id;
    private String title;
    private String description;
    private Date start_date;
    private Date end_date;
    private List<String> options;
    private List<String> participants;
    private String creator;
}
