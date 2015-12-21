
public class Figure {
	public static void main(String args[]){




	}
//
	private int base;
	private int height;
	private double area;
	//
	public Figure(int base,int height){
		setBase(base);
		setHeight(height);
		area = (base * height );

}

	public void show(){
		System.out.println("底辺:" + base + " cm");
		System.out.println("高さ:" + height + " cm");
		System.out.println("面積:" + area + " 平方cm");


	}
	public double getArea(double area){
		return 0.0;
	}
	//
	public void setBase(int base){
		if(base > 0){
			this.base = base;
		}
	}
	//
	public void setHeight(int height){
		if(height > 0){
			this.height = height;
	}
	}
		public double getArea(){
		    return area;
		  }

	public int getBase(){
		return base;
	}
		//
	public int getHeight(){
			return height;

	}



}