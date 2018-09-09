package students.polsl.hd_backend.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import students.polsl.hd_backend.entities.NfcHistoryEntity;
import students.polsl.hd_backend.exceptions.UnsuccessfulDataPersistenceException;
import students.polsl.hd_backend.repositories.NfcHistoryRepository;


// MVC controller class
@RestController
@Slf4j
public class NfcHistoryController {

    @Autowired
    private NfcHistoryRepository nfcHistoryRepository;

    /**
     * Controller method that is responsible for defining type of request that server accepts
     * in this case it is POST HTTP method that is a trigger for data persistence of data included
     * in entity class.
     * @param nfcHistoryEntity body of nfcHistoryEntity that is passed by user (android app)
     * @return Information from database of saved NFcHistoryEntity entity filled with data typical for an enity (id)
     */
    @PostMapping("/process")
    public ResponseEntity<NfcHistoryEntity> createNewRestaurant(@RequestBody NfcHistoryEntity nfcHistoryEntity){
        NfcHistoryEntity savedEntry = nfcHistoryRepository.save(nfcHistoryEntity);
        if (savedEntry == null)
            throw new UnsuccessfulDataPersistenceException();
        log.info("nfc entry saved successfully");
        return ResponseEntity.ok(savedEntry);
    }
}
