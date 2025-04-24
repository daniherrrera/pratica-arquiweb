package danielherrera.apidaniel123.dtos;

import java.time.LocalDate;

public class AreaDTO {
    private int idArea;
    private String nameArea;
    private LocalDate creationDateArea;
    private int quantityEmployeeArea;
    private double budgetArea;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNameArea() {
        return nameArea;
    }

    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }

    public LocalDate getCreationDateArea() {
        return creationDateArea;
    }

    public void setCreationDateArea(LocalDate creationDateArea) {
        this.creationDateArea = creationDateArea;
    }

    public int getQuantityEmployeeArea() {
        return quantityEmployeeArea;
    }

    public void setQuantityEmployeeArea(int quantityEmployeeArea) {
        this.quantityEmployeeArea = quantityEmployeeArea;
    }

    public double getBudgetArea() {
        return budgetArea;
    }

    public void setBudgetArea(double budgetArea) {
        this.budgetArea = budgetArea;
    }
}
