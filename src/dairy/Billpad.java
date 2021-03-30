/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.FontMetrics;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rawal
 */
public class Billpad extends javax.swing.JFrame implements Runnable{
int hour,minute,second;
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public Billpad() {
               initComponents();
        con=Dbs_connect.Connector2();
        info();
//        addtotal();
        CurrentDate();
        getSum1();
        CurrentTime();
        Namedrop();
        Product();
        getSum();
       Thread t=new Thread();
       t.start();
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lbl_cn2 = new javax.swing.JLabel();
        txt_name1 = new javax.swing.JTextField();
        lbl_product1 = new javax.swing.JLabel();
        lbl_quantity1 = new javax.swing.JLabel();
        txt_quantity1 = new javax.swing.JTextField();
        lbl_price1 = new javax.swing.JLabel();
        txt_price1 = new javax.swing.JTextField();
        lbl_cash1 = new javax.swing.JLabel();
        txt_cash1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lbl_cn3 = new javax.swing.JLabel();
        txt_Address1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        comb_product1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        lbl_cn = new javax.swing.JLabel();
        jcb_name = new javax.swing.JComboBox<>();
        txt_Date = new javax.swing.JTextField();
        txt_Time = new javax.swing.JTextField();
        lbl_cn1 = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        lbl_product = new javax.swing.JLabel();
        comb_product = new javax.swing.JComboBox<>();
        lbl_quantity = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        lbl_price = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        lbl_cash = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_info = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_totaldeu1 = new javax.swing.JTextField();
        txt_totalcash = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_totalAdd = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_cn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/name.png"))); // NOI18N
        lbl_cn2.setText("Name ");

        lbl_product1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/product.png"))); // NOI18N
        lbl_product1.setText("Product");

        lbl_quantity1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/quan.png"))); // NOI18N
        lbl_quantity1.setText("Quantity");

        lbl_price1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/total.png"))); // NOI18N
        lbl_price1.setText("Price");

        lbl_cash1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/cash.png"))); // NOI18N
        lbl_cash1.setText("Cash");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/insert.png"))); // NOI18N
        jButton4.setText("INSERT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbl_cn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/address.png"))); // NOI18N
        lbl_cn3.setText("Address");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/exit.png"))); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 204, 0));
        jButton6.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Billing Information");
        jButton6.setBorder(null);

        comb_product1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milk", "Yogurt", "Tofu", "Butter", "Mohi", "Others", " ", " " }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_cn2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_product1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cn3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_name1)
                                    .addComponent(comb_product1, 0, 81, Short.MAX_VALUE)
                                    .addComponent(txt_quantity1)
                                    .addComponent(txt_price1)
                                    .addComponent(txt_cash1)
                                    .addComponent(txt_Address1))
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(171, 171, 171))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cn2)
                    .addComponent(txt_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_product1)
                            .addComponent(comb_product1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_quantity1)
                            .addComponent(txt_quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_price1)
                            .addComponent(txt_price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cash1)
                            .addComponent(txt_cash1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cn3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(113, 113, 113))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Billing Information");
        jButton3.setBorder(null);

        lbl_cn.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cn.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_cn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/name.png"))); // NOI18N
        lbl_cn.setText("Name ");

        jcb_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_nameActionPerformed(evt);
            }
        });

        lbl_cn1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cn1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_cn1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/address.png"))); // NOI18N
        lbl_cn1.setText("Address");

        txt_Address.setPreferredSize(new java.awt.Dimension(9, 24));

        lbl_product.setBackground(new java.awt.Color(255, 255, 255));
        lbl_product.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_product.setForeground(new java.awt.Color(255, 255, 255));
        lbl_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/product.png"))); // NOI18N
        lbl_product.setText("Product");

        comb_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        lbl_quantity.setBackground(new java.awt.Color(255, 255, 255));
        lbl_quantity.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_quantity.setForeground(new java.awt.Color(255, 255, 255));
        lbl_quantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/quan.png"))); // NOI18N
        lbl_quantity.setText("Quantity");

        txt_rate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_rateKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rateKeyTyped(evt);
            }
        });

        lbl_price.setBackground(new java.awt.Color(255, 255, 255));
        lbl_price.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_price.setForeground(new java.awt.Color(255, 255, 255));
        lbl_price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/total.png"))); // NOI18N
        lbl_price.setText("Rate");

        txt_Total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Total.setForeground(new java.awt.Color(255, 51, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/business.png"))); // NOI18N
        jLabel2.setText("Total");

        lbl_cash.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cash.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_cash.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/cash.png"))); // NOI18N
        lbl_cash.setText("Payment");

        tab_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tab_info);

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/insert.png"))); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dairy/exit.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Deu");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Cash");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_totalcash, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_totaldeu1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_totalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_totaldeu1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_totalcash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_totalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txt_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_price, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lbl_cn1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_cn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(28, 28, 28))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Total)
                                    .addComponent(comb_product, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcb_name, 0, 154, Short.MAX_VALUE)
                                    .addComponent(txt_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_quantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_rate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_pay)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton2))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cn)
                            .addComponent(jcb_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cn1)
                            .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_product)
                            .addComponent(comb_product, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_quantity)
                            .addComponent(txt_quantity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_price)
                            .addComponent(txt_rate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cash)
                            .addComponent(txt_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(139, 139, 139))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 255));

        jMenu1.setText("New");
        jMenu1.add(jSeparator1);
        jMenu1.add(jSeparator2);

        jMenuItem1.setText("Customer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Product");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuItem2.setText("Password");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Details ");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setText("About");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Exit");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     Insert();
         
  
    
    }//GEN-LAST:event_jButton1ActionPerformed
 public void Insert(){
       try{
            String sql="insert into data (Name,Product,Quantity,Cash,Address,Due,Date) values (?,?,?,?,?,?,?)";
           pst=con.prepareStatement(sql);
           if(Check()==true){
           pst.setString(1, (String)jcb_name.getSelectedItem());     
           pst.setString(2, (String) comb_product.getSelectedItem());     
           pst.setString(3, txt_quantity.getText());
            pst.setString(4, txt_pay.getText());       
           pst.setString(5, txt_Address.getText());
           pst.setString(7, txt_Date.getText());
           
    int a=Integer.parseInt(txt_Total.getText());
    int b=Integer.parseInt(txt_pay.getText());
        int c=a-b;   
     pst.setString(6,  Integer.toString(c));           
                    pst.execute();
                       info();
                       Table tb=new Table();
                       tb.info();
                       Clear(); 
               JOptionPane.showMessageDialog(null,"Done");
               getSum();
               getSum1();
//               addtotal();
           }     
        }
        catch( Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
 }
    public void Namedrop(){
     try{
         String sql="select * from tbl_Reg";
         pst=con.prepareStatement(sql);
         rs=pst.executeQuery();
         while(rs.next()){
         jcb_name.addItem(rs.getString("Name"));
     }
         
     }
     catch(Exception e){    
     JOptionPane.showMessageDialog(null, e);
     }
 }
 public void Product(){
     try{
         String sql="select * from Product";
         pst=con.prepareStatement(sql);
         rs=pst.executeQuery();
         while(rs.next()){
         comb_product.addItem(rs.getString("Name"));
     }
         
     }
     catch(Exception e){    
     JOptionPane.showMessageDialog(null, e);
     }
 }
    public boolean Check(){
                  if(txt_quantity.getText() .trim().isEmpty())      { 
       JOptionPane.showMessageDialog(null, "Quantity cannot be empty");
     txt_quantity.grabFocus();
      return false;
     }
      if(txt_pay.getText() .trim().isEmpty())       {
       JOptionPane.showMessageDialog(null, "Cash Column cannot be empty");
            txt_pay.grabFocus();
            return false;
       }
       if(txt_Address.getText() .trim().isEmpty())       {
       JOptionPane.showMessageDialog(null, "Address cannot be empty");
   txt_Address.grabFocus();
   return false;
            }
          
      return true;
        }
    public void info(){
        try{
            String sql="select  Name,Address,Date,Product,Cash , Due from data";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tab_info.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                    }
    }
    public void Clear(){
            txt_Total.setText("");
              txt_Address.setText("");
               txt_rate.setText("");
            
               txt_quantity.setText("");
               txt_pay.setText("");          
      
   }
     public void CurrentDate(){
         GregorianCalendar c=new GregorianCalendar();
        int day=c.get(Calendar.DAY_OF_MONTH);
        int month=c.get(Calendar.MONTH);
        int year=c.get(Calendar.YEAR);
        String date = +day+"/"+(month+1)+"/"+year;
        txt_Date.setText(String.valueOf(date));
    }
     public void CurrentTime(){
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 GregorianCalendar c=new GregorianCalendar();
                 int second=c.get(Calendar.SECOND);
                 int hour=c.get(Calendar.HOUR_OF_DAY);
                 int minute=c.get(Calendar.MINUTE);
                 String time=+hour+" : "+minute+" : "+second;
                 txt_Time.setText(String.valueOf(time));
            }
        });
        t.start();
    }
