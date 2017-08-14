/*
 * there three ways we can access the package from another package
 * import packagename.*;
 * import packagename.classname;
 * fully qualified name.
 * 
 */

//here we are showing how the packages are useful and accessible of package
package mypackage; //here i have taken a package name as mypackage

public class ClassA { //created  class as classA
     
		public void run(){ //given two methods and declared them that where dog a some properties like run and bark
			
			System.out.println("Dog has a property that can run ");
			
			}  

		public void bark(){
			
			System.out.println("Dog has a property that can bark");
	}

}
