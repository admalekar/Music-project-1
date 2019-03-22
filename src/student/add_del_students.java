package student;

import java.awt.HeadlessException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admalekar
 */
public class add_del_students extends javax.swing.JFrame {

    Connection newcon = null;
    Connection newcon2 = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;

    public add_del_students() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Batch_tab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        AddStudentButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Name_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Contact_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Parent_name_text = new javax.swing.JTextField();
        Parent_contact_text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Mother_tongue_text = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Address_text = new javax.swing.JTextField();
        Exam_level_drop_down = new javax.swing.JComboBox<>();
        DOBChooser = new datechooser.beans.DateChooserCombo();
        StartChooser = new datechooser.beans.DateChooserCombo();
        jLabel12 = new javax.swing.JLabel();
        Batch_text = new javax.swing.JTextField();
        UpdateStudent_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Enter_id_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Search_table = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        java.util.Date date = new java.util.Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        BatchStartTimeDay1 = new javax.swing.JSpinner(sm);
        java.util.Date date1 = new java.util.Date();
        SpinnerDateModel sm1 =
        new SpinnerDateModel(date1, null, null, Calendar.HOUR_OF_DAY);
        BatchStartTimeDay2 = new javax.swing.JSpinner(sm1);
        batch_day = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        Day1_text = new javax.swing.JTextField();
        Day2_text = new javax.swing.JTextField();
        Start_1_time = new javax.swing.JTextField();
        End_1_time = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Start_2_time = new javax.swing.JTextField();
        End_2_time = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        student_id_text = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Teacher_name = new javax.swing.JTextField();
        day1_radio = new javax.swing.JRadioButton();
        day2_radio = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        prof_name = new javax.swing.JTextField();
        Day_text = new javax.swing.JTextField();
        ShowStudent_text = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Attendance_table = new javax.swing.JTable();
        Submit_Attendance_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddStudentButton.setText("Add Student");
        AddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Date of Birth");

        jLabel5.setText("Contact");

        jLabel6.setText("Parent Name");

        jLabel7.setText("Parent Contact");

        jLabel8.setText("Start Date");

        jLabel9.setText("Mother tongue");

        jLabel10.setText("Exam level");

        jLabel11.setText("Address");

