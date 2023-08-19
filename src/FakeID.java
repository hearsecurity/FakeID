import org.json.*;
import java.io.*; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;


class getInfo {


       public String[] json_decode(String object) {

       String[] id = new String[10]; 
       int age;

       JSONArray jsonArr = new JSONArray(object);

       for (int i = 0; i < jsonArr.length(); i++)
        {
            JSONObject jsonObj = jsonArr.getJSONObject(i);
            id[0] = jsonObj.getString("gender");
            id[1] = jsonObj.getJSONObject("name").getString("first");
            id[2] = jsonObj.getJSONObject("name").getString("last");
            id[3] = jsonObj.getJSONObject("location").getJSONObject("street").getString("name");
            //id[4] = jsonObj.getJSONObject("location").getString("city");
            id[5] = jsonObj.getJSONObject("location").getString("state");
            id[6] = jsonObj.getJSONObject("location").getString("country");
            id[7] = jsonObj.getString("email");
            id[8] = jsonObj.getString("phone");
            age = jsonObj.getJSONObject("dob").getInt("age");
            id[9] = Integer.toString(age);

        }

        return id;

     }
}


class MyFrame extends JFrame implements ActionListener {
     
     private Container c;
     private JLabel title;
     private JLabel icon; 
     private JLabel nome_text;
     private JTextField nome_field;
     private JLabel sobrenome_text;
     private JTextField sobrenome_field;
     private JLabel idade_text;
     private JTextField idade_field;
     private JLabel telefone_text;
     private JTextField telefone_field;
     private JLabel sexo_text;
     private JTextField sexo_field;
     private JLabel estado_text;
     private JTextField estado_field;
     private JLabel pais_text;
     private JTextField pais_field;
     private JLabel email_text;
     private JTextField email_field;
     private JButton sub;
     private JButton reset;


	 public MyFrame() { 

	 	 setTitle("Random Person Generator");
         setBounds(400, 400, 800, 850);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);
         c = getContentPane();
         c.setLayout(null);

         title = new JLabel("Random Identity Generator");
         title.setForeground(Color.black);
         title.setFont(new Font("monospaced", Font.BOLD, 20));
         title.setSize(300,30);
         title.setLocation(240,30);
         c.add(title);

         URL url1 = this.getClass().getResource("/images/id.png");
         ImageIcon person = new ImageIcon(url1);
         icon = new JLabel(person);
         icon.setSize(150, 150);
         icon.setLocation(300,100);
         c.add(icon);

         nome_text = new JLabel("Name: ");
         nome_text.setFont(new Font("monospaced", Font.BOLD, 25));
         nome_text.setSize(200,200);
         nome_text.setLocation(150,180);
         c.add(nome_text);

         nome_field = new JTextField();
         nome_field.setFont(new Font("Arial", Font.PLAIN, 20));
         nome_field.setSize(300, 35);
         nome_field.setLocation(250, 265);
         nome_field.setEditable(true);
         nome_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(nome_field);

         sobrenome_text = new JLabel("Lastname: ");
         sobrenome_text.setFont(new Font("monospaced", Font.BOLD, 25));
         sobrenome_text.setSize(200,200);
         sobrenome_text.setLocation(150,240);
         c.add(sobrenome_text);

         sobrenome_field = new JTextField();
         sobrenome_field.setFont(new Font("Arial", Font.PLAIN, 20));
         sobrenome_field.setSize(300, 35);
         sobrenome_field.setLocation(310, 325);
         sobrenome_field.setEditable(true);
         sobrenome_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(sobrenome_field);

         idade_text = new JLabel("Age: ");
         idade_text.setFont(new Font("monospaced", Font.BOLD, 25));
         idade_text.setSize(200,200);
         idade_text.setLocation(150,300);
         c.add(idade_text);

         idade_field = new JTextField();
         idade_field.setFont(new Font("Arial", Font.PLAIN, 20));
         idade_field.setSize(100, 35);
         idade_field.setLocation(250, 380);
         idade_field.setEditable(true);
         idade_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(idade_field);

         telefone_text = new JLabel("Phone: ");
         telefone_text.setFont(new Font("monospaced", Font.BOLD, 25));
         telefone_text.setSize(200,200);
         telefone_text.setLocation(150,350);
         c.add(telefone_text);

