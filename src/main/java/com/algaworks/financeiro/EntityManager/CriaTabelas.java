package com.algaworks.financeiro.EntityManager;

import javax.persistence.Persistence;

public class CriaTabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("FinanceiroPU");
	}
}
