package siskom;

public class Test {
	public static void main(string[]args) {
// Animal a = new Animal(2);
// Pet p = new Pet();
		
		Animal ab = new Harimau();
		ab.Walk();
		ab.Eat();
		
		Animal ac = new Sapi();
		ac.Walk();
		ac.Eat();
		
		Pet ad = new Ayam();
		ad.setName("Si Jago");
		System.out.println("Nama Ayam :" +ad.getName());
		
		Animal ae = new Ayam();
		ae.Walk();
		ae.Eat();
		
		
	}
}
