package NameIterator;
import Iterator.*;
import NameRepository.*;
public class NameIterator implements Iterator {

      int index;
      NameRepository names = new NameRepository();
      @Override
      public boolean hasNext() {
         if(index < names.getSize()){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if(hasNext()){
            return names.getAt(index++);
         }
         return null;
      }		
}