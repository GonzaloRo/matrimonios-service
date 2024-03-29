package igf.g6.matrimoniosservice.resources;

import igf.g6.matrimoniosservice.models.matrimonio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class matrimonioController {

    @Autowired
    private matrimonioService matrimonioService;

    @RequestMapping("/matrimonios")
    public List<matrimonio> getAllmatrimonio(){
    return matrimonioService.getAllMatrimonios();
    }

    @RequestMapping("/matrimonios/{id}")
    public matrimonio getMatrimonio(@PathVariable String id){
        return matrimonioService.getMatrimonio(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/matrimonios")
    public void addMatrimonio(@RequestBody matrimonio matrimonio){
        matrimonioService.addMatrimonio(matrimonio);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/matrimonios/{id}")
    public void updateMatrimonio(@RequestBody matrimonio matrimonio, @PathVariable String id){
        matrimonioService.updateMatrimonio(matrimonio);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/matrimonios/{id}")
    public void deleteMatrimonio(@PathVariable String id){
        matrimonioService.deleteMatrimonio(id);
    }

    @RequestMapping("/matrimonios/esposo/{id}")
    public matrimonio getMatrimonioByIdEsposo(@PathVariable String id){
        return matrimonioService.getByIdEsposo(id);
    }

    @RequestMapping("/matrimonios/esposa/{id}")
    public matrimonio getMatrimonioByIdEsposa(@PathVariable String id){
        return matrimonioService.getByIdEsposa(id);
    }

    @RequestMapping("matrimonios/{primer_nombre}/{segundo_nombre}/{primer_apellido}" +
            "/{segundo_apellido}")
    public List<matrimonio> getMatrimoniosPorNombre(@PathVariable String primer_nombre,@PathVariable String segundo_nombre,
                                                    @PathVariable String primer_apellido, @PathVariable String segundo_apellido){
        return matrimonioService.getMatrimonioNombre(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido);
    }

    @RequestMapping("matrimonios/{nombre1Esposo}/{nombre2Esposo}/{apellido1Esposo}" +
            "/{apellido2Esposo}/{nombre1Esposa}/{nombre2Esposa}/{apellido1Esposa}/{apellido2Esposa}")
    public List<matrimonio> getMatrimonioPorEsposos(@PathVariable String nombre1Esposo,@PathVariable String nombre2Esposo,
                                                  @PathVariable String apellido1Esposo, @PathVariable String apellido2Esposo,
                                                  @PathVariable String nombre1Esposa,@PathVariable String nombre2Esposa,
                                                  @PathVariable String apellido1Esposa, @PathVariable String apellido2Esposa){
        return matrimonioService.getMatrimonioPorEsposos(nombre1Esposo, nombre2Esposo, apellido1Esposo, apellido2Esposo, nombre1Esposa, nombre2Esposa, apellido1Esposa, apellido2Esposa);
    }

}