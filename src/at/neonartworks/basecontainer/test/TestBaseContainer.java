package at.neonartworks.basecontainer.test;

import at.neonartworks.basecontainer.BaseContainer;

public class TestBaseContainer {

	public static void main(String[] args) {

		BaseContainer bc = new BaseContainer(0);

		bc.addEntry("ID_INT1", 10);
		bc.addEntry("ID_STRING1", "Hello World");
		bc.addEntry("ID_BC1", bc);

		bc.PrintEntries();
		
		System.out.println("Length of container: " + bc.getContainerLength());
		
		bc.getBaseContainer();
		
	}

}
