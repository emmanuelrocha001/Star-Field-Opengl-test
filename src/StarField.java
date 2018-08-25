

import com.jogamp.newt.event.WindowAdapter;
import com.jogamp.newt.event.WindowEvent;
import com.jogamp.newt.event.WindowListener;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;
import java.util.ArrayList; 

public class StarField
{
  
	private static GLWindow window = null;
	
	public static int screenWidth = 2736;
	public static int screenHeight = 1824;
	
	public static float unitsWide = 100;
	
	//star speed
	public static int speed;
	//array of stars
	public static Star[] stars = new Star[1000];
	public static FPSAnimator animator;
	public static void init()
	{
		GLProfile.initSingleton();
		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities caps = new GLCapabilities(profile);
		
		window = GLWindow.create(caps);
		//window.setSize(1980,1080);
		window.setResizable(false);
		window.addGLEventListener(new EventListener());
		//set mouse input
		window.addMouseListener(new MouseInput());
		//add window closing 
		//window.addWindowListener(new WindowListener());
		
		window.setFullscreen(true);
		window.setVisible(true);
		window.requestFocus();
		
		
	    animator = new FPSAnimator(window,60);
		animator.start();
		
		
	}
	public static int getWindowWidth()
	{
		return window.getWidth();
	}
	
	public static int getWindowHeight()
	{
		return window.getHeight();
	}
	
	public static void Exit()
	{
		animator.stop();
		System.exit(0);
	}
	


public static void main(String[] args)
{
	//setup stars
	for(int i=0;i<stars.length;i++)
	  {
		   stars[i] = new Star();
			    
	  }
	
	init();
}}


