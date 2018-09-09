package students.polsl.hd_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import students.polsl.hd_backend.entities.NfcHistoryEntity;

/**
 * Spring Data repository class that is used for saving data to database
 */
public interface NfcHistoryRepository extends JpaRepository<NfcHistoryEntity, Long> {
}