        Exam_level_drop_down.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Exam_level_drop_down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exam_level_drop_downActionPerformed(evt);
            }
        });

        jLabel12.setText("Batch");

        UpdateStudent_button.setText("Update Student");
        UpdateStudent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudent_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateStudent_button)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Address_text, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel5))
                                        .addGap(12, 12, 12)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                        .addComponent(StartChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Contact_text, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Parent_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Parent_contact_text, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Batch_text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(Mother_tongue_text, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Exam_level_drop_down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8))
                    .addComponent(StartChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Mother_tongue_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(Batch_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Exam_level_drop_down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Contact_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Parent_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Parent_contact_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Address_text))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStudentButton)
                    .addComponent(UpdateStudent_button))
                .addGap(24, 24, 24))
        );

        Batch_tab.addTab("Add Student", jPanel2);

        jLabel4.setText("Type:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(600, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        Batch_tab.addTab("Add Student to Batch", jPanel4);

        Enter_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_id_fieldActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Enter ID");

        Search_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "DOB", "Batch", "Start Date", "Contact", "Exam level"
            }
        ));
        jScrollPane3.setViewportView(Search_table);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enter_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Enter_id_field))
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(275, Short.MAX_VALUE)))
        );

        Batch_tab.addTab("Search", jPanel5);

        jLabel3.setText("Type:");

        jButton2.setText("Add Student to Batch");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Show All Current Batchs");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setText("Day 1");

        jLabel18.setText("Day2");

        JSpinner.DateEditor de = new JSpinner.DateEditor(BatchStartTimeDay1, "HH:mm");
        BatchStartTimeDay1.setEditor(de);

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(BatchStartTimeDay2, "HH:mm");
        BatchStartTimeDay2.setEditor(de1);

        batch_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guitar", "Drums", "Violin", "Piano" }));
        batch_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batch_dayActionPerformed(evt);
            }
        });

        jButton4.setText("Get Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Start");

        jLabel16.setText("End");

        jLabel19.setText("Start");

        jLabel20.setText("End");

        jLabel21.setText("Student ID:");

        jLabel22.setText("Teacher");

        Teacher_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teacher_nameActionPerformed(evt);
            }
        });

        buttonGroup1.add(day1_radio);
        day1_radio.setText("Day 1");

        buttonGroup1.add(day2_radio);
        day2_radio.setText("Day 2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(student_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Teacher_name, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(End_1_time)
                                    .addComponent(Start_1_time)
                                    .addComponent(Day1_text))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(Day2_text, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel19))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(End_2_time, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Start_2_time, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(day1_radio)
                                        .addGap(38, 38, 38)
                                        .addComponent(day2_radio)))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)
                                        .addComponent(batch_day, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton4))
                                .addGap(91, 91, 91)
                                .addComponent(BatchStartTimeDay1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BatchStartTimeDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(batch_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BatchStartTimeDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(Teacher_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BatchStartTimeDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Day1_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(Day2_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Start_1_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(End_1_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Start_2_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(End_2_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(student_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day1_radio)
                    .addComponent(day2_radio))
                .addGap(79, 79, 79)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(37, 37, 37))
        );

        Batch_tab.addTab("Batch Details", jPanel3);

        jLabel23.setText("Proffesor");

        jLabel24.setText("Day");

        ShowStudent_text.setText("Show Students");
        ShowStudent_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowStudent_textActionPerformed(evt);
            }
        });

        Attendance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Present"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Attendance_table);
        if (Attendance_table.getColumnModel().getColumnCount() > 0) {
            Attendance_table.getColumnModel().getColumn(1).setResizable(false);
        }

        Submit_Attendance_button.setText("Submit");
        Submit_Attendance_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_Attendance_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(ShowStudent_text))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prof_name)
                                    .addComponent(Day_text, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Submit_Attendance_button)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(prof_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Day_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(ShowStudent_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Submit_Attendance_button)
                .addGap(18, 18, 18))
        );

        Batch_tab.addTab("Attendance", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Batch_tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Batch_tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO student_details"
                    + "(Name, Date_of_birth, Batch, Start_date, Contact, Parent_name, Parent_contact, Mother_tongue, Address, Exam_level)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");
            pst = newcon.prepareStatement(sql);

            pst.setString(1, Name_text.getText());
            pst.setString(2, DOBChooser.getText());
            pst.setString(3, Batch_text.getText());
            pst.setString(4, StartChooser.getText());
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //  String date1 = sdf.format(DOBChooser.getText());

            pst.setString(5, Contact_text.getText());
            pst.setString(6, Parent_name_text.getText());
            pst.setString(7, Parent_contact_text.getText());
            //  String date2 = sdf.format(StartChooser.getSelectedDate());

            pst.setString(8, Mother_tongue_text.getText());

            pst.setString(9, Address_text.getText());
            pst.setInt(10, (Exam_level_drop_down.getSelectedIndex() + 1));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_AddStudentButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "select Name, Date_of_birth, Batch, Start_date, Contact, Exam_level from student_details where student_id = ?";

            newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");

            pst2 = newcon.prepareStatement(sql);
            pst2.setString(1, Enter_id_field.getText());

            String[] student_search_array = new String[6];
            rs1 = pst2.executeQuery();
            ArrayList<String> student_search = new ArrayList<String>();
            if (rs1.next()) {

                student_search_array[0] = rs1.getString("Name");
                student_search_array[1] = rs1.getString("Date_of_birth");
                student_search_array[2] = rs1.getString("Batch");
                student_search_array[3] = rs1.getString("Start_date");
                student_search_array[4] = rs1.getString("Contact");
                student_search_array[5] = rs1.getString("Exam_level");

                System.out.println(rs1.getString("Name"));
                System.out.println(rs1.getString("Date_of_birth"));
                System.out.println(rs1.getString("Batch"));
                System.out.println(rs1.getString("Start_date"));
                System.out.println(rs1.getString("Contact"));
                System.out.println(rs1.getString("Exam_level"));

            }

            //student_search.add(rs.getString("Name"));
            DefaultTableModel model = (DefaultTableModel) Search_table.getModel();
            model.removeRow(0);
            Object[] row = new Object[6];
            row[0] = student_search_array[0];
            row[1] = student_search_array[1];
            row[2] = student_search_array[2];
            row[3] = student_search_array[3];
            row[4] = student_search_array[4];
            row[5] = student_search_array[5];
            model.addRow(row);

        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void Enter_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_id_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Enter_id_fieldActionPerformed

    private void batch_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batch_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batch_dayActionPerformed

    private void Exam_level_drop_downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exam_level_drop_downActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Exam_level_drop_downActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int teacherId = 0;
        try {

            String query = "select * from batch1 where batch_student_id = ?";
            newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");
            PreparedStatement st = newcon.prepareStatement(query);
            st.setString(1, student_id_text.getText());
            ResultSet rs = st.executeQuery();

            System.out.println("after teacher");
            if (rs.next()) {
                System.out.println(" here");
                System.out.println("Already exists");
            } else if (day1_radio.isSelected()) {

                System.out.println("hello else if");

                String query1 = "select teacher_id from teacher_type_table where teacher_name = ?";

                PreparedStatement st5 = newcon.prepareStatement(query1);

                st5.setString(1, Teacher_name.getText());
                ResultSet rs5 = st5.executeQuery();
                rs5.next();
                teacherId = rs5.getInt("teacher_id");
                System.out.println(teacherId);

                String query2 = "insert into batch1 (batch_student_id, batch_teacher_id,batch_no) values (?,?,1)";
                newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");
                PreparedStatement st2 = newcon.prepareStatement(query2);
                st2.setInt(1, Integer.parseInt(student_id_text.getText()));
                st2.setInt(2, teacherId);

                int rs2 = st2.executeUpdate();

                System.out.println("inserted");
                JOptionPane.showMessageDialog(null, "inserted successfully");
            } else {
                System.out.println("hello else");

                System.out.println("Here in insert");
                String query1 = "select teacher_id from teacher_type_table where teacher_name = ?";

                PreparedStatement st5 = newcon.prepareStatement(query1);

                st5.setString(1, Teacher_name.getText());
                ResultSet rs5 = st5.executeQuery();
                rs5.next();
                rs5.next();
                teacherId = rs5.getInt("teacher_id");
                System.out.println(teacherId);
                String query2 = "insert into batch1 (batch_student_id, batch_teacher_id,batch_no) values (?,?,2)";
                newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");
                PreparedStatement st2 = newcon.prepareStatement(query2);
                st2.setInt(1, Integer.parseInt(student_id_text.getText()));
                st2.setInt(2, teacherId);
                int rs2 = st2.executeUpdate();
                System.out.println("inserted day 2");
                JOptionPane.showMessageDialog(null, "inserted successfully");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private int getTeacherID() {
        try {

            String query1 = "select teacher_id from teacher_type_table where teacher_name = ?";

            newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");
            PreparedStatement st2 = newcon.prepareStatement(query1);
            System.out.println(Teacher_name.getText().length());
            st2.setString(1, Teacher_name.getText());
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {

                int teacherId = rs1.getInt("teacher_id");
            }

        } catch (Exception e) {
        }
        return 0;
    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "select teacher_name from teacher_type_table where teacher_instrument = ?";
            String sql2 = "select Day, Day_start,Day_end from teacher_type_table where teacher_instrument = ?";

            newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");

            pst3 = newcon.prepareStatement(sql);
            pst4 = newcon.prepareStatement(sql2);

            pst3.setString(1, batch_day.getSelectedItem().toString());
            pst4.setString(1, batch_day.getSelectedItem().toString());

            rs2 = pst3.executeQuery();
            rs3 = pst4.executeQuery();
            System.out.println(rs2);
            System.out.println(rs3);

            if (rs2.next()) {
                System.out.println(rs2);
                String a = rs2.getObject(1).toString();
                System.out.println(a);
                Teacher_name.setText(a);
            }
            if (rs3.next()) {
                System.out.println(rs3);
                String b = rs3.getObject(1).toString();
                Day1_text.setText(b);
                String c = rs3.getObject(2).toString();
                Start_1_time.setText(c);
                String c1 = rs3.getObject(3).toString();
                End_1_time.setText(c1);
                //System.out.println(b);
                //System.out.println(C);
                rs3.next();
                String d = rs3.getObject(1).toString();
                Day2_text.setText(d);
                String e = rs3.getObject(2).toString();
                Start_2_time.setText(e);
                String e1 = rs3.getObject(3).toString();
                End_2_time.setText(e1);
                //System.out.println(d);
                //System.out.println(e);

            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void Teacher_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teacher_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Teacher_nameActionPerformed

    private void UpdateStudent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudent_buttonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        JButton btn = new JButton("UpdateStudent_button");
        frame.getRootPane().setDefaultButton(btn);

        UpdateStudent us = new UpdateStudent();
        us.setVisible(true);


    }//GEN-LAST:event_UpdateStudent_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton3ActionPerformed

    public int Student_id(String name) {
        try {
            String sql = "Select student_id from student_details where Name = '" + name + "'";
            newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");
            Statement s = newcon.createStatement();
            System.out.println(sql);

            ResultSet rs7 = s.executeQuery(sql);
            rs7.next();
            int Id = rs7.getInt("student_id");
            return Id;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }


    private void ShowStudent_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowStudent_textActionPerformed
        int Id = 0;
        try {

            String query1 = "select teacher_id from teacher_type_table where teacher_name = ?";
            newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");

            PreparedStatement st5 = newcon.prepareStatement(query1);

            st5.setString(1, prof_name.getText());
            ResultSet rs5 = st5.executeQuery();
            rs5.next();
            Id = rs5.getInt("teacher_id");

            String sql = "Select Name from student_details a ,batch1 b where a.student_id = b.batch_student_id and b.batch_no = " + Day_text.getText() + " and b.batch_teacher_id = " + Id + "";

            Statement s = newcon.createStatement();
            System.out.println(sql);

            ResultSet rs7 = s.executeQuery(sql);

            if (!rs7.next()) {
                Id = Id + 4;
                sql = "Select Name from student_details a ,batch1 b where a.student_id = b.batch_student_id and b.batch_no = " + Day_text.getText() + " and b.batch_teacher_id = " + Id + "";

                s = newcon.createStatement();
                System.out.println(sql);

                rs7 = s.executeQuery(sql);
            } else {
                rs7.beforeFirst();
            }
            String[] studentListArray = new String[10];
            ArrayList<String> studentList = new ArrayList<String>();
            System.out.println("hello");
            DefaultTableModel model = (DefaultTableModel) Attendance_table.getModel();
            while (rs7.next()) {
                System.out.println(rs7);
                studentListArray[0] = rs7.getString("Name");

                Object[] row = new Object[2];
                System.out.println("hey");
                row[0] = studentListArray[0];

                model.addRow(row);
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_ShowStudent_textActionPerformed

    private void Submit_Attendance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_Attendance_buttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Attendance_table.getModel();
        int rowcount = model.getRowCount();
        System.out.println(rowcount);

        for (int i = 0; i < rowcount; i++) {
            try {
                Object present = model.getValueAt(i, 1);
                String name = (model.getValueAt(i, 0)).toString();
                System.out.println(name);
                int id = Student_id(name);
                System.out.println(present);
                String sql = "insert into attendance(Student_id, lesson_date, present) values(" + id + ",curdate()," + 1 + ")";

                newcon = DriverManager.getConnection("jdbc:mysql://localhost/music", "root", "");

                pst3 = newcon.prepareStatement(sql);
                pst3.execute();
                JOptionPane.showMessageDialog(null,"Attendance taken");
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Attendance NOT taken");
            }
        }


    }//GEN-LAST:event_Submit_Attendance_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(add_del_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_del_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_del_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_del_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_del_students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudentButton;
    private javax.swing.JTextField Address_text;
    private javax.swing.JTable Attendance_table;
    private javax.swing.JSpinner BatchStartTimeDay1;
    private javax.swing.JSpinner BatchStartTimeDay2;
    private javax.swing.JTabbedPane Batch_tab;
    private javax.swing.JTextField Batch_text;
    private javax.swing.JTextField Contact_text;
    private datechooser.beans.DateChooserCombo DOBChooser;
    private javax.swing.JTextField Day1_text;
    private javax.swing.JTextField Day2_text;
    private javax.swing.JTextField Day_text;
    private javax.swing.JTextField End_1_time;
    private javax.swing.JTextField End_2_time;
    private javax.swing.JTextField Enter_id_field;
    private javax.swing.JComboBox<String> Exam_level_drop_down;
    private javax.swing.JTextField Mother_tongue_text;
    private javax.swing.JTextField Name_text;
    private javax.swing.JTextField Parent_contact_text;
    private javax.swing.JTextField Parent_name_text;
    private javax.swing.JTable Search_table;
    private javax.swing.JButton ShowStudent_text;
    private datechooser.beans.DateChooserCombo StartChooser;
    private javax.swing.JTextField Start_1_time;
    private javax.swing.JTextField Start_2_time;
    private javax.swing.JButton Submit_Attendance_button;
    private javax.swing.JTextField Teacher_name;
    private javax.swing.JButton UpdateStudent_button;
    private javax.swing.JComboBox<String> batch_day;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton day1_radio;
    private javax.swing.JRadioButton day2_radio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField prof_name;
    private javax.swing.JTextField student_id_text;
    // End of variables declaration//GEN-END:variables
}
