@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ApiResponse<?> handle(Exception e) {
        return ApiResponse.fail(e.getMessage());
    }
}