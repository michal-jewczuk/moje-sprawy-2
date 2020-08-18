package net.jewczuk.mojesprawy2;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Enabled
@Table(name = "client_addresses")
public class ClientAddress {

    @Column(name = "postal_name")
    private String postalName;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "zip", nullable = false)
    private String zipCode;

}
