
import processing.core.*;

 abstract public class Scene extends PApplet {
	protected Director _director;

	public void handleDraw() {
		this._director.sceneCallback();
		super.handleDraw();
	}

}
