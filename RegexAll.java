 
public class RegexAll {

    String result=null;
    String REGEX=null;

    public String[] main(String chunk,String FindThis, String ReplaceWithThis){
    System.out.println("****chunk-->"+chunk+"\n\nthe word and its replacement--->"+FindThis+","+ReplaceWithThis+"\n");
     
    String chunkNew= chunk.replaceAll("(?i)"+FindThis, ReplaceWithThis);


    result=chunkNew;
    REGEX="regex: ^(?i)"+FindThis+"$";
    
    return new String[]{result,REGEX};
 }
}
