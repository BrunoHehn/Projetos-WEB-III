package Hehn.Bruno.gameStore.controller;

import Hehn.Bruno.gameStore.model.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GameController {

    @GetMapping("/game")
    public Game getGame(){
        Game game = new Game();

        game.setName("RESIDENT EVIL 2 / BIOHAZARD RE:2");
        game.setPrice(89.99);
        game.setDeveloper("CAPCOM Co., Ltd.");

        return game;
    }

    @GetMapping("/games")
    public ArrayList<Game> getGames(){

        Game game1 = new Game();

        game1.setName("RESIDENT EVIL 2 / BIOHAZARD RE:2");
        game1.setPrice(89.99);
        game1.setDeveloper("CAPCOM Co., Ltd.");

        Game game2 = new Game();

        game2.setName("Ori and the Will of the Wisps");
        game2.setPrice(129.00);
        game2.setDeveloper("Moon Studios GmbH");

        ArrayList<Game> register = new ArrayList<>();

        register.add(game1);
        register.add(game2);

        return register;
    }

}
