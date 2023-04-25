import java.io.IOException;

public class Main{

    static BufferReaderEngine BRE = new BufferReaderEngine();
    static RegexAll REGA = new RegexAll();
    static RegexOnce REGO = new RegexOnce();

    public static void main(String[] args) throws IOException{
     
     System.out.print("Welcome to Yunus's Regex-man in Java. You give me chunk of text, find value, and replace value. I give you finding regex, and also do the job of replacing.\n enter a chunk of text:\n");
     String chunkString=null;
     while(chunkString==null||chunkString.isEmpty()){ chunkString = BRE.br.readLine();}
     System.out.println("Pick one of these: ,'(1) regex for replacing something with another thing and the result.\n(2)same regex but your result will be replacing all occurences of input with something else'\n ");
     String selectionString=null;
     while(selectionString==null|| selectionString.isEmpty()){selectionString = BRE.br.readLine();}
     Boolean one_or_two=selectionString.equals("1") ? true : false;
     System.out.println("what are we looking for? and what are we replacing it with?(seperate two with comma)\n");
     String theWord=null;
     while(theWord==null || !theWord.contains(",") || theWord.isEmpty()){ theWord= BRE.br.readLine();}
 
     String[] splitWord=theWord.split(",");
     String finthis=splitWord[0].trim();
     String replacewiththis=splitWord[1].trim();

     String[] results=null;

     if(one_or_two){
         
     //run make regex that replaces once method
        results = REGO.main(chunkString,finthis,replacewiththis);
        System.out.println(results[0]+"\n"+results[1]);
        
        }else{
         
            //run make regex that replaces all occurences method
            results = REGA.main(chunkString,finthis,replacewiththis);
            System.out.println(results[0]+"\n"+results[1]);

        }
    }
}