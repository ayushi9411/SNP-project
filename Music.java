import java.io.*;
import java.util.ArrayList;
public class Music {
File x;
public ArrayList<String> extract(String p){
	ArrayList<String> al = new ArrayList<String>();
File f=new File(p);
File l[]=f.listFiles();
for(File x:l)
{
    if(x==null){//return "Failed";
    	
    }
    if(x.isHidden()||!x.canRead())
        continue;
    if(x.isDirectory())
        extract(x.getPath());
    else if(x.getName().endsWith(".mp3"))
      //  System.out.println(x.getPath()+"\\"+x.getName());
    al.add(x.getName());

}
return al;
}
} 