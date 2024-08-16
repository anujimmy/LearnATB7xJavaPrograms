package ex_Aug042024.singleInheritance.ex;

public class Python extends Programming{
//     is a relationship
//    Son - python
//    Father - programming
//    Son can use fathers surname but father cannt use sons surname
    String type;
    Python(){
        author = "Mr.Guido van Rosum"; // got from Programming class
        version = "Py 3.0"; // got from Programming class
        type = "open source"; // own parameter
        System.out.println("DC Python");
        System.out.println(author + "-" + version + "-" + type);
    }
}
