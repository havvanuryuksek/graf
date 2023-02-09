
package graf;

public class Graf {
   private boolean adjMatrix[][];
   private int numVertices;
   
   public Graf(int numVertices){
       this.numVertices = numVertices;
       adjMatrix = new boolean[numVertices][numVertices];
       
   }
    //kenar ekle
        public void addEdge(int i, int j){
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
        //kenar çıkar
        public void removeEdge(int i, int j){
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
        public String toString(){
            String s = "";
            for(int i=0; i< numVertices; i++){// bir for satırı öteki for ise sütünu gezmesi için
                s=s+i+"";
                for(boolean j: adjMatrix[i]){
                    if(j) s=s+""+1;
                    else s=s+""+0;
                }
                s=s+"\n";  
            }
            return s;
        }
        public boolean yonsuzmu(){
            boolean y=true;
            for(int i=0; i<numVertices; i++){
                for(int j=0; j<numVertices; j++){
                    if(adjMatrix[i][j]!=adjMatrix[j][i]){
                        y=false; // bu ve altındaki satırın yerine return false diyip alttaki return y yi de return true dersek de olur y yi kullanmamış oluruz.
                    break;}
                if(y==false){
                    break;
                    } } }
                   return y;}
 
        
        
    public static void main(String[] args) {
        Graf g = new Graf(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
      System.out.print(g.toString());
      System.out.println("yonsuz mu? "+g.yonsuzmu());
  
    }
    
}
