package TrabalhoProgramacaoum;

import jakarta.persistence.*;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String marca;
    private String categoria;
    private int anoFabricacao;
    private int anoCompra;
    private String tipoCombustivel;
    private int quantidadePassageiros;
    private String habilitacaoMinima;
    private String identificacao;
    private long quilometragem;
}
