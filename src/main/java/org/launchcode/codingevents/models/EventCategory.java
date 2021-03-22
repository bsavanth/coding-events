package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntiity{

    EventCategory(@Size(min = 3, message = "Name must be at least 3 characters long") String name)
    {
        super(name);
    }

    public EventCategory()
    {
        super();
    }


}
