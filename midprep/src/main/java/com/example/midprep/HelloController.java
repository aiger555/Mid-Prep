package com.example.midprep;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label totalKWhLabel;

    @FXML
    private TextField totalKWhField;

    @FXML
    private RadioButton populationRadioButton;

    @FXML
    private RadioButton highlandsRadioButton;

    @FXML
    private RadioButton commercialRadioButton;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    public void initialize(){
        ToggleGroup planTypeGroup = new ToggleGroup();
        populationRadioButton.setToggleGroup(planTypeGroup);
        highlandsRadioButton.setToggleGroup(planTypeGroup);
        commercialRadioButton.setToggleGroup(planTypeGroup);
    }

    @FXML
    private void calculateCost(){
        int totalKWh = Integer.parseInt(totalKWhField.getText());
        ElectricityPlan plan = null;

        if (populationRadioButton.isSelected()){
            plan = new PopulationPlan(totalKWh);
        } else if (highlandsRadioButton.isSelected()){
            plan = new HighlandsPlan(totalKWh);
        } else if (commercialRadioButton.isSelected()) {
            plan = new CommercialPlan(totalKWh);
        }

        if (plan != null) {
            double cost = plan.calculateCost();
            resultLabel.setText("Monthly Electric Cost: " + cost + " som");
        }
    }

}