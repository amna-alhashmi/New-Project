package FirstApi;
import java.io.BufferedReader;
import java.io.File;  // Import the File class
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.stream.Stream;

public class ApiTxt {
  public static void main(String[] args) throws IOException {

	boolean menuTxit=true;
	Scanner sa=new Scanner(System.in);
	  while(menuTxit) {
		 System.out.println("PLS SELECT ONE OPTION:");  
		 System.out.println("1.READING FROM THE FILE"); 
		 System.out.println("2.SEARCH FROM THE FILE");
		 System.out.println("3.DIROCTORY THE FILE");
		 String menu=sa.next();
		 int option=Integer.parseInt(menu);
		 switch(option) {
		 
		 case 1:
			  String fileName = "C:\\Users\\user008\\eclipse-workspace\\school\\JSONFile.txt";
			  File file = new File(fileName);
			  FileReader fr = new FileReader(file);
			  BufferedReader br = new BufferedReader(fr);
			  String line;
			  while((line = br.readLine()) != null){
			      
			      System.out.println(line);
			  }
			
			 break;
		
		 case 2:

File dir = new File("C:\\\\Users\\\\user008\\\\eclipse-workspace\\\\school\\");
FilenameFilter textFilter = new FilenameFilter() {
           public boolean accept(File dir, String name) {
               return name.toLowerCase().endsWith(".txt");
           }
       };
       File[] files = dir.listFiles(textFilter);
       for (File file1 : files) {
           if (file1.isDirectory()) {
               System.out.print("directory:");
           } else {
               System.out.print("     file:");
           }
           System.out.println(file1.getCanonicalPath());
       }


File f1=new File("C:\\\\Users\\\\user008\\\\eclipse-workspace\\\\school\\\\Docomantion.txt");
     String[] words=null;  
     FileReader fr1 = new FileReader(f1);  
     BufferedReader br1 = new BufferedReader(fr1); 
     String s;    
        System.out.println("Please Write word to be Search :");

     String input=sa.next();   
     int count=0;   
     while((s=br1.readLine())!=null)   
     {
        words=s.split(" "); 
       
        for(File c: files) {
         for (String word : words)
         {
                if (word.equals(input))   
                {
        System.out.println("The Word is : \t"+input+"\t the file is :\t "+c);

                  count++;    

                }
         }
        }
     }
  
     
     if(count!=0)  
    	 
     {
        System.out.println("The given word is present for "+count+ " Times in the file");
       
     }
     else
     {
        System.out.println("The given word is not present in the file");
     }
     
     fr1.close();
   
	 break;
	 
		 case 3:
			 File file2 = new File("C:\\Users\\user008\\eclipse-workspace\\school");
	         
		        // renaming the file and moving it to a new location
		        if(file2.renameTo
		           (new File("C:\\")))
		        {
		            // if file copied successfully then delete the original file
		            file2.delete();
		            System.out.println("File moved successfully");
		        }
		        else
		        {
		            System.out.println("Failed to move the file");
		        } 
			 
			 
			 
			 
			 
			 
			 
			 break;
		 }
 
 


 }menuTxit=false;
  
  
}


}  
     




       
       
//        System.out.println("If You want to Continue Searching press 1 , If Not Press 0");
//        int search = sa.nextInt();
//        if(search == 0)
//        {
//        SearchExit = false;
//        }
//        else {
//        SearchExit = true;
//        }
       
        

			 
//			 List<File> htmFileList = new ArrayList<File>();
//
//			 String srcDir;
//			for (File file1 : (List<File>) FileUtils.listFiles(new File(srcDir), new String[]{"txt", "TXT"}, true)) {
//			     htmFileList.add(file);
//			 }
//			 
			 
			 
//			 public File[] finder( String dirName){
//			        File dir = new File(dirName);
//
//			        return dir.listFiles(new FilenameFilter() { 
//			                 public boolean accept(File dir, String filename)
//			                      { return filename.endsWith(".txt"); }
//			        } );
//			 File folder = new File("C:\\Users\\user008\\eclipse-workspace\\school");
//			 File[] listOfFiles = folder.listFiles();
//
//			 for (int i = 0; i < listOfFiles.length; i++) {
//			   if (listOfFiles[i].isFile()) {
//			     System.out.println("File " + listOfFiles[i].getName().endsWith((".txt")));
//			   } else if (listOfFiles[i].isDirectory()) {
//			     System.out.println("Directory " + listOfFiles[i].getName());
//			   }
//			 }
//			 System.out.println("what folder you want?");
//			 String folder12=sa.next();
//			 String fileName1 = "c://School.txt";
//			 String stringToSearch = folder12;
//			 try (Stream<String> stream = Files.lines(Paths.get(fileName1))) {
//			      // Find first
//			      Optional<String> lineHavingTarget = stream.filter(l -> l.contains(stringToSearch)).findFirst();
//			      // search all
//			      stream.filter(l -> l.contains(stringToSearch)).forEach(System.out::println);
//			      // do whatever
//			     } catch (IOException e) {
//			          // log exception
//			     }
		 
			 
//			 int cnt=0;
//		      String s;
//		      String[] buffer; 
//		      File f1=new File("school.txt"); 
//		      FileReader fr1 = new FileReader(f1);
//		      BufferedReader bfr = new BufferedReader(fr1);
//		      Scanner sc = new Scanner(System.in);
//		      System.out.println("Enter the word to be Searched");
//		      String wrd=sc.nextLine();
//		       
//		           
//		      while((s=bfr.readLine())!=null)   
//		      {
//		         buffer=s.split(" ");  
//		          for (String chr : buffer) 
//		          {
//		                 if (chr.equals(wrd))   
//		                 {
//		                   cnt++;    
//		                 }
//		          }
//		      }
//		      if(cnt==0)  
//		      {
//		         System.out.println("Word not found!");
//		      }
//		      else
//		      {
//		         System.out.println("Word : "+wrd+"found! Count : "+cnt);
//		      }
//		      
//		         fr1.close();
			 
			 
			 
			 
			 
			 

  


		
		


