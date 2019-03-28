import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Kalu on 2017/12/4.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupSize;

    private String age;

    public String getCupSize() {
        return cupSize;
    }

    public GirlProperties setCupSize(String cupSize) {
        this.cupSize = cupSize;
        return this;
    }

    public String getAge() {
        return age;
    }

    public GirlProperties setAge(String age) {
        this.age = age;
        return this;
    }
}
