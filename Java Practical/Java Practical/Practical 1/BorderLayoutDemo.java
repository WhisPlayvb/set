//Demonstrate borderLayout
import java.awt.*;
import java.awt.applet.*;
import java.util.*;
/*
	<applet code="BorderLayoutDemo" width="300" height="300">
	</applet>
*/
public class BorderLayoutDemo extends Applet
{
	
	Button btnTop, btnBotton, btnRight, btnLeft, btnCenter;
	TextArea txtName;

	public void init()
	{	
		
		BorderLayout b = new BorderLayout();
		setLayout(b);

		btnTop = new Button("Top");
		btnButton = new Button("BOTTOM");
		btnRight = new Button("Right");
		btnLeft = new Button("Left");
		btnCenter = new Button("Center");
		txtName = new TextArea("Border Layout");
		
		add(btnTop, BorderLayout.NORTH);
		add(btnButton, BorderLayout.SOUTH);
		add(btnLeft, BorderLayout.EAST);
		add(btnRight, BorderLayout.WEST);
		add(txtName, BorderLayout.CENTER);
		
		

	}//end of init method

}//end of BorderLayoutDemo class