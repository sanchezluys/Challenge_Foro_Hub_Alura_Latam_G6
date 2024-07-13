package med.voll.api.domain.topicos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepository extends JpaRepository<Topico, Long>
{
    Page<Topico> findByActivoTrue(Pageable paginacion);

    @Query("""
            select t.activo
            from Topico t
            where t.id=:idTopico 
            """)
    Boolean findActivoById(Long idTopico);
}
