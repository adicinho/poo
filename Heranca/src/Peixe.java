public class Peixe extends Animal {
        private String diferencas;

        public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidadeMedia, String diferencas) {
            super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
            this.diferencas = diferencas;
        }


        public void dadosPeixe() {
            super.dados(); // Chama o método dados da classe Animal
            System.out.println("Diferencas: " + diferencas);
        }
    }

