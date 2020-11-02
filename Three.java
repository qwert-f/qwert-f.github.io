
public class Three {
    double height;
    double length;
    double width;
    Bottom bottom;
    Three(){
    	
    }
    Three(double length,double width,double height){
    	this.length = length;
    	this.width = width;
    	bottom = new Bottom(this.length,this.width);
    	this.height = height;
    }
    public void volume(){
    	double a = bottom.area();
    	System.out.println("volume is："+a*height);
    }
    class Bottom{
       double length;
       double width;
       Bottom(double length,double width){
    	   this.length = length;
    	   this.width = width;
       }
       public double area(){
    	   return length*width/2;
       }
      
    }
    
	public static void main(String args[]){
		Three three = new Three(3,4,5);
		three.volume();
		
	}
}