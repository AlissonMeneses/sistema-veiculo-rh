package Repositorios;

import com.exemplo.model.Penalizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PenalizacaoRepository extends JpaRepository<Penalizacao, Long> {
    List<Penalizacao> findByFuncionario_Id(Long funcionarioId);
}