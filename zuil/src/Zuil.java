

public class Zuil {

	Director director;
	
	Zuil() {
		director = new Director();
		
		director.addScene("MyScene");
		director.startVoorstelling();
		System.out.println("ready?"); 
	}
	
	
	public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        
        Zuil z = new Zuil();
        
        
    }
	
}
