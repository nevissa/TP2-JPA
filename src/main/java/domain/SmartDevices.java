package domain;

import javax.persistence.*;
/**
 * @author diakite, nevissa
 *
 */

/*  cas heritage avec table par classe
 * @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
 * @DiscriminatorValue(value="smart")
   @Inheritance(strategy=InheritanceType.JOINED)
 * */
 //Heritage par single table avec des colonnes discriminatoires
@DiscriminatorColumn(name="TYPE_DEVICE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value="smart")
@Entity
public class SmartDevices {
	private int id;
	private String name;
	private int puissance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	@Id
	@GeneratedValue()
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
