import com.jogamp.opengl.GL2;
import java.lang.Math;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import java.util.ArrayList;
import java.util.Random;

public class EventListener implements GLEventListener{
	
	//array of stars
	 Star[] stars = new Star[1000];
	 public static GL2 gl = null;
	 
	public void display(GLAutoDrawable drawable) {
		
		// TODO Auto-generated method stub
		Random rand = new Random();
		float R;
		float G;
		float B;
		
	    gl = drawable.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		//gl.glColor3f(1,1, 1);
		
		for(int i=0;i<stars.length;i++)
		{
			int sign;
			sign = rand.nextBoolean() ? 1 : -1;
			stars[i].x = stars[i].x * sign;
			sign = rand.nextBoolean() ? 1 : -1;
			stars[i].y = stars[i].y * sign;
		
		
			
			//R = rand.nextFloat();
		//	G = rand.nextFloat();
		//	B = rand.nextFloat();
			gl.glColor3f(stars[i].R,stars[i].G, stars[i].B);
			//save previous position
			int px = stars[i].x;
			int py = stars[i].y;
			stars[i].updatePosition();
			//stars[i].updatePos();
			stars[i].showSetup();
			float size = (Math.abs(stars[i].x) + Math.abs(stars[i].y)) / 50; 
			sign = rand.nextBoolean() ? 1 : -1;
		//	gl.Enable
			
			if(sign == 1)
			{
				Graphics.fillRect(stars[i].x, stars[i].y, size, size);
			}
			
			else if(sign == -1)
			{
				Graphics.fillCircle(stars[i].x, stars[i].y,size);
			}
			
			Graphics.drawTriangle(stars[i].x, stars[i].y, size);
			//Graphics.fillRect(stars[i].x, stars[i].y, 2.5f, 2.5f);
			//Graphics.fillCircle(stars[i].x, stars[i].y,size);
			//draw line
			//gl.glColor3f(stars[i].R,stars[i].G, stars[i].B);
			Graphics.drawLine(px, py, stars[i].x, stars[i].y);
			
		}
	
			
	}
	
	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

	public void init(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		//array of stars
		for(int i=0;i<stars.length;i++)
		{
		   stars[i] = new Star();
		    
	    }
		
		GL2 gl = drawable.getGL().getGL2();
		gl.glClearColor(0, 0, 0, 1);
		
	}


	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) 
	{
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		
		float unitsTall = StarField.getWindowHeight() / (StarField.getWindowWidth() / StarField.unitsWide);
		
		//gl.glOrtho(-StarField.unitsWide / 2 ,StarField.unitsWide / 2 ,-unitsTall /2,unitsTall/2,-1,1);
		//gl.glOrtho(0,StarField.getWindowWidth(),0,StarField.getWindowHeight(),-1,1);
		gl.glOrtho(-StarField.getWindowWidth(),StarField.getWindowWidth(),-StarField.getWindowHeight(),StarField.getWindowHeight(),-1,1);
		
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		
		
	}

}
