package cl.cencosud.sikulidemo;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.Key;

public class SikuliDemo {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		try {
			 Screen screen = new Screen();
			 screen.click(PuttyObjects.ICONO);
			 Thread.sleep(1000);
			 screen.type("boldo" + Key.TAB + "23");
			 screen.click(PuttyObjects.OPT_TELNET);
			 screen.click(PuttyObjects.BTN_OPEN);
			 Thread.sleep(1000);
			 screen.type("EB5235" + Key.TAB + "EB5235" + Key.ENTER);
			 Thread.sleep(1000);
			 screen.click(PuttyObjects.BTN_CERRAR);
			 Thread.sleep(1000);
			 screen.click(PuttyObjects.BTN_ACEPTAR);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
