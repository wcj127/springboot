import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Kalu on 2017/12/6.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRespository girlRespository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSiZe("A");
        girlA.setAge(18);

        girlRespository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSiZe("B");
        girlB.setAge(20);

        girlRespository.save(girlB);
    }
}
