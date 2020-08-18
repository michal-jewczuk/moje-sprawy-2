package net.jewczuk.mojesprawy2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client extends AbstractEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String commonName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Collection<ClientAddress> addresses;
}
