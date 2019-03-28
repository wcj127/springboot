import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kalu on 2017/12/4.
 */
public interface GirlRespository extends JpaRepository<Girl, Integer> {//类名，id类型

    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
