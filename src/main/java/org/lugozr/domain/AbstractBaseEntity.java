package org.lugozr.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 *
 * @author Nikola Mirosavljev
 */
@MappedSuperclass
class AbstractBaseEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6991376206642826515L;

    /**
     * Primary Key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * @return id - Id of the Entity
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id - Id of the Entity
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractBaseEntity other = (AbstractBaseEntity) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
