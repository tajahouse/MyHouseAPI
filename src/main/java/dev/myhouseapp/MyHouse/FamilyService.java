package dev.myhouseapp.MyHouse;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {

    @Autowired
    private FamilyRepository familyRepository;

    public List<Family> allFamilies(){
        return familyRepository.findAll();
    }
    public Optional<Family> singleFamily(String imdbId){
        return familyRepository.findFamilyByImdbId(imdbId);
    }
    public Family addFamily(Family family){
        return familyRepository.addFamilyByImdbId(family);
    }
}
