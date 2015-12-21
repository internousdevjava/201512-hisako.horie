

class Triangle extends Figure{
	private final double HALF = 2.0;

	public Triangle(int b, int h) {
		super(b, h);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void show(){
		System.out.println("三角形のデータ");
		super.show();
		System.out.println("面積" + ((getBase()*getHeight())/HALF) + "平方cm" );
}
	@Override
	public double getArea(){
		return 0.0;




/*
    public void overridable(){
        System.out.println( "Figure#overridable()" );
        */
    }
}
