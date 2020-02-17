package ie.tudublin;

public class Main
{

    public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }
    
    
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");
        int i = 0;
        Animal misty = new Dog(); // Polymorphism
        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  
        Cat topcat = new Cat();
        topcat.speak();

        topcat.Kill();
        for (i = 0;i < 9; i++) {
            topcat.Kill();

        }




        Main main = new Main();
		main.helloProcessing();
        
    }
}