public class TesteAnimais {
    public static void main(String[] args) {
        Mamifero1 cavalo = new Mamifero1("Cavalo", 150, 4, "Branco", "Terra", 2.0f, "");
        Peixe baleia = new Peixe("Baleia", 300, 0, "Azul", "Mar", 1.5f, "Cauda");
        Mamifero1 ursopolar = new Mamifero1("UrsoPolar", 180, 4, "Branco", "Terra/Neve", 0.5f, "Mel");


        cavalo.dados();
        System.out.println();
        baleia.dadosPeixe();
        System.out.println();
        ursopolar.dadosMamifero1();
    }
}

