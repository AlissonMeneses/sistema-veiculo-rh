package TrabalhoProgramacaoum;
import jakarta.persistence.*;

@Entity
public class Penalizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String restricao;
    private String periodo;

    @ManyToOne
    private Funcionario funcionario;
}
