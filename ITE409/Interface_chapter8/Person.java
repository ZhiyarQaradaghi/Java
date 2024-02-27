package ITE409.Interface_chapter8;

public interface Person { // interface is like an adjective, provides a classification/categorizes for classes
    /**Allows to have declarations of methods
     * but unlike classes
     *  - it doesnt have variables
     *  - cannot implement methods  */

     public void setName(String n); // in interfaces, default property for access modifiers are PUBLIC !
     public String getName();
     // ^^ every person should have setName and getName

     // limitation, you can only access methods that exist in Person interface

}
