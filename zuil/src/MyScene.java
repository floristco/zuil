
public class MyScene extends Scene {

	  public void setup() {
	    size(200,200);
	    // Initialize all "stripes"
	  }

	  public void draw() {
		    stroke(255);
		    if (mousePressed) {
		      line(mouseX,mouseY,pmouseX,pmouseY);
		    }
	    }	
	

}
