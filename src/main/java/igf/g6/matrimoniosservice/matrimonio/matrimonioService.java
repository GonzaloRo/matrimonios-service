package igf.g6.matrimoniosservice.matrimonio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class matrimonioService {
    @Autowired
    private matrimonioRepository matrimonioRepository;

    public List<matrimonio> getAllMatrimonios(){
        List<matrimonio> matrimonios = new ArrayList<>();
        matrimonioRepository.findAll().forEach(matrimonios::add);
        return matrimonios;
    }

    public void addMatrimonio(matrimonio matri) {
        matrimonioRepository.save(matri);
    }

    public void updateMatrimonio(Long id,matrimonio matri) {
        matrimonioRepository.save(matri);
    }

    public void deleteMatrimonio(Long id) {matrimonioRepository.deleteById(id); }

}