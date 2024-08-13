package com.software.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class ExplorationPurchase {
    private List<Recipe> recipeList;
    private List<Recipe> searchResults;
    private String purchaseConfirmation;

    @Given("I have a list of dessert recipes")
    public void iHaveAListOfDessertRecipes() {
        recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Chocolate Cake", "Gluten-Free"));
        recipeList.add(new Recipe("Vanilla Pudding", "Vegan"));
        recipeList.add(new Recipe("Lemon Tart", "Nut-Free"));
        // Add more recipes as needed
    }

    @When("I search for recipes containing {string}")
    public void iSearchForRecipesContaining(String searchTerm) {
        if (recipeList == null) {
            iHaveAListOfDessertRecipes();
        }
        searchResults = recipeList.stream()
                .filter(recipe -> recipe.getTitle().contains(searchTerm))
                .collect(Collectors.toList());
    }

    @Then("I should see recipes with {string} in the title")
    public void iShouldSeeRecipesWithInTheTitle(String searchTerm) {
        assertFalse(searchResults.isEmpty());
        assertTrue(searchResults.stream().allMatch(recipe -> recipe.getTitle().contains(searchTerm)));
    }

    @Given("I have a list of dessert recipes with dietary information")
    public void iHaveAListOfDessertRecipesWithDietaryInformation() {
        iHaveAListOfDessertRecipes();
    }

    @When("I filter recipes for {string}")
    public void iFilterRecipesFor(String dietaryNeed) {
        if (recipeList == null) {
            iHaveAListOfDessertRecipes();
        }
        searchResults = recipeList.stream()
                .filter(recipe -> recipe.getDietaryInfo().equalsIgnoreCase(dietaryNeed))
                .collect(Collectors.toList());
    }

    @Then("I should see only {string} recipes")
    public void iShouldSeeOnlyRecipes(String dietaryNeed) {
        assertFalse(searchResults.isEmpty());
        assertTrue(searchResults.stream().allMatch(recipe -> recipe.getDietaryInfo().equalsIgnoreCase(dietaryNeed)));
    }

    @Given("I am viewing a dessert {string}")
    public void iAmViewingADessert(String dessertName) {
        if (recipeList == null) {
            iHaveAListOfDessertRecipes();
        }
        searchResults = recipeList.stream()
                .filter(recipe -> recipe.getTitle().equalsIgnoreCase(dessertName))
                .collect(Collectors.toList());
        assertFalse(searchResults.isEmpty()); // Ensure the dessert is available
    }

    @When("I purchase the dessert from the store owner {string}")
    public void iPurchaseTheDessertFromTheStoreOwner(String storeOwner) {
        // Simulate purchase process
        purchaseConfirmation = "Purchase confirmed for " + searchResults.get(0).getTitle() + " from " + storeOwner;
    }

    @Then("I should receive a confirmation of the purchase")
    public void iShouldReceiveAConfirmationOfThePurchase() {
        assertNotNull(purchaseConfirmation);
        assertTrue(purchaseConfirmation.contains("Purchase confirmed"));
    }

    // Helper class to represent recipes
    class Recipe {
        private String title;
        private String dietaryInfo;

        public Recipe(String title, String dietaryInfo) {
            this.title = title;
            this.dietaryInfo = dietaryInfo;
        }

        public String getTitle() {
            return title;
        }

        public String getDietaryInfo() {
            return dietaryInfo;
        }
    }
}

