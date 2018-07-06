package componentScan;

import componentScan.configuration.Context;
import componentScan.controller.Controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Context.class})
public class ControllerTest {

    @Autowired
    private Controller controller;

    @Test
    public void testMethodToTest() {
        Integer actualResult = controller.methodToTest();

        assertTrue(actualResult == 3);
    }

}
