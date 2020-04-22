package rogerio.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 33;
		String nome = "Rogério";
		String nomeDoMeuCachorro = "totó";
		String ano2014 = "2014";
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 33;
				
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má pratica
		int a = 10;
		String b = "Rogério";
	}

}
