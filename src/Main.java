import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
//        import functions
        inputTexts use =new inputTexts();
//        setup JFrame
        JFrame jframe = new JFrame();
        jframe.setBounds(300, 700, 350, 700);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setup JPanel
        JPanel jpanle = new JPanel();
        jpanle.setLayout(null);
        jframe.add(jpanle);


//        setup JBotton format
        JButton jbuttonsubmit = new JButton("Submit");
        jbuttonsubmit.setSize(100, 30);
        jbuttonsubmit.setLocation(5,10);

        jframe.setVisible(true);
//      define input text
        JTextField user = use.inText("username", 0);
        JTextField  email = use.inText("email", 1);
        JTextField  phone = use.inText("phone", 2);
        JTextField  country = use.inText("country", 3);
        JTextField  city = use.inText("city", 4);
        JTextField  street = use.inText("street", 5);
        JComboBox gender = use.genderInput("male", "female",6);
        JTextField  password = use.inText("password", 7);



//      add input text to JPanel
        jpanle.add(user);
        jpanle.add(email);
        jpanle.add(phone);
        jpanle.add(country);
        jpanle.add(city);
        jpanle.add(street);
        jpanle.add(gender);
        jpanle.add(password);
        jpanle.add(jbuttonsubmit);
//      Setup Lable Text
        JLabel userLable = use.tileLable("User: ", 8);
        JLabel emaiLable = use.tileLable("Email: ", 9);
        JLabel phoneLable = use.tileLable("Phone: ", 10);
        JLabel countryLable = use.tileLable("Country: ", 11);
        JLabel cityOLable = use.tileLable("City: ", 12);
        JLabel streeLable = use.tileLable("Street: ", 13);
        JLabel genderLable = use.tileLable("Gender: ", 14);
        JLabel passwordLable = use.tileLable("Password: ", 15);

        jpanle.add(userLable);
        jpanle.add(emaiLable);
        jpanle.add(phoneLable);
        jpanle.add(countryLable);
        jpanle.add(cityOLable);
        jpanle.add(streeLable);
        jpanle.add(genderLable);
        jpanle.add(passwordLable);

//      setup output text
        JLabel userOut = use.outLable("User", 8);
        JLabel emailOut = use.outLable("Email", 9);
        JLabel phoneOut = use.outLable("Phone", 10);
        JLabel countryOut = use.outLable("Country", 11);
        JLabel cityOut = use.outLable("City", 12);
        JLabel streetOut = use.outLable("Street", 13);
        JLabel genderOut = use.outLable("Gender", 14);
        JLabel passwordOut = use.outLable("Password", 15);
//      add output text to  JPanel
        jpanle.add(userOut);
        jpanle.add(emailOut);
        jpanle.add(phoneOut);
        jpanle.add(countryOut);
        jpanle.add(cityOut);
        jpanle.add(streetOut);
        jpanle.add(genderOut);
        jpanle.add(passwordOut);
//      button function transform input text to output text
        jbuttonsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userOut.setText(user.getText().toString());
                user.setText("username");
                emailOut.setText(email.getText().toString());
                email.setText("email");
                phoneOut.setText(phone.getText().toString());
                phone.setText("phone");
                countryOut.setText(country.getText().toString());
                country.setText("country");
                cityOut.setText(city.getText().toString());
                city.setText("city");
                streetOut.setText(street.getText().toString());
                street.setText("street");
                genderOut.setText(gender.getSelectedItem().toString());
                gender.setSelectedIndex(0);
                passwordOut.setText(password.getText().toString());
                password.setText("password");
            }
        });
    }
}