package fit5042.tutex;
import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.PropertyRepositoryFactory;
import fit5042.tutex.repository.entities.Property;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TODO Exercise 1.3 Step 3 Complete this class. Please refer to tutorial instructions.
 * This is the main driver class. This class contains the main method for Exercise 1A
 * 
 * This program can run without the completion of Exercise 1B.
 * 
 * @author Adhi Baskoro 29401887
 */
public class RealEstateAgency {
    private String name;
    private final PropertyRepository propertyRepository;
    
    public RealEstateAgency(String name) throws Exception {
        this.name = name;
        this.propertyRepository = PropertyRepositoryFactory.getInstance();
   
    }
    
    /**
     *
     */
    public void createProperties() {
        try {
            this.propertyRepository.addProperty(new Property(1, "Wellington Rd, Clayton VIC 3800, Australia", 2, 150, 42.00));
            this.propertyRepository.addProperty(new Property(2, "900 Dandenong Rd, Caulfield East VIC 3145, Australia", 3, 352, 36.00));
            this.propertyRepository.addProperty(new Property(3, "Moorooduc Hwy, Frankston VIC 3199", 5, 800, 65.00));
            this.propertyRepository.addProperty(new Property(4, "Level 3/222 Bourke St, Melbourne VIC 3000", 2, 170, 43.50));
            this.propertyRepository.addProperty(new Property(5, "246 Clayton Rd, Clayton VIC 3168", 1, 60, 82.00));
            System.out.println("5 properties have been added");
        } catch (Exception ex) {
            System.out.println("Error: Failed to create properties: " + ex.getMessage());
        }
    }
    
    public void searchPropertyById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the desired property: ");
        int id = scanner.nextInt();
        try {
            Property property = this.propertyRepository.searchPropertyById(id);
            if (property != null) {
                System.out.println(property.toString());
            } else {
                System.out.println("Property not found");
            }  
        } catch (Exception ex) {
            System.out.println("Failed to search property by ID: " + ex.getMessage());
        }
    }
    
    public void displayAllProperties() {
        try {
            for (Property property : this.propertyRepository.getAllProperties()) {
                System.out.println(property.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(RealEstateAgency.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run() {
        this.createProperties();
        System.out.println("----------------------------------------------------");
        this.displayAllProperties();
        System.out.println("----------------------------------------------------");
        this.searchPropertyById();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        try {
            new RealEstateAgency("Monash Real Estate Agency").run();
        } catch (Exception ex) {
            System.out.println("Failed to run application: " + ex.getMessage());
        }
    }
}
