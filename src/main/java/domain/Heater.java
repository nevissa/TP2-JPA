package domain;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author nevissa
 *
 */
//Question 3 - mise en place du reste du model
@Entity
@DiscriminatorValue(value="chauffage")
public class Heater extends SmartDevices {
	
	private int volume;
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
}
