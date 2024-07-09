package constant;

public enum HttpStatus {
    OK(200, "OK"),
    CREATED(201, "CREATED"),
    NO_CONTENT(204, "NO CONTENT"),
    FOUND(302, "FOUND"),
    BAD_REQUEST(400, "BAD REQUEST"),
    NOT_FOUND(404, "NOT FOUND"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL SERVICE ERROR");

    final int statusCode;
    String message;

    HttpStatus(int statusCode, String message) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}