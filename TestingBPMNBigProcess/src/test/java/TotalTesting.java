

import generated.process_0a1uc4m.TC_Big_Process_1;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Executor;


public class TotalTesting {

//------------------TASKS----------------------------

    @Rule
    public TC_Big_Process_1 tc01 = new TC_Big_Process_1();
    @Test
    public void tc01AufgabeBenutzer() { tc01.createExecutor().execute(); }




}


