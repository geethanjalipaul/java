import java.awt.*;
import java.net.*;
import java.awt.event.*;
class maxno extends Frame{
	TextField tf1;
	TextField tf2;
	TextField tf3;
	TextField tf4;
	Button b1,b2;
	maxno(){
		setTitle("MAXIMUM NUMBER");
		tf1=new TextField();
		l1=new Label("Enter the Fisrt Number");
		l1.setBound(100,45,145,20);
		tf1.setBound(100,75,145,20);

		tf2=new TextField();
		l2=new Label("Enter the Second Number");
		l2.setBound(100,110,145,20);
		tf2.setBound(100,145,145,20);
	
		tf3=new TextField();
		l3=new Label("Enter the Third Number");
		l3.setBound(100,170,145,20);
		tf3.setBound(100,200,145,20);

		tf4=new TextField();
		l4=new Label("");
		l4.setBound(100,240,145,20);
		tf4.setBound(100,240,145,20);

		b1=new Button("FIND");
		b1.setBounds(105,278,70,40);

		b2=new Button("EXIT");
		b2.setBounds(195,278,70,40);

		add(b1);
		add(b2);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l4);
		add(tf4);

		setSize(400,400);
		setVisible(true);
		b1.addActionListener(new ActionListener(){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=Integer.parseInt(tf3.getText());
			if(a>b && a>c)
			{
				l4.setText("Maximum="+String.ValueOf(a));
			}
			else if(b>c)
			{
				l4.setText("Maximum="+String.ValueOf(b));
			}
			else
			{
				l4.setText("Maximum="+String.ValueOf(c));
			}
		}
	});
	b2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		System.exit(0);
		}
	});
}
public static void main(String args[]){
new maxno();
}
}
