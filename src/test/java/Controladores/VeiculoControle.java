package Controladores;
import com.exemplo.model.Veiculo;
import com.exemplo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/ano/{anoCompra}")
    public List<Veiculo> listarVeiculosPorAno(@PathVariable int anoCompra) {
        return veiculoService.getVeiculosPorAnoCompra(anoCompra);
    }

    @GetMapping("/modelo/{modelo}")
    public List<Veiculo> listarVeiculosPorModelo(@PathVariable String modelo) {
        return veiculoService.getVeiculosPorModelo(modelo);
    }

    @GetMapping("/top3-km")
    public List<Veiculo> listarTop3VeiculosMaiorKm() {
        return veiculoService.getTop3VeiculosMaiorKm();
    }
}
