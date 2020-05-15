package application;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Listas
{
	public static void main(String[] args)
	{
		/**
		 * List -> import java.util.List
		 * ArrayList -> import java.util.ArrayList;
		 * collect(Collectors.toList() -> import java.util.stream.Collectors
		 */
		List<String> list= new ArrayList<String>();
		
		list.add("Mary");
		list.add("Alex");
		list.add("Anna");
		list.add("Bob");
		list.add(2, "Marco");
		
		//tamanho da lista
		System.out.println("List length: " + list.size());
		System.out.println("------------------------------");
		
		//la�o for each para acessar os valores da lista
		for(String name : list)
		{
			System.out.println(name);
		}
		
		System.out.println("------------------------------");

		//remover todos os elementes a partir de um dado valor
		list.removeIf(name -> name.charAt(0) == 'M');
		for(String name : list)
		{
			System.out.println(name);
		}
		System.out.println("------------------------------");
		
		//posi��o na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------------");
	
		//filtrar a lsista de acordo com um valor
		/* 1 - instanciar uma nova lista
		 * 2 - pegar a lista original
		 * 3 - converte-la para stream (tipo especial a partir do java 8 que aceita opera��es com express�es lambda)
		 * 4 - a partir da stream chamar a fun��o filter que recebe um predicado
		 * 5 - como o stream n�o � compat�vel com list dever� ser convertido novamente para lista com a fun��o collect
		*/
		
		List<String> result = list.parallelStream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String name : result)
		{	
			System.out.println(name);
		}
		System.out.println("------------------------------");
		//encontrar um elemento da lista que atenda a um predicado
		/* 1 - instanciar uma string 
		 * 2 - pegar a lista original
		 * 3 - converter para stream
		 * 4 - a partir da stream chamar a fun��o finFirst para pegar o primeiro elemento com aquele predicado
		 * 5 - caso n�o exista retornar� atrv�s da fun��o orElse a valor null
		 */
		
		String res = list.stream().filter(name -> name.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(res);
	}
}
