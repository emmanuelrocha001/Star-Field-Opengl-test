import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

public class MouseInput implements MouseListener
{

	public static int mouseX;
	public static int mouseY;
	public static int pmouseX;
	public static int pmouseY;
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX() + " / " + e.getY());
		StarField.Exit();
		
	}

	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseMoved(MouseEvent e) {
		StarField.speed = e.getX();
		
		
		
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseWheelMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		pmouseX = mouseX;
		pmouseY = mouseY;
		GL2 gl2 = EventListener.gl;
		gl2.glPushMatrix();     
		gl2.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );
		/** Try removing the following glLoadIdentity call below.
		  * That call was blowing out the MODELVIEW matrix - it's removing your 
		  * gluLookAt call and returning to the identity.
		  * As a result, the cube will always be right there in front of you.
		  */
		// gl2.glLoadIdentity();
		gl2.glTranslatef(mouseX, mouseY, 5);
		gl2.glBegin( GL2.GL_QUADS );
		gl2.glColor3f( 1, 0, 0 ); //24 glVertex3f calls & some colour changes go here.
		gl2.glVertex3f(mouseX, mouseY, 10);
		gl2.glEnd();
		gl2.glPopMatrix(); 
		
	}

}
