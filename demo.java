class Animal{
	Animal(){
		System.out.println("Animal constructor");
	}
}

class Demo extends Animal{

	Demo(){
		System.out.println("Demo constructor");
	}

	public static void main(String args[]){
		Demo d = new Demo();
	}
}