class Quadrangle extends Figure{
	//
	public Quadrangle(int b, int h) {
			super(b, h);
		}

	@Override
	public void show(){
		System.out.println("四角形のデータ");
		super.show();
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