/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository;
import fit5042.tutex.repository.entities.Property;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO Exercise 1.3 Step 2 Complete this class.
 * 
 * This class implements the PropertyRepository class. You will need to add the keyword
 * "implements" PropertyRepository. 
 * 
 * @author Adhi Baskoro 29401887 
 */
public class SimplePropertyRepositoryImpl implements PropertyRepository{
    
    private final ArrayList<Property> properties;

    protected SimplePropertyRepositoryImpl() {
        properties = new ArrayList<>();
    }
    
    @Override
    public void addProperty(Property property) throws Exception {
        if ((!properties.contains(property)) && (searchPropertyById(property.getId()) == null)) {
            properties.add(property);
        }
    }

    @Override
    public Property searchPropertyById(int id) throws Exception {
        for (Property property : this.properties) {
            if (property.getId() == id) {
                return property;
            }
        }
        return null;
    }

    @Override
    public List<Property> getAllProperties() throws Exception {
    
        return this.properties;
    }
}
