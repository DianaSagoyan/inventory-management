package inventorymngmt.inventorymanagement.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseWrapper {
    private boolean success;
    private String message;
    private int code;
    private Object data;

    public ResponseWrapper(String message, HttpStatus status, Object data) {
        this.success = true;
        this.message = message;
        this.code = status.value();
        this.data = data;
    }

    public ResponseWrapper( String message, HttpStatus status) {
        this.success = true;
        this.message = message;
        this.code = status.value();
    }
}
