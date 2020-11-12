package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
			
		//buscar pessoa no banco de dados
		Pessoa p = em.find(Pessoa.class,2);
		System.out.println(p);
		System.out.println("Pronto");
		em.close();
		enf.close();
	}

}
