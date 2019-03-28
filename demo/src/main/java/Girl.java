import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Kalu on 2017/12/4.
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    private String cupSiZe;

    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public Girl setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCupSiZe() {
        return cupSiZe;
    }

    public Girl setCupSiZe(String cupSiZe) {
        this.cupSiZe = cupSiZe;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Girl setAge(Integer age) {
        this.age = age;
        return this;
    }
}