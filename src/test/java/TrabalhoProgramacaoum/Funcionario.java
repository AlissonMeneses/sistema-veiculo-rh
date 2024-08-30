package TrabalhoProgramacaoum;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String rg;
    private String habilitacao;
    private boolean autorizadoParaConducao;
}