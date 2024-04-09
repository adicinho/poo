public class Animal {
        private String nome;
        private float comprimento;
        private int numPatas;
        private String cor;
        private String ambiente;
        private float velocidadeMedia;

        public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidadeMedia) {
            this.nome = nome;
            this.comprimento = comprimento;
            this.numPatas = numPatas;
            this.cor = cor;
            this.ambiente = ambiente;
            this.velocidadeMedia = velocidadeMedia;
        }


        public String getNome() {
            return nome;
        }
        public float getComprimento(){
            return comprimento;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setComprimento(float comprimento){
            this.comprimento = comprimento;
        }


        public void dados() {
            System.out.println("Nome: " + nome);
            System.out.println("Comprimento: " + comprimento + " cm");
            System.out.println("Patas: " + numPatas);
            System.out.println("Cor: " + cor);
            System.out.println("Ambiente: " + ambiente);
            System.out.println("Velocidade Média: " + velocidadeMedia + " m/s");
        }
    }

