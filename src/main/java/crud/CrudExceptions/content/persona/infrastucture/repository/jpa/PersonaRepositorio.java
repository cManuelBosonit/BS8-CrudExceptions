package crud.CrudExceptions.content.persona.infrastucture.repository.jpa;

import crud.CrudExceptions.content.persona.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    Persona findByUsuario(String usuario);
    Persona deleteById(int id_persona);

}
