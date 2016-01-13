/**
 * Write down the result of the program.
 */
public class Main {

	public static class Base {
		public void execute(Base obj) {
			System.out.println("Hello / " + obj.getClass().getSimpleName());
		}
		public void execute(Child obj) {
		}
	}

	public static class Child extends Base {
		private String s = "Hello world.";

		public void execute(Base obj) {
			System.out.println("Brush / " + obj.getClass().getSimpleName());
		}
		
		public void execute(Child obj) {
			System.out.println("Lollipop / " + obj.getClass().getSimpleName());
		}

		private void setString(String str){
			str = null;
		}

		private void printString() {
			setString(s);
			System.out.println(s);
		}
	}


	public static void main(String[] args) throws InterruptedException {
		Base a = new Child();
		Child b = new Child();
		Base c = new Base();
		
		b.execute(a);
		b.execute(b);
		a.execute(b);
		c.execute(a);
		c.execute(c);
		c.execute(b);
		
		b.printString();
	}

}
