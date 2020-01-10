package igf.g6.matrimoniosservice.interfaces;

import igf.g6.matrimoniosservice.models.matrimonio;
import org.springframework.data.repository.CrudRepository;

public interface matrimonioRepository extends CrudRepository<matrimonio, Long> {
    public matrimonio findByIdEsposo(long id);
    public matrimonio findByIdEsposa(long id);
}

