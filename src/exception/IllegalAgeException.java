package exception;
/**自定义异常：说明项目组那些因为不满足业务而导致的错误
 * 自定义异常3点
 * 1类型见名知意
 * 2继承自exception（直接或简介继承）
 * 3提供超类异常定义的所有构造器*/
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
