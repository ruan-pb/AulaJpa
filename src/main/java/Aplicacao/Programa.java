package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
			em.getTransaction().begin();
		//remover uma pessoa no banco de dados
		Pessoa p = em.find(Pessoa.class,2);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		enf.close();
	}

}
