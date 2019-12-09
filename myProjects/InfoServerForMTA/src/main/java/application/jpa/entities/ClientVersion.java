package application.jpa.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;

@Entity
@Data
@Table(name = "client_version")
@NoArgsConstructor
public class ClientVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double clientVersion;
    @Column(name = "support")
    private boolean support;
}
