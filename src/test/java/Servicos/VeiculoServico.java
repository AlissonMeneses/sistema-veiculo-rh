package Servicos;

import com.exemplo.model.Veiculo;
import com.exemplo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> getVeiculosPorAnoCompra(int anoCompra) {
        return veiculoRepository.findByAnoCompra(anoCompra);
    }

    public List<Veiculo> getVeiculosPorModelo(String modelo) {
        return veiculoRepository.findByModelo(modelo);
    }

    public List<Veiculo> getTop3VeiculosMaiorKm() {
        return veiculoRepository.findTop3ByOrderByQuilometragemDesc();
    }
}
