package n3exercici1;

public class App {
    public static void main(String[] args) {

    	MenuManager app = new MenuManager();
    	
    	app.readFileCSV();
    	
    	app.sortNameAscending();
    	
    	System.out.println();
    	
    	app.sortNameDescending();
    }
}