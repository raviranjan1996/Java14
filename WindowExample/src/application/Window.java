package application;

public class Window {
	private double height;
	private double width;
	private String curtain;
	private boolean isVisible;

	public Window(double height , double width , String curtain , boolean isVisible) {
		
		this.height = height;
		this.width = width;
		this.curtain = curtain;
		this.isVisible = isVisible;
		
	}
	
	public Window() {
		this.curtain = "jorjot";
		this.height=12.321;
		this.width=5.1;
		this.isVisible=false;
	}
	
	public void setHeight(double height) {
		this.height = height;

	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setCurtain(String curtain) {
		this.curtain = curtain;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getCurtain() {
		return curtain;
	}
	
	public boolean getVisible() {
		return isVisible;
	}
	
	
	public String toString() {       //return String as a window object
      return "Window [Height: " + height + ", " + "Width: " + width + ", " + "Curtain: " + curtain + ", " + "Visibility: " + isVisible +"]";
	}

}
