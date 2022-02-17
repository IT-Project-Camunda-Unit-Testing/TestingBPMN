


import generated.process_0a1uc4m.TC_Yes;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Executor;


public class TotalTesting {

//------------------TASKS----------------------------

    @Rule
    public TC_Yes tc01 = new TC_Yes();
    @Test
    public void tc01AufgabeBenutzer() {
        tc01.handleActivity_0gad5d4().withVariable("check", true);
        tc01.createExecutor().execute();
    }




}


