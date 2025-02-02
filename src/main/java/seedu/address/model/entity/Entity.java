package seedu.address.model.entity;

import java.util.HashMap;

public abstract class Entity {
    protected final Id id; // Note: id is unique and should never be mutable.
    protected Name name;

    /**
     * Constructor.
     *
     * @param id
     * @param name
     */
    Entity(Id id, Name name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods

    /**
     * Gets the name.
     *
     * @return String
     */
    public Name getName() {
        return this.name;
    }

    /**
     * Gets the id.
     *
     * @return Id
     */
    public Id getId() {
        return this.id;
    }

    // Setter methods

    /**
     * Sets the name of the entity.
     *
     * @param name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * View the bare details of the entity There is the default implementation.
     *
     * @return HashMap<String, String>
     */
    public HashMap<String, String> viewMinimal() {
        HashMap<String, String> fields = new HashMap<>();
        fields.put("name", this.getName().toString());
        fields.put("id", this.getId().toString());
        return fields;
    };

    /**
     * View the full details of the entity.
     */
    abstract public HashMap<String, String> viewDetailed();
}
