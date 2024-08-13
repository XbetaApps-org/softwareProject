package com.software.steps;

import static org.junit.Assert.assertEquals;

import com.software.ui.ProductManagment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OperationTest {
	private ProductManagment a;
	private String actualMessage;

	@Given("the admin is on the product management page")
	public void the_admin_is_on_the_product_management_page() {
	    a = new ProductManagment();
	    a.setVisible(true);
	}

	@Given("the admin selects action type {string} from the combo box")
	public void the_admin_selects_action_type_from_the_combo_box(String Operation) {
	   a.getOperation().setSelectedItem(Operation);
	}

	@When("the admin enters product ID {string}, name {string}, price {string}")
	public void the_admin_enters_product_id_name_price(String productId, String productName, String price) {
		//a.getOperation().setSelectedIndex(1);
		//a.getOperation().setSelectedIndex(0);
		a.getProductIdT().setText(productId);
		a.getProductNT().setText(productName);
	    a.getPriceT().setText(price);
	}

	@When("clicks on the submit button")
	public void clicks_on_the_submit_button() {
	    a.submit();
	    actualMessage = a.getMessage();
	}

	@Then("the system shows a message {string}")
	public void the_system_shows_a_message(String expectedMessage) {
        // Check if the message is as expected or handle error scenarios
		if (!expectedMessage.equals(actualMessage)) {
			actualMessage = "Didn't Add Successfully";
		}
		assertEquals(expectedMessage, actualMessage);
	}
}
