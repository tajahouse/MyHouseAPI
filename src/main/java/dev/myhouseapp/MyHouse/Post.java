package dev.myhouseapp.MyHouse;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "posts")
@Data // for getters and setters
@AllArgsConstructor // for constructors
@NoArgsConstructor

public class Post {
    @Id
    private ObjectId id;

    @DBRef
    private Family family;

    private String title;

    private String content;

    private Date dateCreated;


}
