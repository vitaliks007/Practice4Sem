import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vitaliy.task10.config.JavaConfig;
import ru.vitaliy.task10.entity.Junior;
import ru.vitaliy.task10.entity.Programmer;
import ru.vitaliy.task10.entity.Senior;

public class ApplicationTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Programmer junior = context.getBean(Junior.class);
        Programmer senior = context.getBean(Senior.class);
        junior.doCoding();
        senior.doCoding();
    }
}
