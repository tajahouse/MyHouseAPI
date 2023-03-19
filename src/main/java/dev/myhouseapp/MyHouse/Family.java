package dev.myhouseapp.MyHouse;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

import java.util.Date;

@Document(collection = "families")
@Data // for getters and setters
@AllArgsConstructor // for constructors
@NoArgsConstructor

public class Family {
    @Id
    private ObjectId house_id;
    @Id
    private String imdbId;
    private String hoh1;
    private String hoh2;
    private String email_hoh1;
    private String email_hoh2;
    private String family_name;
    private String google_calendar;
    private Date creation_date;
//todo: Clean up
    // public ObjectId getHouse_id(){
    //     return house_id;
    // }

    // public void setHouse_id(ObjectId house_id){
    //     this.house_id = house_id;
    // }

    // public String getImbdId(){
    //     return imdbId;
    // }

    // public void setImbdId(String imdbId){
    //     this.imdbId = imdbId;
    // }

    // public String getHoh1(){
    //     return hoh1;
    // }

    // public void setHoh1(String hoh1){
    //     this.hoh1 = hoh1;
    // }

    // public String getHoh2(){
    //     return hoh2;
    // }

    // public void setHoh2(String hoh2){
    //     this.hoh2 = hoh2;
    // }

    // public String getEmail_hoh1(){
    //     return email_hoh1;
    // }

    // public void setEmail_hoh1(String email_hoh1){
    //     this.email_hoh1 = email_hoh1;
    // }

    // public String getEmail_hoh2(){
    //     return email_hoh2;
    // }

    // public void setEmail_hoh2(String email_hoh2){
    //     this.email_hoh2 = email_hoh2;
    // }

    // public String getFamily_name(){
    //     return family_name;
    // }

    // public void setFamily_name(String family_name){
    //     this.family_name = family_name;
    // }

    // public String getGoogle_calendar(){
    //     return google_calendar;
    // }

    // public void setGoogle_calendar(String google_calendar){
    //     this.google_calendar = google_calendar;
    // }

    // public Date getCreationDate(){
    //     return creation_date;
    // }

    // public void setCreationDate(Date creationDate){
    //     this.creation_date = creation_date;
    // }
}
