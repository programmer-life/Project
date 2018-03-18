package MyProject;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import MyProject.practical;
import static MyProject.practical.aList;
/**
 *
 * @author Nazim
 */
public class MyProject{

public static void main(String[] args) throws MyException,Exception{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Directory Path:");
String sPath=sc.nextLine();
                     File f = new File (sPath);
practical.method1(sPath);
              System.out.println("File Path to Store Directory Path:");
String dPath=sc.nextLine();
           File fwr = new File (dPath);
if(fwr.isFile()){
                FileWriter fw=new FileWriter(fwr);
                      BufferedWriter w=new BufferedWriter(fw);
        Iterator itr=aList.iterator();  
                          while(itr.hasNext()){
             String str=(String) itr.next();
                            w.write(str);
   w.newLine();
            w.flush();
            }

            System.out.println("File transfer Successfully");
}  
else{
throw new MyException("Invalid File "); 
}

}}


    

