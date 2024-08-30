package Repositorios;

import com.exemplo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario> findByDataNascimentoMonth(int mes);
    List<Funcionario> findByAutorizadoParaConducao(boolean autorizado);
}