package NameRepository;

import Iterator.*;
import Container.*;
import NameIterator.*;


public class NameRepository implements Container {
   private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   public Object getAt(int i) {
	if (i < names.length) {
		return names[i];
	}
	return null;
   }
   public int getSize (){
	return names.length;
   }

   @Override
   public NameIterator getIterator() {
      return new NameIterator();
   }
}