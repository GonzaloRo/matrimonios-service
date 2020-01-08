package igf.g6.matrimoniosservice.resources;
import igf.g6.matrimoniosservice.models.matrimonio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class matrimonioService {
    @Autowired
    private igf.g6.matrimoniosservice.interfaces.matrimonioRepository matrimonioRepository;

    public List<matrimonio> getAllMatrimonios(){
        List<matrimonio> matrimonios = new ArrayList<>();
        matrimonioRepository.findAll().forEach(matrimonios::add);
        return matrimonios;
    }

    public matrimonio getMatrimonio(String id){
        return matrimonioRepository.findById(Long.parseLong(id)).orElse(null);
    }

    public void addMatrimonio(matrimonio matrimonio) {
        matrimonioRepository.save(matrimonio);
    }

    public void updateMatrimonio(matrimonio matrimonio) {
        matrimonioRepository.save(matrimonio);
    }

    public void deleteMatrimonio(String id) {
        matrimonioRepository.deleteById(Long.parseLong(id));
    }

    public matrimonio getByIdEsposo(String id){
        return matrimonioRepository.findByIdEsposo(Long.parseLong(id));
    }

    public matrimonio getByIdEsposa(String id){
        return matrimonioRepository.findByIdEsposa(Long.parseLong(id));
    }


}