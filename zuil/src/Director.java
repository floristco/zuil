
import processing.core.*;

public class Director {
	String _scenes[];
	Scene currentScene;
	
	
	Director() {
		System.out.println("con");
		this._scenes = new String[10];
	}
	
	public void addScene(String newScene) {
		this._scenes[0] = newScene;
		
	}
	
	public void sceneCallback() {
		// set finished to true to stop applet
		System.out.println("cb");
	}
	
	void startVoorstelling() {
//		PApplet.main(new String[] { "--present", this._scenes[0] });
		
		String name = this._scenes[0];
	    
		// final Scene applet;
		try {
			Class<?> c = Thread.currentThread().getContextClassLoader().loadClass(name);
			this.currentScene = (Scene) c.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
	    }
		
		this.currentScene._director = this;
		
		
	      
//		PApplet.main(new String[] { "--present",applet);
		PApplet.runSketch(new String [] {""}, this.currentScene);
		
		
		// hier wachten tot skectch klaar is?
		
	}
	
	
	
}
