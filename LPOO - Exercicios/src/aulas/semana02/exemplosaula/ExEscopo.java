package aulas.semana02.exemplosaula;

public class ExEscopo
{
	public static void main (String args[])
	{
		//Inicio do Bloco 0
		int i = 5;
		{
			//Inicio do Bloco 1
			int j = 0;
			j = 5 * i;
			System.out.println (i); //Dentro do escopo de i
			System.out.println (j); //Dentro do escopo de j
			{
				//Inicio do Bloco 2
				System.out.println (i); //Dentro do escopo de i
				System.out.println (j); //Dentro do escopo de j
			}
		}
		System.out.println (i); //Dentro do escopo de i
		//System.out.println (j); //ERRO! Fora do escopo de j
	}
}
