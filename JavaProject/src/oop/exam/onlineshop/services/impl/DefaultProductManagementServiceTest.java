package .oop.exam.onlineshop.services.impl;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import .oop.exam.onlineshop.enteties.Product;
import .oop.exam.onlineshop.services.ProductManagementService;

public class DefaultProductManagementServiceTest {
	
	private ProductManagementService testInstance;
	
	@Before
	public void setUp() {
		testInstance = DefaultProductManagementService.getInstance();
	}
	
	@Test
	public void shouldFindProductById() {
		Product product = testInstance.getProducts()[0];
		
		assertSame(product, testInstance.getProductById(product.getId()));
	}

}
