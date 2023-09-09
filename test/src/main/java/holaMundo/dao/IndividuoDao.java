package holaMundo.dao;

import holaMundo.domain.Individuo;
import org.springframework.data.repository.CrudRepository;

public interface IndividuoDao extends CrudRepository<Individuo, Long> {
}
