public class Circle {
	private double x,y;
	private double rayon;
	private double perimetre = 2 * rayon;
	private double diametre = 2 * java.lang.Math.PI * rayon;
	private double surface = java.lang.Math.PI * (rayon * rayon);
	public Circle(double param)
	{
		this.setX(0);
		this.setY(0);
		this.setRayon(param); 

		
		
	}
	public void printMe() {
		System.out.println("Je suis un cercle dont voici les caract�ristiques: \n"
						+ "coordonn�es de mon centre : (" + getX()+ ","+getY() + ")\n"
						+ "rayon : " + getRayon() + "\n"
						+ "p�rim�tre : " + getPerimetre() + "\n"
						+ "surface : " + getSurface() + "\n");
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
		setDiametre(2*this.rayon);
		setSurface(java.lang.Math.PI*this.rayon*this.rayon);
		setPerimetre(2*java.lang.Math.PI*this.rayon);
	}
	public double getDiametre() {
		return diametre;
	}
	public void setDiametre(double diametre) {
		this.diametre = diametre;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	public double getPerimetre() {
		return perimetre;
	}
	public void setPerimetre(double perimetre) {
		this.perimetre = perimetre;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		c1.printMe();
	}
}
