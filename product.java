package nandini;

public class product {
	String prodname;
	double prize;
	String discount;
	String quatity;
	String GST;
	public static void main(String[] args) {
		product P1=new product();
		P1.prodname="icecream";
		P1.prize=450;
		P1.quatity="50 grms";
		P1.discount= "10%";
		P1.GST="2%"
		System.out.println("product name : "+P1.prodname);
		System.out.println("prize : "+P1.prize);
		System.out.println("discount : "+P1.discount);
		System.out.println("quatity : "+P1.quatity);
		System.out.println("GST : "+P1.GST);
	}

}
   