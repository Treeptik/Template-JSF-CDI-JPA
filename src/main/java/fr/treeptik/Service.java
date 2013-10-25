package fr.treeptik;

import javax.enterprise.context.*;
import javax.inject.Inject;

@ApplicationScoped
public class Service {

	@Inject
	private Bean bean;
}
