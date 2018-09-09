package students.polsl.hd_backend.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * MVC Model class that is used to store data, that is persisted in database
 */
@Entity // Hibernate annotation that allows to register this class as type that can be persisted in database
@Data // Lombok annotation that generates useful methods as getters, setters, toString, hashCode
public class NfcHistoryEntity {
    @GeneratedValue // Id of concrete objects will be handled by database (every new object will have id of previous + 1)
    @Id
    private Long id;

    private String userId; // Stores nfc id that can be retrieved from phone that has this feature built in
    private String note; // Stores User note
    private String localization; // Stores localization as longitude and latitude
}
