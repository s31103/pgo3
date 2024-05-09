class Artefact extends Exhibit {
    private String material;
    private String timePeriod;

    public Artefact(String material, String timePeriod, int exhibitCount, String name, String idNumber, String description) {
        super(exhibitCount, name, idNumber, description);
        this.material = material;
        this.timePeriod = timePeriod;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Material: " + material);
        System.out.println("Time Period: " + timePeriod);
    }
}
00000000
import java.util.Date;

public class Exhibit {
    protected int exhibitCount;
    protected Date lastMaintenanceDate;
    protected String name;
    protected String idNumber;
    protected String description;

    public Exhibit(int exhibitCount, String name, String idNumber, String description) {
        this.exhibitCount = exhibitCount;
        this.name = name;
        this.idNumber = idNumber;
        this.description = description;
        this.lastMaintenanceDate = new Date();
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Description: " + description);
    }
}
0000000
public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum("Warszawa", "Museum");

        Painting painting = new Painting("Impressionist", "Uladzislau", 2023, 1, "Apple tree", "painting", "Beautiful painting.");
        Sculpture sculpture = new Sculpture("Silver", "Uladzislau", 2024, 2, "Gerakl", "sculpture", "Great sculpture.");
        Artenew Artefact("Gold", "Ancient", 3, "Egypt", "artefact", "Ancient Egypt item.");
        museum.addExhibit(painting);
        museum.addExhibit(sculpture);
        museum.addExhibit(artefact);

        museum.showMaintenanceDate();
    }
}
0000000
import java.util.ArrayList;

class Museum {
    private String address;
    private String name;
    private ArrayList<Exhibit> exhibits;

    public Museum(String address, String name) {
        this.address = address;
        this.name = name;
        this.exhibits = new ArrayList<>();
    }

    public void addExhibit(Exhibit exhibit) {
        if (!exhibits.contains(exhibit)) {
            exhibits.add(exhibit);
        } else {
            System.out.println("Exhibit already exists in the museum.");
        }
    }

    public void removeExhibit(Exhibit exhibit) throws Exception {
        if (exhibits.contains(exhibit)) {
            exhibits.remove(exhibit);
        } else {
            throw new Exception("Exhibit not found in the museum.");
        }
    }

    public void showMaintenanceDate() {
    }
}
0000000
class Painting extends Exhibit {
    private String style;
    private String author;
    private int year;

    public Painting(String style, String author, int year, int exhibitCount, String name, String idNumber, String description) {
        super(exhibitCount, name, idNumber, description);
        this.style = style;
        this.author = author;
        this.year = year;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Style: " + style);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}
0000000
class Sculpture extends Exhibit {
    private String material;
    private String author;
    private int year;

    public Sculpture(String material, String author, int year, int exhibitCount, String name, String idNumber, String description) {
        super(exhibitCount, name, idNumber, description);
        this.material = material;
        this.author = author;
        this.year = year;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Material: " + material);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}
