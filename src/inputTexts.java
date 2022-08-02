import javax.swing.*;

public class inputTexts {
    // function for formated Text input.
    public JTextField inText(String name, int row){
        JTextField text = new JTextField();
        text.setSize(100, 30);
        text.setLocation(110, 10 + (35 * row));
        text.setText(name);


        return text;
    }
    // function for formated out lable.
    public JLabel outLable(String name, int row){
        JLabel lable = new JLabel();
        lable.setSize(110, 30);
        lable.setHorizontalAlignment(JLabel.LEFT);
        lable.setLocation(110, 35 * row);
        lable.setText(name);

        return lable;
    }
    public JLabel tileLable(String name, int row){
        JLabel lable = new JLabel();
        lable.setSize(110, 30);
        lable.setHorizontalAlignment(JLabel.RIGHT);
        lable.setLocation(0, 35 * row);
        lable.setText(name);

        return lable;
    }
    public JComboBox genderInput(String gender1, String gender2, int row){
        String genderList[] = {gender1, gender2};
        JComboBox gender = new JComboBox(genderList);
        gender.setSize(100, 30);
        gender.setLocation(110, 10 + (35 * row));


        return gender;
    }
}
