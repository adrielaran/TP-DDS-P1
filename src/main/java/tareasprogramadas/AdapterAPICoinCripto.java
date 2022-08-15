package tareasprogramadas;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
@Component
public class AdapterAPICoinCripto {
    @Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate() {
        System.out.println("FUNCIONA");
    }
}
