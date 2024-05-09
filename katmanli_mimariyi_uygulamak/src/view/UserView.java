/**
 * @author Nida Başer
 * April 2024
 */

package view;

import business.UserController;
import entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class UserView extends JFrame {
    private JPanel container;
    private JTabbedPane tab_menu;
    private JPanel panel_user;
    private JScrollPane scroll_pane;
    private JTable table_user;
    private JButton button_user_new;
    private UserController userController;
    private DefaultTableModel model_user;
    private JPopupMenu user_popup;

    public UserView(){
        this.add(container);
        this.setTitle("User Management");
        this.setSize(500,500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()/2);
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()/2);
        this.setLocation(x,y);
        this.setVisible(true);

        this.userController = new UserController();
        //this.userController.findAll(); // Verileri alabiliyoruz
        this.model_user = new DefaultTableModel();
        // Popup nesnesi
        this.user_popup = new JPopupMenu();

        // TableModel i yukarıda tanımla

        // Sütun başlıkları oluştur
        Object[] columnUser = {"ID","Name","Type","Gender","Mail","Password"}; //Bütün class'lar object'ten türüyor ve string'de object'in bir alt class'ı yani sorun yok
        this.model_user.setColumnIdentifiers(columnUser);

        // Modele satırları aktar
        ArrayList<User> users = this.userController.findAll();
        for (User user : users) {
            Object[] row = {
                    user.getId(),
                    user.getName(),
                    user.getType(),
                    user.getGender(),
                    user.getMail(),
                    user.getPassword()
            };
            this.model_user.addRow(row);
        }

        // Modeli tabloya (işle) ata
        this.table_user.setModel(this.model_user);
        this.table_user.setEnabled(false); // Tabloya çift tıklayıp düzenlemeyi kapat
        this.table_user.getTableHeader().setReorderingAllowed(false); // Tablo satır sütunlarını genişletip daraltmayı kapat

        // Tablo işlemleri (CRUD)
        this.table_user.addMouseListener(new MouseAdapter() {
            @Override // MOUSE İLE TIKLANAN SATIRI SEÇİLİ HALE GETİRMEK
            public void mousePressed(MouseEvent e) {
                int selectedRow = table_user.rowAtPoint(e.getPoint());
                table_user.setRowSelectionInterval(selectedRow, selectedRow);
            }
        });

//        this.user_popup.add("Güncelle");
//        this.user_popup.add("Sil");

//        this.user_popup.add("Güncelle").addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
        this.user_popup.add("Güncelle").addActionListener(e -> {
            //table_user.getValueAt(table_user.getSelectedRow(), 0).toString(); // Seçili satırın ilk elemanını verir.
            int selectedId = Integer.parseInt(table_user.getValueAt(table_user.getSelectedRow(), 0).toString());
            //System.out.println(selectedId);
            User selectedUser = this.userController.getById(selectedId);
            //System.out.println(selectedUser.toString());
            EditView editView = new EditView(selectedUser);

        });

        this.user_popup.add("Sil").addActionListener(e -> {
            int selectedId = Integer.parseInt(table_user.getValueAt(table_user.getSelectedRow(), 0).toString());
            System.out.println(selectedId);
        });

        this.table_user.setComponentPopupMenu(user_popup);

        button_user_new.addActionListener(e -> {
            EditView editView = new EditView(new User());

        });
    }
}
