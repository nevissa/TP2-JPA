/**
 * 
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Diakite
 *
 */
@Entity
public class ElectroDevice {
	
	private int id;
	private String type;
	private String name;
	private int puissance;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the puissance
	 */
	public int getPuissance() {
		return puissance;
	}

	/**
	 * @param puissance
	 *            the puissance to set
	 */
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
