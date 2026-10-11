package dev.java10x.CadastroDeNinjas.Ninjas;


import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// ENTITY ELE TRANSFORMA UMA CLASSE EM UMA ENTIDADE DO BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro") // criou nome da tabela


//Anotação do Lombok
@NoArgsConstructor // gera construtor vazio
@AllArgsConstructor // Gera construtor com todos atributo e se eu declarar um novo atributo ja gera automático
//@Getter   - Gera os getters melhor usar @Data
//@Setter   - Gera os getters melhor usar @Data
@Data // gera Getters e Setters automáticamente
public class NinjaModel  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String nome;

   @Column(unique = true) // coluna única - não pode ser repitido
   private String email;

   private int idade;

   // @ManyToIne um ninja tem uma unica missão
    // muitos ninjas pode ter uma missão
   @ManyToOne
   @JoinColumn(name = "missoes_id")
   private MissoesModel missoes;


}
