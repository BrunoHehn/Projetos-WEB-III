package Hehn.Bruno.Livraria.model;

import lombok.*;


@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Double price;

    @Getter @Setter
    private String author;

}
