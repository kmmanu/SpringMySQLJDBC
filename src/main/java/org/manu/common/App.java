package org.manu.common;

import org.manu.customer.dao.CustomerDAO;
import org.manu.customer.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(final String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		final CustomerDAO customerDAO = (CustomerDAO) context
				.getBean("customerDAO");
		final Customer customer = new Customer(1, "manu", 30);
		customerDAO.insert(customer);

		final Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);

	}
}