public void getSum()
    {
        int sum = 0;
        for(int i = 0; i < tab_info.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(tab_info.getValueAt(i, 5).toString());
        }
        
        txt_totaldeu1.setText(Integer.toString(sum));
    }
public void getSum1()
    {
        int sum = 0;
        for(int i = 0; i < tab_info.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(tab_info.getValueAt(i, 4).toString());
        }
        
        txt_totalcash.setText(Integer.toString(sum));
    }
//public void addtotal(){
//            
//    int a=Integer.parseInt(txt_totalcash.getText());
//    int b=Integer.parseInt(txt_totaldeu1.getText());
//        int c=a+b;  
//        txt_totalAdd.setText(Integer.toString(c));
//}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed
public void Select(){
     try{
           
            String sql="Select * from tbl_Reg Where Name=?";
            pst=con.prepareStatement(sql);
            pst.setString(1, (String) jcb_name.getSelectedItem());
              ResultSet rs= pst.executeQuery();             
            if(rs.next()){
                txt_Address.setText(rs.getString("Address"));
                               }
            else{
                JOptionPane.showMessageDialog(null, "Not Found!!!!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}
    private void txt_rateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rateKeyPressed
        // TODO add your handling code here:
        
          
           int x=Integer.parseInt(txt_quantity.getText());
    int y=Integer.parseInt(txt_rate.getText());
    int z=x*y;
        txt_Total.setText(Integer.toString(z));
          txt_Total.setText(Integer.toString(z));
    }//GEN-LAST:event_txt_rateKeyPressed

    private void txt_rateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rateKeyTyped

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
new Table().setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Client_details().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new Product_det().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Change().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jcb_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_nameActionPerformed
        // TODO add your handling code here:
        Select();
    }//GEN-LAST:event_jcb_nameActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
         new about().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 MessageFormat Header=new MessageFormat("Report Print");
        MessageFormat Footer=new MessageFormat("Page {0,number,integer} ");
        try{
            tab_info.print(JTable.PrintMode.NORMAL,Header,Footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot Print %s%n",e.getMessage());
            
        }
        
                                       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billpad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comb_product;
    private javax.swing.JComboBox<String> comb_product1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jcb_name;
    private javax.swing.JLabel lbl_cash;
    private javax.swing.JLabel lbl_cash1;
    private javax.swing.JLabel lbl_cn;
    private javax.swing.JLabel lbl_cn1;
    private javax.swing.JLabel lbl_cn2;
    private javax.swing.JLabel lbl_cn3;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_price1;
    private javax.swing.JLabel lbl_product;
    private javax.swing.JLabel lbl_product1;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_quantity1;
    private javax.swing.JTable tab_info;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_Address1;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_Time;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_cash1;
    private javax.swing.JTextField txt_name1;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_price1;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_quantity1;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_totalAdd;
    private javax.swing.JTextField txt_totalcash;
    private javax.swing.JTextField txt_totaldeu1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       while(true){
           
       }
    }

         
    }
    
    

