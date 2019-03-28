import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kalu on 2017/12/4.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRespository girlRespository;

    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRespository.findAll();
    }

    /**
     * 添加
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSiZe(cupSize);
        girl.setAge(age);
        return girlRespository.save(girl);
    }

    //查询一个
    @GetMapping(value = "girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRespository.findOne(id);
    }

    //更新
    @GetMapping(value = "girls/{id}")
    public void girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSiZe(cupSize);
        girl.setAge(age);
        girlRespository.save(girl);
    }

    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        girlRespository.delete(id);
    }

    //通过年龄查询列表
    @GetMapping(value = "/girls/age")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRespository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo() {
        girlService.insertTwo();
    }
}
