package net.jewczuk.mojesprawy2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity {

    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private int verison;

    @Column(name="created_at", nullable=false)
    private long createdAt;

    @Column(name="updated_at")
    private long updatedAt;

    @PrePersist
    public void setCreationDate() {
        createdAt = Instant.now().getEpochSecond();
    }

    @PreUpdate
    public void setUpdateDate() {
        updatedAt = Instant.now().getEpochSecond();
    }
}
