package br.edu.ifrs.canoas.jee.webapp.model.dao;

import java.util.List;

import br.edu.ifrs.canoas.jee.webapp.model.TipoDeQuarto;
import br.edu.ifrs.canoas.jee.webapp.model.entity.Quarto;

public class QuartoDAO extends BaseDAO<Quarto, Long> {
	public List<Quarto> buscaPorNumero(String numero){
		List<Quarto> query = em.createQuery(
				"SELECT quarto FROM Quarto quarto WHERE quarto.numero = :numero", Quarto.class
				).setParameter("numero", numero)
				.getResultList();
		em.close();
		return query;
	}
	public List<Quarto> buscaPorTipo(TipoDeQuarto tipo){
		List<Quarto> query = em.createQuery(
				"SELECT quarto FROM Quarto quarto WHERE quarto.tipo = :tipo", Quarto.class
				).setParameter("tipo", tipo)
				.getResultList();
		em.close();
		return query;
	}
}