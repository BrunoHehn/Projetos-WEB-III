package Hehn.Bruno.farmacia.controller;

import Hehn.Bruno.farmacia.model.Medicine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MedicineController {

    @GetMapping("/remedio")
    public Medicine getMedicine(){

        Medicine medicine = new Medicine();
        medicine.setName("Apiguaco Apis Flora Spray 30ml");
        medicine.setPrice(9.49);
        medicine.setDescription("Indicado no combate a gripes e refriados, este medicamento floral alívia também, tosses e irratações na garganta.");
        return medicine;
    }

    @GetMapping("/remedios")
    public ArrayList<Medicine> getMedicines(){

        Medicine medicine1 = new Medicine();
        medicine1.setName("Apiguaco Apis Flora Spray 30ml");
        medicine1.setPrice(9.49);
        medicine1.setDescription("Indicado no combate a gripes e refriados, este medicamento floral alívia também, tosses e irratações na garganta.");

        Medicine medicine2 = new Medicine();
        medicine2.setName("Fledoid Pomada 500 40g");
        medicine2.setPrice(26.56);
        medicine2.setDescription("Diminui a inflamação, com o alívio da dor, redução do inchaço e da vermelhidão de áreas com varizes ou manchas roxas e alivia a sensação de peso nas pernas causada pelo inchaço");

        ArrayList<Medicine> register = new ArrayList<>();
        register.add(medicine1);
        register.add(medicine2);
        return register;
    }
}
