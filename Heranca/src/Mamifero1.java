public class Mamifero1 {
    public class Mamifero extends Animal {
        private String alimento;

        public Mamifero(String nome,
                        float comprimento,
                        int numPatas,
                        String cor,
                        String ambiente,
                        float velocidadeMedia,
                        String alimento) {
            super(nome,
                    comprimento,
                    numPatas,
                    cor,
                    ambiente,
                    velocidadeMedia);
            this.alimento = alimento;
        }

        public void dadosMamifero() {
            super.dados(); // Chama o método dados da classe Animal
            System.out.println("Alimento: " + alimento);
        }
    }
}