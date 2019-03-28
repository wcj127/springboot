import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kalu on 2017/12/3.
 */
@RestController
/*@Controller
@ResponseBody*/
public class HelloController {

/*    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;*/

   /* @Value("${content}")
    private String content;*/

    @Autowired
    private GirlProperties girlProperties;

/*    @RequestMapping(value = {"/hello/{id}", "/{id}/hi"}, method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {*/
/*    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)///hello?id=100
    public String say(@RequestParam("id") Integer userId) {*/
//    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)///hello?id=100
    @GetMapping(value = "/hello")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer userId) {
//        return "hello spring boot";
//        return cupSize;
//        return content;
//        return girlProperties.getCupSize();
//        return "index";
        return "id = " + userId;
    }

}
