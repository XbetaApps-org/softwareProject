package com.software.steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class SalesAndProfitTest {

    private Map<String, SaleRecord> salesRecords = new HashMap<>();
    private double totalSales;
    private double totalProfit;

    @Given("the following sales records exist:")
    public void the_following_sales_records_exist(io.cucumber.datatable.DataTable dataTable) {
        dataTable.asMaps().forEach(row -> {
            String productId = row.get("ProductId");
            int quantity = Integer.parseInt(row.get("Quantity"));
            double pricePerUnit = Double.parseDouble(row.get("Price per unit"));
            double costPerUnit = row.containsKey("Cost per unit") ? Double.parseDouble(row.get("Cost per unit")) : 0;

            salesRecords.put(productId, new SaleRecord(quantity, pricePerUnit, costPerUnit));
        });
    }

    @When("I request to view the total sales and profits")
    public void i_request_to_view_the_total_sales_and_profits() {
        totalSales = salesRecords.values().stream()
                .mapToDouble(record -> record.quantity * record.pricePerUnit)
                .sum();

        totalProfit = salesRecords.values().stream()
                .mapToDouble(record -> record.quantity * (record.pricePerUnit - record.costPerUnit))
                .sum();
    }

    @Then("the total sales should be \\${double}")
    public void the_total_sales_should_be(Double expectedSales) {
        assertEquals(expectedSales, totalSales, 0.01);
    }

    @Then("the total profit should be \\${double} \\(assuming a profit margin\\)")
    public void the_total_profit_should_be_assuming_a_profit_margin(Double expectedProfit) {
        assertEquals(expectedProfit, totalProfit, 0.01);
    }

    @Then("the profit for ProductId {string} should be \\${double}")
    public void the_profit_for_productid_should_be(String productId, Double expectedProfit) {
        SaleRecord record = salesRecords.get(productId);
        double profit = record.quantity * (record.pricePerUnit - record.costPerUnit);
        assertEquals(expectedProfit, profit, 0.01);
    }

    private static class SaleRecord {
        int quantity;
        double pricePerUnit;
        double costPerUnit;

        SaleRecord(int quantity, double pricePerUnit, double costPerUnit) {
            this.quantity = quantity;
            this.pricePerUnit = pricePerUnit;
            this.costPerUnit = costPerUnit;
        }
    }
}
