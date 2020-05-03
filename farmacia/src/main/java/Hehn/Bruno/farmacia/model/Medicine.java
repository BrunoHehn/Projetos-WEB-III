package Hehn.Bruno.farmacia.model;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Medicine {

        @Getter
        @Setter
        private String name;

        @Getter @Setter
        private Double price;

        @Getter @Setter
        private String description;
}
