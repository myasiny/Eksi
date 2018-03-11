import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Content extends JDialog {
    Content(Frame parent) {
        super(parent, "giris - eksi sozluk", true);

        JPanel panel_top = new JPanel(new GridBagLayout());
        JPanel panel_bottom = new JPanel(new GridBagLayout());
        GridBagConstraints grid_config = new GridBagConstraints();

        panel_top.setBackground(Color.WHITE);
        panel_bottom.setBackground(Color.WHITE);

        grid_config.fill = GridBagConstraints.HORIZONTAL;
        grid_config.insets = new Insets(8,8,8,8);

        JLabel txt_header = new JLabel("giris");
        grid_config.gridx = 0;
        grid_config.gridy = 0;
        grid_config.gridwidth = 1;
        panel_top.add(txt_header, grid_config);

        JLabel txt_email = new JLabel("e-mail adresi");
        txt_email.setFont(txt_email.getFont().deriveFont(10));
        grid_config.gridx = 0;
        grid_config.gridy = 1;
        grid_config.gridwidth = 1;
        panel_top.add(txt_email, grid_config);

        JTextField input_email = new JTextField(25);
        grid_config.gridx = 0;
        grid_config.gridy = 2;
        grid_config.gridwidth = 2;
        panel_top.add(input_email, grid_config);

        JLabel txt_password = new JLabel("sifre");
        txt_password.setFont(txt_password.getFont().deriveFont(10));
        grid_config.gridx = 0;
        grid_config.gridy = 3;
        grid_config.gridwidth = 1;
        panel_top.add(txt_password, grid_config);

        JTextField input_password = new JTextField(25);
        grid_config.gridx = 0;
        grid_config.gridy = 4;
        grid_config.gridwidth = 2;
        panel_top.add(input_password, grid_config);

        JCheckBox box_remember = new JCheckBox("unutma bunlari sorucam sonra");
        box_remember.setFont(box_remember.getFont().deriveFont(10));
        box_remember.setOpaque(false);
        grid_config.gridx = 0;
        grid_config.gridy = 5;
        grid_config.gridwidth = 1;
        panel_top.add(box_remember, grid_config);

        JButton btn_submit = new JButton("giris yapmaya cabala");
        btn_submit.setForeground(Color.WHITE);
        btn_submit.setBackground(Color.decode("#6fb834"));
        btn_submit.setBorder(BorderFactory.createEmptyBorder(10,80,10,80));
        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usermail = input_email.getText();
                String userpass = input_password.getText();

                if (usermail.equals("erasmus@ius.edu.ba") && userpass.equals("ius2017")) {
                    JOptionPane.showMessageDialog(Content.this, String.format("hosgeldin %s", usermail), "basarili", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(Content.this, "hatali kullanici ya da sifre ama hangisi soylemem", "basarisiz", JOptionPane.ERROR_MESSAGE);
                    if (box_remember.isSelected()) {
                        input_email.setText(usermail);
                        input_password.setText(userpass);
                    }
                    else {
                        input_email.setText("");
                        input_password.setText("");
                    }
                }
            }
        });

        grid_config.gridx = 0;
        grid_config.gridy = 0;
        grid_config.gridwidth = 1;
        panel_bottom.add(btn_submit, grid_config);

        JLabel txt_header_2 = new JLabel("giremeyis");
        grid_config.gridx = 0;
        grid_config.gridy = 1;
        grid_config.gridwidth = 1;
        panel_bottom.add(txt_header_2, grid_config);

        JLabel txt_reset = new JLabel("sifremi unuttum");
        txt_reset.setFont(txt_reset.getFont().deriveFont(10));
        grid_config.gridx = 0;
        grid_config.gridy = 2;
        grid_config.gridwidth = 1;
        panel_bottom.add(txt_reset, grid_config);

        JLabel txt_register = new JLabel("kayitli kullanici olunasi");
        txt_register.setFont(txt_register.getFont().deriveFont(10));
        grid_config.gridx = 0;
        grid_config.gridy = 3;
        grid_config.gridwidth = 1;
        panel_bottom.add(txt_register, grid_config);

        getContentPane().add(panel_top, BorderLayout.CENTER);
        getContentPane().add(panel_bottom, BorderLayout.PAGE_END);

        pack();
        setResizable(false);
        setLocationRelativeTo(parent);
    }
}
