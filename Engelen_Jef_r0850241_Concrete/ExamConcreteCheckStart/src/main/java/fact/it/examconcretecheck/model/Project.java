package fact.it.examconcretecheck.model;

import java.time.LocalDate;

public class Project {
    private String name;
    private int height;
    private int width;
    private int length;
    private LocalDate startDate;
    private boolean renovation;

    public Project() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setRenovation(boolean renovation) {
        this.renovation = renovation;
    }

    public boolean isRenovation(){
        return renovation;
    }

    public int calculateVolume(){
        return (height * width * length);
    }

    public boolean isOverdue(){
        if (startDate.isBefore(LocalDate.now().plusYears(1))){
            return isOverdue();
        }
    }



    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", startDate=" + startDate +
                ", renovation=" + renovation +
                '}';
    }
}
