package malik.punit.sfgpetclinic.services;

import malik.punit.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{


    Owner findByLastName(String lastName);
}
