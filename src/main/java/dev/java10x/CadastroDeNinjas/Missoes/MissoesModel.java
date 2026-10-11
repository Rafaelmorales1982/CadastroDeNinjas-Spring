package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

//Anotação do Lombok
@NoArgsConstructor // gera construtor vazio
@AllArgsConstructor // Gera construtor com todos atributo e se eu declarar um novo atributo ja gera automático
//@Getter   - Gera os getters melhor usar @Data
//@Setter   - Gera os getters melhor usar @Data
@Data // gera Getters e Setters automáticamente
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
