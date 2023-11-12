//Creating the custom wrapper class  
class Wrapper{  
private int i;  
Wrapper(){}  
Wrapper(int i){  
this.i=i;  
}  
public int getValue(){  
return i;  
}  
public void setValue(int i){  
this.i=i;  
}  
@Override  
public String toString() {  
  return Integer.toString(i);  
}  
}  
//Testing the custom wrapper class  
public class  CustomWrapperClass{  
public static void main(String[] args){  
Wrapper j=new Wrapper(10);  
System.out.println(j);  
}}  
    

