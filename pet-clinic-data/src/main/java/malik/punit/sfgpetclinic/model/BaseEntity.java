package malik.punit.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id; //recommendation of hibernate

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
