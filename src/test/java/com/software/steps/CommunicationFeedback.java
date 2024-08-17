package com.software.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class CommunicationFeedback {
    private String userMessage;
    private Map<String, List<String>> communicationLog = new HashMap<>();
    private Map<String, List<String>> feedbackLog = new HashMap<>();

    @Given("I am a user")
    public void iAmAUser() {
        // Ensure maps are initialized
        communicationLog = new HashMap<>();
        feedbackLog = new HashMap<>();
    }

    @When("I send a message {string} to the store owner {string}")
    public void iSendAMessageToTheStoreOwner(String message, String storeOwner) {
        communicationLog.putIfAbsent(storeOwner, new ArrayList<>());
        communicationLog.get(storeOwner).add(message);
        userMessage = message;
    }

    @When("I send a message {string} to the supplier {string}")
    public void iSendAMessageToTheSupplier(String message, String supplier) {
        communicationLog.putIfAbsent(supplier, new ArrayList<>());
        communicationLog.get(supplier).add(message);
        userMessage = message;
    }

    @Then("the store owner should receive the message")
    public void theStoreOwnerShouldReceiveTheMessage() {
        assertTrue(communicationLog.values().stream().flatMap(List::stream).anyMatch(msg -> msg.equals(userMessage)));
    }

    @Then("the supplier should receive the message")
    public void theSupplierShouldReceiveTheMessage() {
        assertTrue(communicationLog.values().stream().flatMap(List::stream).anyMatch(msg -> msg.equals(userMessage)));
    }

    @Given("I have purchased the product {string}")
    public void iHavePurchasedTheProduct(String product) {
        feedbackLog.putIfAbsent(product, new ArrayList<>());
    }

    @When("I provide feedback {string}")
    public void iProvideFeedback(String feedback) {
        userMessage = feedback;
        feedbackLog.forEach((key, value) -> value.add(feedback)); // Add the feedback to the appropriate list
    }

    @Then("the feedback list for {string} should contain my feedback")
    public void theFeedbackListForShouldContainMyFeedback(String product) {
        assertTrue(feedbackLog.get(product).contains(userMessage));
    }

    @Given("I have tried the recipe {string}")
    public void iHaveTriedTheRecipe(String recipe) {
        feedbackLog.putIfAbsent(recipe, new ArrayList<>());
    }
}



