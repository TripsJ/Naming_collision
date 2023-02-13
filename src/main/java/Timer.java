import java.time.LocalDateTime;

public class Timer implements Command{
    @Override
    public void execute() {
        System.out.println(LocalDateTime.now());
    }
}
