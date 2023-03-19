package dev.myhouseapp.MyHouse;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.*;

@Data // for getters and setters
@AllArgsConstructor // for constructors
@NoArgsConstructor

@Document(collection = "chores")
public class Chores {
    @Id
    private ObjectId chore_id;
    private String chore_name;
    private ObjectId assigned_to;
    private Date date_created;
    private Date date_due;
    private Date date_completed;
    private Boolean status;
    private int points;
    private String category;
    private String priority;

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }

    //todo: API endpoints, should be moved to separate file
    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category){
        return category;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return null;
        // return categories;//From Database
    }


    @Data // for getters and setters
    @AllArgsConstructor // for constructors
    @NoArgsConstructor
    public class Category{
        private String category_name;
    }
}
