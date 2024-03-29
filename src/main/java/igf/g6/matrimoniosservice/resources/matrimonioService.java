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

    public List<matrimonio> getMatrimonioNombre(String primer_nombre, String segundo_nombre,
                                                String primer_apellido, String segundo_apellido){
        List<matrimonio> matrimonios = new ArrayList<>();
        matrimonioRepository.findAll().forEach(matrimonios::add);
        List<matrimonio> matrimonioEncontrado = new ArrayList<>();

        for (int i=0; i<matrimonios.size(); i++){
            if( (primer_nombre.equals(matrimonios.get(i).getNombre1Esposa()) ||
                    primer_nombre.equals(matrimonios.get(i).getNombre1Esposo()))
                    && (segundo_nombre.equals(matrimonios.get(i).getNombre2Esposa()) ||
                    segundo_nombre.equals(matrimonios.get(i).getNombre2Esposo())) &&
                    (primer_apellido.equals(matrimonios.get(i).getApellido1Esposa()) ||
                    primer_apellido.equals(matrimonios.get(i).getApellido1Esposo())) &&
                    (segundo_apellido.equals(matrimonios.get(i).getApellido2Esposa()) ||
                    segundo_apellido.equals(matrimonios.get(i).getApellido2Esposo()))){
                matrimonioEncontrado.add(matrimonios.get(i));
            }
        }
        return matrimonioEncontrado;
    }

    public List<matrimonio> getMatrimonioPorEsposos(String nombre1Esposo, String nombre2Esposo,
                                               String apellido1Esposo, String apellido2Esposo,
                                               String nombre1Esposa, String nombre2Esposa,
                                               String apellido1Esposa, String apellido2Esposa){
        List<matrimonio> matrimonios = new ArrayList<>();
        matrimonioRepository.findAll().forEach(matrimonios::add);
        List<matrimonio> matrimoniosEncontrados = new ArrayList<>();

        for (int i=0; i<matrimonios.size(); i++){
            if( (nombre1Esposa.equals(matrimonios.get(i).getNombre1Esposa()) &&
                    nombre1Esposo.equals(matrimonios.get(i).getNombre1Esposo())
                    && nombre2Esposa.equals(matrimonios.get(i).getNombre2Esposa()) &&
                    nombre2Esposo.equals(matrimonios.get(i).getNombre2Esposo()) &&
                    apellido1Esposa.equals(matrimonios.get(i).getApellido1Esposa()) &&
                    apellido1Esposo.equals(matrimonios.get(i).getApellido1Esposo()) &&
                    apellido2Esposa.equals(matrimonios.get(i).getApellido2Esposa()) &&
                    apellido2Esposo.equals(matrimonios.get(i).getApellido2Esposo())) && matrimonios.get(i).getVigente() == true){
                matrimoniosEncontrados.add(matrimonios.get(i));
            }
        }
        return matrimoniosEncontrados;
    }
}