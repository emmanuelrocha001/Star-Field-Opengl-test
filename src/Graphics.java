import com.jogamp.opengl.GL2;

public class Graphics 
{
	public static void fillRect(float x, float y, float width, float height)
	{
		GL2 gl = EventListener.gl;
		gl.glBegin(GL2.GL_QUADS);
		//gl.glColor3f(1,1, 1);
		gl.glVertex2f(-1-width+x, -1-height+y);
		gl.glVertex2f(1+width+x, -1-height+y);
		gl.glVertex2f(1+width+x, 1+height+y);
		gl.glVertex2f(-1-width+x, 1+height+y);
		gl.glEnd();
		
	}
	
	public static void drawTriangle(float x, float y, float d)
	{
		 GL2 gl = EventListener.gl;
		 gl.glBegin (GL2.GL_POLYGON);
	      //drawing the base
	      gl.glBegin (GL2.GL_LINES);
	      gl.glVertex3f(-1f*d+x+100, -1f*d+y+100, 0);
	      gl.glVertex3f(1f*d+x+100, -1f*d+y+100, 0);
	      gl.glEnd();
	      //drawing the right edge
	      gl.glBegin (GL2.GL_LINES);
	      gl.glVertex3f(0f*d+x+100, 1f*d+y+100, 0);
	      gl.glVertex3f(-1*d+x+100, -1f*d+y+100, 0);
	      gl.glEnd();
	      //drawing the lft edge
	      gl.glBegin (GL2.GL_LINES);
	      gl.glVertex3f(0f*d+x+100, 1f*d+y+100, 0);
	      gl.glVertex3f(1f*d+x+100, -1f*d+y+100, 0);
	      gl.glEnd();
	}
	
	public static void fillCircle(float dx, float dy, float r)
	{
		GL2 gl = EventListener.gl;
		gl.glBegin(GL2.GL_POLYGON);
		for(int i =0; i <= 300; i++){
		double angle = 2 * Math.PI * i / 300;
		double x = Math.cos(angle)*r;
		double y = Math.sin(angle)*r;
		gl.glVertex2d(x+dx,y+dy);
		}
		gl.glEnd();
		
	}
	
	public static void drawLine(float px, float py, float x, float y)
	{
		
		GL2 gl = EventListener.gl;
     //	gl.glColor3f(1,1, 1);
		gl.glBegin( GL2.GL_LINES );
	    gl.glVertex3f(px,py,0 );
	    gl.glVertex3f(x,y,0 );
	    gl.glEnd();
		
		
	}
}
