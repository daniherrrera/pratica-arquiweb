package danielherrera.apidaniel123.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArea;

    @Column(name = "nameArea", nullable = false, length = 45)
    private String nameArea;

    @Column(name = "creationDateArea", nullable = false)
    private LocalDate creationDateArea;

    @Column(name = "quantityEmployeeArea", nullable = false)
    private int quantityEmployeeArea;

    @Column(name = "budgetArea", nullable = false)
    private double budgetArea;

    public Area() {
    }

    public Area(int idArea, String nameArea, LocalDate creationDateArea, int quantityEmployeeArea, double budgetArea) {
        this.idArea = idArea;
        this.nameArea = nameArea;
        this.creationDateArea = creationDateArea;
        this.quantityEmployeeArea = quantityEmployeeArea;
        this.budgetArea = budgetArea;
    }

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
