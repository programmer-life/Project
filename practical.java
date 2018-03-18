package MyProject;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Salman
 */
public class practical {
public static ArrayList aList=new ArrayList(); 
public static void method1(String sPath) throws MyException{
File f = new File (sPath);
if( f.isFile()==true){
 aList.add(f.getPath());
}else if (f.isDirectory()==true  ) {
    method2(sPath);
}else
 throw new MyException("Invalid Directrory");   
}
public static void method2(String path1){
File f = new File (path1);
File []f1=f.listFiles();
for(File f2:f1){
               if(f2.isDirectory()==true){
               String pathRecursive=f2.getAbsolutePath();
               method2(pathRecursive);
               }
               else
               {
                   aList.add(f2.getAbsolutePath());
                  
               }          
}}
}
