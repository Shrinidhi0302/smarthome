import java.util.ArrayList;
public class abc
{
public static void main(String args[])
{
ArrayList<String> animal=new ArrayList<>();
animal.add("Cat");
animal.add("Horse");
animal.add("Kitten");
animal.remove("Horse");
System.out.println("AnimalList:"+animal);
}
}