package Biblioteca.Catalisa.Biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "biblioteca")
public class LivrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoDoLivro;

    @Column(length = 50, nullable = false)
    private String nomeDoLivro;

    @Column(length = 50, nullable = false)
    private String autorDoLivro;

    @Column(length = 50, nullable = false)
    private String dataDeLancamento;
}
