package dev.myhouseapp.MyHouse;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/families")
public class FamilyController {
    
    @Autowired
    private FamilyService familyService;

    @GetMapping
    public ResponseEntity<List<Family>> getAllFamilies(){
        //todo: Write edge cases
        return new ResponseEntity<List<Family>>(familyService.allFamilies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Family>> getSingleFamily(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Family>>(familyService.singleFamily(imdbId), HttpStatus.OK);
    }
}
