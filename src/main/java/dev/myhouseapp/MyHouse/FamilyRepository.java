package dev.myhouseapp.MyHouse;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends MongoRepository<Family, ObjectId> {
    Optional<Family> findFamilyByImdbId(String imdbId); 
    Family addFamilyByImdbId(Family family); 
}