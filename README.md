# BaseContainer

OpenSource java - container calss.
The BaseContainer can store any value to a corresponding id. This
makes it a lot easier to store variables inside a program, because instead of
a lot variables you have one container. This makes it very easy to clean your
code.

## Features
Store any variable with an id in the container. The variables can then be retrieved with the id. The ID is a string. 

##Usage
```java
package at.neonartworks.basecontainer.test;

import at.neonartworks.basecontainer.BaseContainer;

public class TestBaseContainer {

	public static void main(String[] args) {
		/**
		 * Create a new BaseContainer. The input parameter is the number of entries that can be stored.
		 * If 0 is passed, the default value of 16 entries is used.
		 */
		BaseContainer bc = new BaseContainer(0); 

		bc.addEntry("ID_INT1", 10); //adding an int to the container
		bc.addEntry("ID_STRING1", "Hello World"); //adding an string to the container
		bc.addEntry("ID_BC1", bc); //adding itself

		bc.PrintEntries(); //prints all entries to the console
		
		System.out.println("Length of container: " + bc.getContainerLength()); //prints the total lengh of the contaienr
		
		bc.getBaseContainer(); //this method would retrieve a Map<String, Object>.
		
	}

}

```
