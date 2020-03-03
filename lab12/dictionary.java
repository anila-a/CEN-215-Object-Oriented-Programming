/* Sketch the class definition and method signatures for a Dictionary class, which allows
one to store or look up a value object indexed by a key object. Give the method
signatures for get, put, isEmpty, keys, and values. */

package lab12;

public class dictionary<A,B> {
     pair<A,B>[] lista;
     private int size=100;
     private int index;
     
     dictionary(){
    	 lista=new pair[size];
    	 index=0;
     }
     public B get(A key) {
    	 if(isEmpty()) return null;
    	 else {
    		 for(int i=0;i<index;i++)
    			 if(lista[i].getKey().equals(key))
    				 return lista[i].getValue();
    		 return null;
    	 }
     }
     public void put(A key, B value) {
    	 if(index+1>=size) {
    		 pair<A,B>[] newL = new pair[2*size];
    		 for(int i=0;i<size;i++) 
    			 newL[i] = lista[i];
    		 lista = newL;
    		 
    	 }
    	 lista[index++] = new pair<A,B>(key,value);
     }
     
	 private boolean isEmpty() {
		return (index<=0);
	 }
	 
	 public A[] keys() {
		 A[] newA = (A[]) new Object[index]; 
		 for(int i=0;i<index;i++) {
			 newA[i] = lista[i].getKey();
		 }
		 return newA;
	 }
	 
	 public B[] values() {
		 B[] newB = (B[]) new Object[index];
		 for(int i=0;i<index;i++) {
			 newB[i]=lista[i].getValue();
		 }
		 return newB;
	 }
}