         telefone_field = new JTextField();
         telefone_field.setFont(new Font("Arial", Font.PLAIN, 20));
         telefone_field.setSize(280, 35);
         telefone_field.setLocation(300, 430);
         telefone_field.setEditable(true);
         telefone_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(telefone_field);

         sexo_text = new JLabel("Sex: ");
         sexo_text.setFont(new Font("monospaced", Font.BOLD, 25));
         sexo_text.setSize(200,200);
         sexo_text.setLocation(150,415);
         c.add(sexo_text);

         sexo_field = new JTextField();
         sexo_field.setFont(new Font("Arial", Font.PLAIN, 20));
         sexo_field.setSize(200, 35);
         sexo_field.setLocation(230, 500);
         sexo_field.setEditable(true);
         sexo_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(sexo_field);

         estado_text = new JLabel("State: ");
         estado_text.setFont(new Font("monospaced", Font.BOLD, 25));
         estado_text.setSize(200,200);
         estado_text.setLocation(150,490);
         c.add(estado_text);

         estado_field = new JTextField();
         estado_field.setFont(new Font("Arial", Font.PLAIN, 20));
         estado_field.setSize(200, 35);
         estado_field.setLocation(260, 575);
         estado_field.setEditable(true);
         estado_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(estado_field);

         pais_text = new JLabel("Country: ");
         pais_text.setFont(new Font("monospaced", Font.BOLD, 25));
         pais_text.setSize(250,200);
         pais_text.setLocation(150,550);
         c.add(pais_text);

         pais_field = new JTextField();
         pais_field.setFont(new Font("Arial", Font.PLAIN, 20));
         pais_field.setSize(280, 35);
         pais_field.setLocation(280, 635);
         pais_field.setEditable(true);
         pais_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(pais_field);

         email_text = new JLabel("Email: ");
         email_text.setFont(new Font("monospaced", Font.BOLD, 25));
         email_text.setSize(200,200);
         email_text.setLocation(150,605);
         c.add(email_text);

         email_field = new JTextField();
         email_field.setFont(new Font("Arial", Font.PLAIN, 20));
         email_field.setSize(300, 35);
         email_field.setLocation(250, 690);
         email_field.setEditable(true);
         email_field.setHorizontalAlignment(JTextField.CENTER);
         c.add(email_field);

         sub = new JButton("Generate");
         sub.setFont(new Font("Arial", Font.PLAIN, 15));
         sub.setSize(100, 20);
         sub.setLocation(270, 750);
         sub.addActionListener(this);
         c.add(sub);

         reset = new JButton("Reset");
         reset.setFont(new Font("Arial", Font.PLAIN, 15));
         reset.setSize(100, 20);
         reset.setLocation(390, 750);
         reset.addActionListener(this);
         c.add(reset);
         
         
         setVisible(true);
	 }

     public String FakeId() throws MalformedURLException, IOException {

         StringBuilder fakeinfo = new StringBuilder();
         URL url = new URL("https://randomuser.me/api/?format=json");
         HttpURLConnection con = (HttpURLConnection) url.openConnection();
         BufferedReader reader = new BufferedReader(
         new InputStreamReader(con.getInputStream()));

         for (String line; (line = reader.readLine()) != null; ) {
                fakeinfo.append(line);
         }
         String info = fakeinfo.toString();
         return info;

     }


	 public void actionPerformed(ActionEvent e) {

        if(e.getSource() == sub) { 

              try {

                 String fakeid = FakeId();
                 getInfo info = new getInfo(); 
                 String[] id = info.json_decode(fakeid.substring(11));

                 nome_field.setText(id[1]);
                 sobrenome_field.setText(id[2]);
                 idade_field.setText(id[9]);
                 telefone_field.setText(id[8]);
                 sexo_field.setText(id[0]); 
                 estado_field.setText(id[5]);
                 pais_field.setText(id[6]); 
                 email_field.setText(id[7]);


                 
               }catch(MalformedURLException a) {
                  System.out.println("MALFORMED URL.");
               }catch(IOException b) {
                  System.out.println("IO ERROR.");
               }

        }
        else if (e.getSource() == reset) {
               
            nome_field.setText(""); 
            sobrenome_field.setText(""); 
            idade_field.setText(""); 
            telefone_field.setText("");
            sexo_field.setText(""); 
            estado_field.setText("");
            pais_field.setText("");
            email_field.setText("");
        }

    }
} 
public class FakeID {

	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame(); 
	}
}