package TwoclsOneTbl;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails {
    private boolean isPublic;
    private String city;
    private int capacity;

    public SchoolDetails() {
    }

    public SchoolDetails(boolean isPublic, String city, int capacity) {
        this.isPublic = isPublic;
        this.city = city;
        this.capacity = capacity;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public String getCity() {
        return city;
    }

    public int getCapacity() {
        return capacity;
    }
}
