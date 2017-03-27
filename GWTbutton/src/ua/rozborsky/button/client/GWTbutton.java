package ua.rozborsky.button.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class GWTbutton implements EntryPoint {

	private String []color = {"#FF9B9B", "#FFCD95", "#FFFFDF", "#BDFFDC", "#BDEAFF", "#9E9EFF", "#EAB6FF"};
	private Button button = new Button("Change background");
	private int i = 0;
	
	public void onModuleLoad() {
		Document.get().getBody().getStyle().setBackgroundColor(color[i++]);
		
		button.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	Document.get().getBody().getStyle().setBackgroundColor(color[i++]);
		    	if(i == color.length){
		    		i = 0;
		    	}
		      }
		    });
		
		RootPanel.get("buttonDiv").add(button);
	}
}
