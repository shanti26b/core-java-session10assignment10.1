
/*
 *if we use packagename.* then all the classes and interface of this package  
 * will be accessible .
 * the import keyword is used to make the classes and interfaces of another package 
 * accessible to the current package  
 * 
 * if we import packagename.classname then only  declared the class of this package will be accessible
 */
package mypack2;//here created another package to show how the classes will run in different packages


import mypackage.*;    // here if we use this import packagename.* we can accessible all the classes in the the mypackage
import mypackage.ClassA;//or we can use mypackage.classname where we can accessible only the .classfile in this package 

public class ClassB { //created another main class as ClassB

	public static void main(String[] args) { //created main method
		
		System.out.println("The properties of a dog is :");   
		
		ClassA demo =new ClassA(); //here i have created the object for the ClassA here it shows the an error that to import package of classA
		System.out.println("here the classA methods have been called in the different package");
		demo.bark();//here it displays the properties 
		demo.run();

	}

}
