package students.polsl.hd_backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception class that represents 400 error and is used when data given by user are not correct, so request can not be
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Given data could not be saved, review them and try again")
public class UnsuccessfulDataPersistenceException extends RuntimeException{

}
