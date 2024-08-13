package com.software.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

import com.software.models.Recipe;

import static org.junit.Assert.*;

public class ContentManagement {
    private List<Recipe> recipes;

    @Given("I have an empty list of recipes")
    public void iHaveAnEmptyListOfRecipes() {
        recipes = new ArrayList<>();
    }

    @Given("I have a list with a recipe titled {string}")
    public void i_have_a_list_with_a_recipe_titled(String title) {
        recipes = new ArrayList<>();
        recipes.add(new Recipe(title, "Flour, Sugar, Cocoa", "Mix and bake"));
    }

    @When("I add a recipe with title {string}, ingredients {string}, and instructions {string}")
    public void iAddARecipeWithTitleIngredientsAndInstructions(String title, String ingredients, String instructions) {
        recipes.add(new Recipe(title, ingredients, instructions));
    }

    @When("I update the recipe title to {string}")
    public void iUpdateTheRecipeTitleTo(String newTitle) {
        if (!recipes.isEmpty()) {
            Recipe recipe = recipes.get(0);
            recipe.setTitle(newTitle);
        }
    }

    @When("I delete the recipe with title {string}")
    public void i_delete_the_recipe_with_title(String title) {
        recipes.removeIf(recipe -> recipe.getTitle().equals(title));
    }

    @Then("the recipe list should contain {int} recipe")
    public void theRecipeListShouldContainRecipe(int count) {
        assertEquals(count, recipes.size());
    }

    @Then("the recipe list should contain a recipe titled {string}")
    public void theRecipeListShouldContainARecipeTitled(String title) {
        assertTrue(recipes.stream().anyMatch(recipe -> recipe.getTitle().equals(title)));
    }

    @Then("the recipe list should be empty")
    public void the_recipe_list_should_be_empty() {
        assertTrue(recipes.isEmpty());
    }
}
