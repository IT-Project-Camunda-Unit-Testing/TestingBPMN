



import generated.process_0a1uc4m.TC_Big_Process_1;
import generated.process_0a1uc4m.TC_Big_Process_2;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Executor;


public class TotalTesting {

//------------------TASKS----------------------------

    @Rule
    public TC_Big_Process_1 tc01 = new TC_Big_Process_1();
    @Test
    public void tc01AufgabeBenutzer() {
        tc01.handleActivity_0gad5d4().withVariable("check", true);
        tc01.createExecutor().execute();
    }

    @Rule
    public TC_Big_Process_2 tc02 = new TC_Big_Process_2();
    @Test
    public void tc02AufgabeBenutzer() {
        tc02.handleActivity_0gad5d4().withVariable("check", false);
        tc02.createExecutor().execute();
    }






}


