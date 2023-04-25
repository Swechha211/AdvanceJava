package com.bean;
import java.util.*;

  public class DesignpatternEvent {
	private List<MyListener> listeners = new ArrayList<>();
	public void addListener(MyListener listener){
		listeners.add(listener);
	}
	public void removeListener(MyListener listener){
		listeners.remove(listener);
	}
	
	private void fireMyEvent(MyEvent event){
		for(MyListener listener : listeners){
			listener.myEventOccurred(event);
		}
	}
	public void doSomething(){
		//do some work
		//fire the event
		
		MyEvent event = new MyEvent(this);
		fireMyEvent(event);
	}
  
	
	



  public static void main(String[] args){
	  class MyListenerImpl implements MyListener{
		  
		  public void myEventOccurred(MyEvent event){
			  System.out.println("MyEvent occurred on " + event.getSource());
		  }
		  
	  }
	  DesignpatternEvent bean = new DesignpatternEvent();
	  bean.addListener(new MyListenerImpl());
	  bean.doSomething();
}
  
  interface MyListener{
	  void myEventOccurred(MyEvent event);
  }
  
  	class MyEvent{
  		private DesignpatternEvent source;
  		public MyEvent(DesignpatternEvent source){
  			this.source = source;
  		}
  		public DesignpatternEvent getSource(){
  			return source;
  		}
  	}
  }
