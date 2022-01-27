package Final;
import Final.FileOperations;
import Final.HandleOptions;
import Final.MenuOptions;
public class sunanth {
	public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("sunanth", "Sunanth_MS");
		
		HandleOptions.handleWelcomeScreenInput();
	}	
}
