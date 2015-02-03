package Homework1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ antTest.class, batTest.class, flyTest.class, thingTest.class,
		tigerTest.class })
public class AllTests {

}
