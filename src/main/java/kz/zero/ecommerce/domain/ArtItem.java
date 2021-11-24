package kz.zero.ecommerce.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArtItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(columnDefinition = "varchar")
    String name;

    @Column(columnDefinition = "varchar")
    String description;

    @ManyToOne()
    @JoinColumn(name = "categoryId")
    Category category;

}
