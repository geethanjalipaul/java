import java.awt.*;
import java.net.*;
import java.awt.event.*;
class calculator extends Frame{
	TextField tf1,tf2,tf3,tf4;
	Button b1,b2,b3,b4,b5,b6;
	label l1,l2,l3;	
        calculator(){
		setTitle("CALCULATOR");
		tf1=new TextField();
		l1=new Label("Enter the Fisrt Number");
		l1.setBound(100,45,145,20);
		tf1.setBound(100,75,145,20);

		tf2=new TextField();
		l2=new Label("Enter the Second Number");
		l2.setBound(100,110,145,20);
		tf2.setBound(100,145,145,20);
	
		tf3=new TextField();
		l3=new Label("Result");
		l3.setBound(100,170,145,20);
		tf3.setBound(100,200,145,20);

		b1=new Button("+");
		b1.setBounds(65,200,80,40);

		b2=new Button("-");
		b2.setBounds(155,200,80,40);

		b3=new Button("*");
		b3.setBounds(245,200,80,40);

		b4=new Button("/");
		b4.setBounds(95,250,80,40);

		b5=new Button("%");
		b5.setBounds(195,250,80,40);

		b6=new Button("EXIT");
		b6.setBounds(140,310,70,40);

		add(b1);
		add(b2);
		add(b3);
		add(b4);	
		add(b5);
		add(b6);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);

		setSize(400,400);
		setVisible(true);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a+b;
			l3.setText(String.valueOf(a)+"+"+String.valueOf(b)+"="+String.valueOf(c));
			}
});

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a-b;
			l3.setText(String.valueOf(a)+"-"+String.valueOf(b)+"="+String.valueOf(c));
			}
});

		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a*b;
			l3.setText(String.valueOf(a)+"*"+String.valueOf(b)+"="+String.valueOf(c));
			}
});
		
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a/b;
			l3.setText(String.valueOf(a)+"/"+String.valueOf(b)+"="+String.valueOf(c));
			}
});
		
	b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a%b;
			l3.setText(String.valueOf(a)+"%"+String.valueOf(b)+"="+String.valueOf(c));
			}
});




	
	b6.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		System.exit(0);
		}
	});
}
public static void main(String args[]){
new calculator();
}
}
