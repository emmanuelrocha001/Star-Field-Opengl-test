import java.util.Random;
import com.jogamp.opengl.GL2;
public class Star 
{
	int x;
    int y;
	int z;
	int px;
	int py;
	float R;
	float G;
	float B;
	int sx;
	int pz;
	//StarField starfield = new Starfield();
	Random rand = new Random();

	Star()
    {
	    //random position Q1
		x = rand.nextInt(StarField.screenWidth + 1);
		y = rand.nextInt(StarField.screenHeight + 1);
		//
		R = rand.nextFloat();
		G = rand.nextFloat();
		B = rand.nextFloat();
		
	    
	    pz = z;
	    //y = random(-height, height);
	    //z = random(width);
	    //pz = z;
	    
	   
	}

	  
	 public void updatePosition()
	 {
		 z = z - StarField.speed;
		 
	     if(x > StarField.screenWidth || y > StarField.screenHeight)
	     {
	    	 z = StarField.getWindowWidth();
	    	 //x = rand.nextInt(StarField.screenWidth + 1);
	 		 //y = rand.nextInt(StarField.screenHeight + 1);
	    	 x = -StarField.screenWidth;
	    	 y = -StarField.screenHeight;
	    	 pz = z;
	     }
	     else
	     {
	    	 
	    	 x = x+StarField.speed;;
	    	 y = y+StarField.speed;;
	     }
	      
	  }
	 
	 public void updatePos()
	 {
		 
		 z = z - StarField.speed;
		 
	     if(x > StarField.screenWidth || y > StarField.screenHeight)
	     {
	    	 z = StarField.getWindowWidth();
	    	 x = rand.nextInt(StarField.screenWidth + 1);
	 		 y = rand.nextInt(StarField.screenHeight + 1);
	    	// x = -StarField.screenWidth;
	    	 //y = -StarField.screenHeight;
	    	 pz = z;
	     }
	     else
	     {
	    	 if(x > 0)
	    		 x = x+StarField.speed;
	    	 else if(x < 0)
	    		 x = x-StarField.speed;
	    	 
	    	 if(y > 0)
	    		 y = y+StarField.speed;
	    	 else if(y < 0)
	    		y = y-StarField.speed;;
	     }
	 }
	 
	 public void showSetup()
	 {
		 
		 
		 
	 }
	  
}
