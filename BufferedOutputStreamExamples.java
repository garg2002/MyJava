import java.io.*;  
public class BufferedOutputStreamExamples{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("text.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to Stream classes in Java.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  