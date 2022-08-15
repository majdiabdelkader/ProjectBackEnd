package tn.esprit.spring.entities;



import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Command")
public class Command implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCommand")
    private Long idCommand;
    @Temporal(TemporalType.DATE)
    private Date dateCommand;
    @Temporal(TemporalType.DATE)
    private Date dateLivraison;
    private String AdresseLivraison;
    private float FraisLivraison;
   
    
}
