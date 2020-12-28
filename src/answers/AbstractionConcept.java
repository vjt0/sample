package answers;

import org.testng.annotations.Test;

public  class AbstractionConcept {
	@Test
	public void newMeth() {
	int i=50;int j=0;
	int data =0;
	try {
		data=i/j;
	}
	catch(Exception e) {
		System.out.println(i/j+2);
	}
	
	}

}
