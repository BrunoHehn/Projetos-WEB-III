package Hehn.Bruno.gameStore.model;

import lombok.*;

/**
 * @author Bruno Hehn
 * @since 03/05/2020 17:11
 * @version Game Store 1.0
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Game {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Double price;

    @Getter @Setter
    private String developer;

}
