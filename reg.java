import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class reg {

    static JFrame frame;
    
    static JLabel eci, sname, fname, mn, suff ,hns, brgy, mun, pro, email, reg, phone, tel, rs;
    
    static JTextField tsname,tfname, tmn, thns, tbrgy, tmun, tpro, temail, treg, tphone, ttel, trs;
    
    static JComboBox suf;
    
    reg(){
        
    }
            
    public static void main(String[] args) {
        
        frame = new JFrame();
        Font f = new Font("Serif", Font.BOLD, 12);
        Font f1 = new Font("Helvetica", Font.PLAIN, 10);
        Font f2 = new Font("Arial", Font.PLAIN, 11);
        
        eci = new JLabel("EMERGENCY CONTACT PERSON");
        sname = new JLabel("Last Name");
        fname = new JLabel("First Name");
        mn = new JLabel("Middle Name");
        suff = new JLabel("Suffix Name");
        hns = new JLabel("House No. and Street");
        brgy = new JLabel("Barangay");
        mun = new JLabel("Municipality");
        pro = new JLabel("Province");
        reg = new JLabel("Region");
        phone = new JLabel("Mobile Number");
        tel = new JLabel("Telephone");
        email = new JLabel("Email Address");
        rs = new JLabel("Relationship");

        eci.setBounds(20, -5, 200, 100);
        sname.setBounds(20, 40, 100, 100);
        fname.setBounds(175, 40, 100, 100);
        mn.setBounds(330, 40, 100, 100);
        suff.setBounds(485, 40, 100, 100);
        hns.setBounds(20, 87, 100, 100);
        brgy.setBounds(135, 87, 100, 100);
        mun.setBounds(250, 87, 100, 100);
        pro.setBounds(365, 87, 100, 100);
        reg.setBounds(480, 87, 100, 100);
        phone.setBounds(20, 134, 100, 100);
        tel.setBounds(135, 134, 100, 100);
        email.setBounds(250, 134, 100, 100);
        rs.setBounds(480, 134, 100, 100);
        
        tsname = new JTextField();
        tfname = new JTextField();
        tmn = new JTextField();
        thns = new JTextField();
        tbrgy = new JTextField();
        tmun = new JTextField();
        tpro = new JTextField();
        treg = new JTextField();
        tphone = new JTextField();
        ttel = new JTextField();
        temail = new JTextField();
        trs = new JTextField();
        
        tsname.setBounds(20, 63, 135, 20);
        tfname.setBounds(175, 63, 135, 20);
        tmn.setBounds(330, 63, 135, 20);
        thns.setBounds(20, 110, 100, 20);
        tbrgy.setBounds(135, 110, 100, 20);
        tmun.setBounds(250, 110, 100, 20);
        tpro.setBounds(365, 110, 100, 20);
        treg.setBounds(480, 110, 100, 20);
        tphone.setBounds(20, 157, 100, 20);
        ttel.setBounds(135, 157, 100, 20);
        temail.setBounds(250, 157, 215, 20);
        trs.setBounds(480, 157, 100, 20);
        
        String suffix[] = {"N/A", "Jr", "Sr"};
        suf = new JComboBox(suffix);
        
        suf.setBounds(485, 63, 94, 20);
        
        eci.setFont(f);
        sname.setFont(f1);
        fname.setFont(f1);
        mn.setFont(f1);
        suff.setFont(f1);
        hns.setFont(f1);
        brgy.setFont(f1);
        mun.setFont(f1);
        pro.setFont(f1);
        reg.setFont(f1);
        phone.setFont(f1);
        tel.setFont(f1);
        email.setFont(f1);
        rs.setFont(f1);
        tsname.setFont(f2);
        tfname.setFont(f2);
        tmn.setFont(f2);
        thns.setFont(f2);
        tbrgy.setFont(f2);
        tmun.setFont(f2);
        tpro.setFont(f2);
        treg.setFont(f2);
        tphone.setFont(f2);
        ttel.setFont(f2);
        temail.setFont(f2);
        trs.setFont(f2);
        suf.setFont(f2);
        
        JPanel p = new JPanel();
        
        p.setLayout(null);
        p.add(eci);
        p.add(sname);
        p.add(fname);
        p.add(mn);
        p.add(suff);
        p.add(suf);
        p.add(hns);
        p.add(brgy);
        p.add(mun);
        p.add(pro);
        p.add(reg);
        p.add(phone);
        p.add(tel);
        p.add(email);
        p.add(rs);
        p.add(tsname);
        p.add(tfname);
        p.add(tmn);
        p.add(thns);
        p.add(tbrgy);
        p.add(tmun);
        p.add(tpro);
        p.add(treg);
        p.add(tphone);
        p.add(ttel);
        p.add(temail);
        p.add(trs);
        
        frame.add(p);
        frame.setVisible(true);
        frame.setSize(620, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
