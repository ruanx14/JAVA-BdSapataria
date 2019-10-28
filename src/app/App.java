package app;

import views.BdSapataria;
import controllers.BdSapatariaController;

public class App {
    public static void main(String[] args) {
        new BdSapatariaController(new BdSapataria());
    }
}
