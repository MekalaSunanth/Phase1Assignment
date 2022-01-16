package Innerclasses;

	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


		public class  AnonymInner  {

		public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Traing Inner Class");
		         }
		      };
		      i.display();
		}
	}
