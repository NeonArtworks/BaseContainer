package at.neonartworks.basecontainer;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>BaseContainer</h1> <br>
 * <p>
 * The BaseContainer can store <b> any </b> value to a corresponding id. This
 * makes it a lot easier to store variables inside a program, because instead of
 * a lot variables you have one container. This makes it very easy to clean your
 * code.
 * </p>
 * 
 * 
 * @author Florian Wagner
 * @version 0.3.2
 */
public class BaseContainer {

	private Map<String, Object> container; // main container

	/**
	 * <h1>public BaseContainer({@link Integer} entries)</h1> <br>
	 * <p>
	 * Creates a new instance of the BaseContainer. The value entries is used to
	 * set the maximum amount of entries.<br>
	 * If entries equals zero, no maximum will be set!
	 * </p>
	 * 
	 * @param entries
	 *            The maximum amount of entries in this container.
	 */
	public BaseContainer(int entries) {
		if (entries >= 0) {
			if (entries == 0)
				container = new HashMap<String, Object>();
		} else
			container = new HashMap<String, Object>(entries);

	}

	/**
	 * <h1>public void addEntrie({@link String} id, {@link Object} num)</h1>
	 * <p>
	 * Adds a new entry to the BaseContainer. <br>
	 * The entry value 'num' will be stored with the corresponding id set with
	 * the first parameter 'id'
	 * </p>
	 * 
	 * @param id
	 *            The id you want to store a value to.
	 * @param num
	 *            The Object/Value you want to store to the id.
	 */
	public void addEntry(String id, Object num) {
		container.put(id, num);
	}

	/**
	 * <h1>public {@link Object} getEntryById({@link String} id)</h1>
	 * <p>
	 * Returns the corresponding value or Object of the id. <br>
	 * If the the id was not found a default value of -1 will be returned!
	 * </p>
	 * 
	 * @param id
	 *            The id you want to get.
	 * @return The value, or if not found, -1.
	 */
	public Object getEntryById(String id) {
		return container.getOrDefault(id, -1);
	}

	/**
	 * <h1>public {@link Map} getBaseContainer()</h1>
	 * <p>
	 * Returns the whole BaseContainer as a {@link Map}. <br>
	 * 
	 * </p>
	 * 
	 * @return the whole container map
	 */
	public Map<String, Object> getBaseContainer() {
		return this.container;
	}

	/**
	 * <h1>public {@link Void} setBaseContainer({@link Map})</h1>
	 * <p>
	 * Sets the internal BaseContainer to the values inside of the variable
	 * given by con. <br>
	 * 
	 * </p>
	 * 
	 * @param con
	 *            the map containing the values for the container.
	 */
	public void setBaseContainer(Map<String, Object> con) {
		this.container = con;
	}

	/**
	 * <h1>public {@link Integer} getContainerLength()</h1>
	 * <p>
	 * Returns the number of entries in the container.
	 * </p>
	 * 
	 * @return entries
	 */
	public int getContainerLength() {
		return container.size();
	}

	/**
	 * <h1>public {@link Void} PrintEntries()</h1>
	 * <p>
	 * Prints every entry of the BaseContainer to the console.
	 * </p>
	 */
	public void PrintEntries() {
		System.out.println("----Container Entries----");
		for (Object o : container.entrySet()) {
			System.out.println(o);
		}
		System.out.println("----End of Container Entries----");
	}
}