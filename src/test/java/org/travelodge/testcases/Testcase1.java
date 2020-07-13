package  org.travelodge.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.travelodge.Basedriver.Basedriverclass;
import org.travelodge.flows.Flow_login;

public class Testcase1 extends Basedriverclass {

	@Test
	public void tc1() throws IOException, InterruptedException {
		Flow_login fl = new Flow_login();
		fl.login();
	}

}
