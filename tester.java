package Lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {

	@Test
	void test() {
//		fail("Not yet implemented");
		
		// Test case 1: Normal speeding violation with with actual speed less than max speed
        assertEquals(-1, TestingExample.LicencePoints(65, 70, false));

        // Test case 2: Speeding violation within 16-29 km/h over the limit
        assertEquals(3, TestingExample.LicencePoints(85, 60, false));

        // Test case 3: Speeding violation within 30-49 km/h over the limit
        assertEquals(4, TestingExample.LicencePoints(100, 51, false));

        // Test case 4: Severe speeding violation (50 km/h or more over the limit)
        assertEquals(6, TestingExample.LicencePoints(120, 70, false));

        // Test case 5: Stunt driving violation
        assertEquals(6, TestingExample.LicencePoints(120, 70, true));

        // Test case 6: Speeding violation with negative actual speed
        assertEquals(-1, TestingExample.LicencePoints(-10, 60, false));

        // Test case 7: Speeding violation with negative max speed
        assertEquals(-1, TestingExample.LicencePoints(80, -60, false));

        // Test case 8: Speeding violation (within 0-15 km/h over the limit)
        assertEquals(0, TestingExample.LicencePoints(50, 40, false));

        // Test case 9: Speeding violation with zero actual speed
        assertEquals(-1, TestingExample.LicencePoints(0, 60, false));

        // Test case 10: Speeding violation with actual speed less than max speed
        assertEquals(-1, TestingExample.LicencePoints(60, 80, false));

	}

}
