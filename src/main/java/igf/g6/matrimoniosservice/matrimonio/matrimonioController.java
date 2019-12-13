package igf.g6.matrimoniosservice.matrimonio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class matrimonioController {

    @Autowired
    private matrimonioService matrimonioService;

    @RequestMapping("/matrimonios")
    public List<matrimonio> getAllmatrimonio(){ return matrimonioService.getAllMatrimonios(); }

    @RequestMapping(method = RequestMethod.POST, value = "/matrimonios")

    public void addTopic(@RequestBody matrimonio matrimonio){

        matrimonioService.addMatrimonio(matrimonio);
    }

}