import java.util.Scanner;

public class App {

        public String Nome;
        public String Sobrenome;
        public int Idade;
        public int Turma;
        public int MediaAluno;
        public String Disciplina;
        public String Situacao;
        public String Palavra;

        Scanner ler = new Scanner(System.in);
        public void setNome(String nome) {
            Nome = nome;
        }
        public String getNome(){
            return Nome;
        }

        public void setSobrenome(String sobrenome){
            Sobrenome = sobrenome; 
        }
        public String getSobrenome(){
            return Sobrenome;
        }

        public void setIdade(int idade){
            Idade = idade;
        }
        public int getIdade(){
            return Idade;
        }

        public void setTurma(int turma){
            Turma = turma;
        }
        public int getTurma(){
            return Turma;
        }

        public void setMediaAluno(int mediaAluno){
            MediaAluno = mediaAluno;
        }
        public int getMediaAluno(){
            return MediaAluno;
        }

        public void setDisciplina(String disciplina){
            Disciplina = disciplina;
        }
        public String getDisciplina(){
            return Disciplina;
        }

        public void setSituacao(String situacao){
            Situacao = situacao;
        }
        public String getSituacao(){
            return Situacao;
        }

        public void setPalavra(String palavra){
            Palavra = palavra;
        }
        public String getPalavra(){
            return Palavra;
        }


        public void preencherDados(){
            
            System.out.println("Escreva o seu nome:");
            Nome = ler.next();
            
            System.out.println("Escreva seu sobrenome:");
            Sobrenome = ler.next();
            
            System.out.println("Escreva sua idade:");
            Idade = ler.nextInt();
            
            System.out.println("Escreva sua turma:");
            Turma = ler.nextInt();
            
            System.out.println("Escreva a média do aluno:");
            MediaAluno = ler.nextInt();

            System.out.println("Escreva a discplina:");
            Disciplina = ler.next();

            System.out.println("Escreva qualquer palavra:");
            Palavra = ler.next();
 
            setNome(Nome);
            setSobrenome(Sobrenome);
            setIdade(Idade);
            setTurma(Turma);
            setMediaAluno(MediaAluno);
            setDisciplina(Disciplina);
            setPalavra(Palavra);

        }
 
        public void gerarNomeCompleto(){
            String Nome = this.getNome();
            String Sobrenome = this.getSobrenome();

            System.out.println(Nome + " " + Sobrenome);
               
        }

        public void converterMaiusculo(){
            String PalavraMaiscula = getPalavra().toUpperCase();

            System.out.println(PalavraMaiscula);
        }

        public void validarAprovacao(){
            int MediaAluno = this.getMediaAluno();
            String situacao;

            if ( MediaAluno >= 6 ) {
                situacao = "Aprovado";
            }else{
                situacao = "Reprovado";
            }
            this.setSituacao(situacao);
            
        }

        public void detalhe(){
            System.out.println("=============== INFORMAÇÕES ===============");
            System.out.println("Nome: " + this.getNome());
            System.out.println("Sobrenome: " + this.getSobrenome());
            System.out.println("Idade: " + this.getIdade());
            System.out.println("Turma: " + this.getTurma());
            System.out.println("Média: " + this.getMediaAluno());
            System.out.println("Discipilna: " + this.getDisciplina());
            System.out.println("O aluno está: " + this.getSituacao());
            System.out.println("Palavra escolhida foi: " + this.getPalavra().toUpperCase());
        }


        public static void main(String[] args) throws Exception {
            
            App pessoa = new App();

            pessoa.preencherDados();
            pessoa.gerarNomeCompleto();
            pessoa.converterMaiusculo();
            pessoa.validarAprovacao();
            pessoa.detalhe();
        }
}