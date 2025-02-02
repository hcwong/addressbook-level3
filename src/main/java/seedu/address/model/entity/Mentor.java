package seedu.address.model.entity;

import java.util.HashMap;

public class Mentor extends Entity {
    private Phone phone;
    private Email email;
    private Name organization;
    private SubjectName subject;

    /**
     * Constructor.
     *
     * @param name
     * @param id
     * @param phone
     * @param email
     * @param organization
     * @param subject
     */
    public Mentor(
            Name name,
            Id id,
            Phone phone,
            Email email,
            Name organization,
            SubjectName subject
    ) {
        super(id, name);
        this.phone = phone;
        this.email = email;
        this.organization = organization;
        this.subject = subject;
    }

    // Getters

    public Phone getPhone() {
        return phone;
    }

    public Email getEmail() {
        return email;
    }

    public Name getOrganization() {
        return organization;
    }

    public SubjectName getSubject() {
        return subject;
    }

    // Setters

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setOrganization(Name organization) {
        this.organization = organization;
    }

    public void setSubject(SubjectName subject) {
        this.subject = subject;
    }

    @Override
    public HashMap<String, String> viewMinimal() {
        HashMap<String, String> result = new HashMap<>();
        result.put("name", getName().toString());
        result.put("id", getId().toString());
        result.put("phone", getPhone().toString());
        result.put("email", getEmail().toString());
        return result;
    }

    @Override
    public HashMap<String, String> viewDetailed() {
        HashMap<String, String> result = new HashMap<>();

        result.put("name", getName().toString());
        result.put("id", getId().toString());
        result.put("phone", getPhone().toString());
        result.put("email", getEmail().toString());
        result.put("organization", getOrganization().toString());
        result.put("subject", getSubject().toString());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(" Name: ")
                .append(getName())
                .append(" ID: ")
                .append(getId())
                .append(" Phone: ")
                .append(getPhone())
                .append(" Email: ")
                .append(getEmail())
                .append(" Organization: ")
                .append(getOrganization())
                .append(" Subject: ")
                .append(getSubject());

        return builder.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Mentor)) {
            return false;
        }

        Mentor otherMentor = ((Mentor) other);
        return otherMentor.getName() == this.getName()
                && otherMentor.getId() == this.getId()
                && otherMentor.getPhone() == this.getPhone()
                && otherMentor.getEmail() == this.getEmail()
                && otherMentor.getOrganization() == this.getOrganization()
                && otherMentor.getSubject() == this.getSubject();
    }

}
