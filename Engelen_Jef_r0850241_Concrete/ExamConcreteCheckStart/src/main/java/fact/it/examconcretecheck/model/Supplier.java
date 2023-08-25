package fact.it.examconcretecheck.model;

public class Supplier {
    private String name;
    private double price;
    private Project project;

    public Supplier(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public double calculateTotalPrice() {
        if (project.isRenovation()) {
            return 1.06 * (price * project.calculateVolume());
        }
        else {
            return 1.21 * (price * project.calculateVolume());
        }
    }

    @Override
    public String toString() {
        if (!project.isOverdue() && project.isRenovation()) {
            return "Supplier" + name + "has a Project: '" + project.getName() + "- renovation - " + project.calculateVolume() + "m3'. This project has a total price of: " + calculateTotalPrice() + " euros.";
        }
        else if (!project.isOverdue() && !project.isRenovation()){
            return "Supplier" + name + "has a Project: '" + project.getName() + project.calculateVolume() + "m3'. This project has a total price of: " + calculateTotalPrice() + " euros.";
        }
        else if (project.isOverdue()) {
            return "Supplier" + name + "has a Project: '" + project.getName() + project.calculateVolume() + "m3'. This project is overdue.";
        }
    }
}
