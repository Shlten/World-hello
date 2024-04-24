
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bishal Shrestha
 */
public class internet_banking_new_account_opening extends javax.swing.JFrame {
    String title,accounttype,individuall, gender,maritial;
    String filename=null;
    byte[] image;/**
     * Creates new form internet_banking_new_account_opening
     */
    public internet_banking_new_account_opening() {
        initComponents();
                        Toolkit tk = getToolkit();
 int xsize=(int) tk.getScreenSize().getWidth();
  int ysize=(int) tk.getScreenSize().getHeight();
   this.setSize(xsize,ysize);
   this.image=null;
   show_user();

    }
    //create array list
    public ArrayList<eUser> userList(){
        ArrayList<eUser> userList=new ArrayList<>();
   try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=bankoneer_db;user=sa;password=bishal";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from internet_banking_newform_registration";
           Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query1);
      //create object for user
      eUser user;
      while(rs.next()){ 
                    //provide data in user object
          user= new eUser(rs.getInt("sno"),
                  rs.getString("branch"),rs.getString("datee"),
                  rs.getString("accounttype"),rs.getString("title"),rs.getString("name"),rs.getString("gender"),
                  rs.getString("maritial"),rs.getString("dob"),
rs.getString("father"),rs.getString("mother"),rs.getString("gfather"),rs.getString("gmother"),
                  rs.getString("hw"),rs.getString("nationality"),
                  rs.getString("paddress"),
                  rs.getString("taddress"),
                  rs.getString("occupation"),
                  rs.getString("education"),
                  rs.getString("oname"),
                  rs.getString("oaddress"),
                  rs.getString("oemail"),rs.getString("mno"),
                  rs.getString("mnoo"),
                  rs.getString("landline"),
                  rs.getString("email"),
                  rs.getString("citizenshipno"),
                  rs.getString("documentno"),
                  rs.getBytes("image"),
                  rs.getBytes("signature"),rs.getBytes("citizenshipimage"),rs.getBytes("documentimage") );
                //add user to the user list
      userList.add(user);
                  
                  }
    }
           catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            openNewAccount();
        }
   return userList;
    
      }
    //dis[lay in jtable
//use default table model
public void show_user(){
    ArrayList<eUser> list = userList();
    DefaultTableModel model = (DefaultTableModel)ebankingjtable.getModel();//typecast with default table model
        Object[] row = new Object[28];
    for(int i=0; i<list.size();i++){
        row[0]=list.get(i).getsno();
        row[1]=list.get(i).getbranch();
        row[2]=list.get(i).getdate(); 
        row[3]=list.get(i).getaccounttype();
        row[4]=list.get(i).gettitle();
        row[5]=list.get(i).getname();
        row[6]=list.get(i).getgender();
        row[7]=list.get(i).getmaritial();
        row[8]=list.get(i).getdob();
        row[9]=list.get(i).getfather();
        row[10]=list.get(i).getmother();
        row[11]=list.get(i).getgfather();
        row[12]=list.get(i).getgmother();
        row[13]=list.get(i).gethw();
        row[14]=list.get(i).getnationality();
        row[15]=list.get(i).getpaddress();
        row[16]=list.get(i).gettaddress();
        row[17]=list.get(i).getoccupation();
        row[18]=list.get(i).geteducation();
        row[19]=list.get(i).getoname();
        row[20]=list.get(i).getoaddress();
        row[21]=list.get(i).getoemail();
        row[22]=list.get(i).getmno();
        row[23]=list.get(i).getmnoo();
        row[24]=list.get(i).getlandline();
        row[25]=list.get(i).getemail();
        row[26]=list.get(i).getcitizenshipno();
        row[27]=list.get(i).getdocumentno();
        //row[28]=list.get(i).getimage();
        model.addRow(row);
        
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ebankingjtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblbranch = new javax.swing.JTextField();
        lbldate = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rsaving = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rmr = new javax.swing.JRadioButton();
        rms = new javax.swing.JRadioButton();
        rmrs = new javax.swing.JRadioButton();
        rother1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        lblname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rmale = new javax.swing.JRadioButton();
        rfemale = new javax.swing.JRadioButton();
        rother2 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        rsingle = new javax.swing.JRadioButton();
        rmarried = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        lblad = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        lblfather = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblmother = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblgfather = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        lblgmother = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lblhw = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblnationality = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lblpaddress = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lbltaddress = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        lbloccupation = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lbleducation = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        lbloname = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        lbloaddress = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        lbloemail = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblmo1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        lblmo2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        lbllandline = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        lblemail = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblcitizenship = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        lbldocument = new javax.swing.JTextField();
        lblimagess = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblacc = new javax.swing.JTextField();
        lbl_u = new javax.swing.JLabel();
        lbl_usernamee = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_password = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbl_transaction = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ebankingjtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sno", "branch", "datee", "accounttype", "title", "name", "gender", "maritial", "dob", "father", "mother", "gfather", "gmother", "hw", "nationality", "paddress", "taddress", "occupation", "education", "oname", "oaddress", "oemail", "mno", "mnoo", "landline", "email", "citizenshipno", "documentno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ebankingjtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ebankingjtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ebankingjtable);

        jLabel2.setText("Branch:");

        jLabel22.setText("Date:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ACCOUNT OPENING FORM (INDIVIDUAL)");

        jLabel5.setText("Account Type:");

        rsaving.setText("Saving");

        jLabel7.setText("Title:");

        rmr.setText("Mr.");

        rms.setText("Ms.");

        rmrs.setText("Mrs.");

        rother1.setText("Other");

        jLabel8.setText("Full Name:");

        lblname.setEditable(false);

        jLabel9.setText("Gender:");

        rmale.setText("Male");

        rfemale.setText("Female");

        rother2.setText("Other");

        jLabel24.setText("Maritial:");

        rsingle.setText("Single");

        rmarried.setText("Married");

        jLabel12.setText("D.O.B.(A.D.)");

        jLabel13.setText("Father's Name:");

        lblfather.setEditable(false);

        jLabel14.setText("Mother's Name:");

        lblmother.setEditable(false);

        jLabel15.setText("Grand Father's Name:");

        lblgfather.setEditable(false);

        jLabel16.setText("Grand Mother's Name:");

        lblgmother.setEditable(false);

        jLabel17.setText("Spouse's Name:");

        lblhw.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Address Particulars:");

        jLabel10.setText("Nationality:");

        lblnationality.setEditable(false);

        jLabel19.setText("Permanent Address:");

        lblpaddress.setEditable(false);

        jLabel21.setText("Temporary Address:");

        lbltaddress.setEditable(false);

        jLabel25.setText("Occupation:");

        lbloccupation.setEditable(false);

        jLabel41.setText("Education:");

        lbleducation.setEditable(false);

        jLabel27.setText("Office Name:");

        lbloname.setEditable(false);
        lbloname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblonameActionPerformed(evt);
            }
        });

        jLabel28.setText("Address:");

        lbloaddress.setEditable(false);

        jLabel29.setText("Email:");

        lbloemail.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Contact Information:");

        jLabel31.setText("Mobile No. 1");

        lblmo1.setEditable(false);

        jLabel32.setText("Office Number:");

        lblmo2.setEditable(false);

        jLabel33.setText("Landline:");

        lbllandline.setEditable(false);

        jLabel34.setText("Email:");

        lblemail.setEditable(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Identification Document:");

        jLabel11.setText("Citizenship No.");

        lblcitizenship.setEditable(false);

        jLabel36.setText("Other Documents:");

        lbldocument.setEditable(false);

        lblimagess.setText("jLabel3");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Account Number:");

        lbl_u.setText("Username:");

        jLabel4.setText("Password:");

        jLabel6.setText("Transaction Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(rsaving)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rmr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rms)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rmrs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rother1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblfather, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmother, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblgfather, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblgmother)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblhw, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(379, 379, 379)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rmale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rfemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rother2)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rsingle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rmarried)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblnationality, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblpaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmo2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbllandline, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblemail)))
                .addGap(363, 363, 363))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel41)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbloccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(lbleducation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbloname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbloaddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbloemail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblacc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldocument, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_u)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_usernamee, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimagess, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(rsaving)
                        .addComponent(jLabel8)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(rmr)
                        .addComponent(rms)
                        .addComponent(rmrs)
                        .addComponent(rother1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(rmale)
                        .addComponent(rfemale)
                        .addComponent(rother2)
                        .addComponent(jLabel24)
                        .addComponent(rsingle)
                        .addComponent(rmarried)
                        .addComponent(jLabel12))
                    .addComponent(lblad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lblfather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(lblmother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(lblgfather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(lblgmother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(lblhw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(lblpaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(lbltaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lbloccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbleducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(lbloname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(lbloaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(lbloemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lblmo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(lblmo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(lbllandline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblcitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36)
                                .addComponent(lbldocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblimagess, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(lblacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_u)
                    .addComponent(lbl_usernamee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ebankingjtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebankingjtableMouseClicked
int i = ebankingjtable.getSelectedRow();
        TableModel model= ebankingjtable.getModel();
        byte[] image =(userList().get(i).getimage());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(lblimagess.getWidth(),lblimagess.getHeight(),Image.SCALE_SMOOTH));
        lblimagess.setIcon(imageIcon);
//getvalues at of what to be 
        lblbranch.setText(model.getValueAt(i,1).toString());
               try{
                Date date= new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i,2));
        lbldate.setDate(date);
        }
                catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
            }
        String accounttype=model.getValueAt(i,3).toString();
       // if(accounttype("saving")){
            rsaving.setSelected(true);
       // }
       lblname.setText(model.getValueAt(i,5).toString());
       String title =model.getValueAt(i,4).toString();
        if(title.equals("mr")){
            rmr.setSelected(true);
            rms.setSelected(false);
            rmrs.setSelected(false);
        }
                if(title.equals("mrs")){
            rmrs.setSelected(true);
             rms.setSelected(false);
            rmr.setSelected(false);
        }
                        if(title.equals("ms")){
            rms.setSelected(true);
            rmrs.setSelected(false);
            rmr.setSelected(false);
        }
                        String gender=model.getValueAt(i,6).toString();
        if(gender.equals("male")){
            rmale.setSelected(true);
            rfemale.setSelected(false);
        }
                if(gender.equals("female")){
            rfemale.setSelected(true);
            rmale.setSelected(false);
        }
                        if(gender.equals("other")){
            rother2.setSelected(true);
        }
                        String maritial=model.getValueAt(i,7).toString();
        if(maritial.equals("single")){
            rsingle.setSelected(true);
            rmarried.setSelected(false);
        }
                if(maritial.equals("married")){
            rmarried.setSelected(true);
             rsingle.setSelected(false);
        }
                try{
                Date datee= new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i,8));
        lblad.setDate(datee);
        }
                catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
            }
        lblfather.setText(model.getValueAt(i,9).toString());
        lblmother.setText(model.getValueAt(i,10).toString());
        lblgfather.setText(model.getValueAt(i,11).toString());
        lblgmother.setText(model.getValueAt(i,12).toString());
        lblhw.setText(model.getValueAt(i,13).toString()); 
        lblnationality.setText(model.getValueAt(i,14).toString());   
        lblpaddress.setText(model.getValueAt(i,15).toString());
        lbltaddress.setText(model.getValueAt(i,16).toString());
        lbloccupation.setText(model.getValueAt(i,17).toString());
        lbleducation.setText(model.getValueAt(i,18).toString());
        lbloname.setText(model.getValueAt(i,19).toString());
        lbloaddress.setText(model.getValueAt(i,20).toString());
        lbloemail.setText(model.getValueAt(i,21).toString());
        lblmo1.setText(model.getValueAt(i,22).toString());
        lblmo2.setText(model.getValueAt(i,23).toString());
        lbllandline.setText(model.getValueAt(i,24).toString());
        lblemail.setText(model.getValueAt(i,25).toString());
        lblcitizenship.setText(model.getValueAt(i,26).toString());
        lbldocument.setText(model.getValueAt(i,27).toString());
        
        
        
    }//GEN-LAST:event_ebankingjtableMouseClicked

    private void lblonameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblonameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblonameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=bankoneer_db;user=sa;password=bishal";
            Connection con = DriverManager.getConnection(url);
            String queryy="SELECT * FROM newmemberregistration WHERE accountnumber=? OR username=?";
            PreparedStatement ast=con.prepareStatement(queryy);
            ast.setString(1,lblacc.getText()); 
            ast.setString(2,lbl_usernamee.getText());              
            ResultSet rs=ast.executeQuery();
                       if(rs.next()){
                                   JOptionPane.showMessageDialog(null,"Credintials Matched. Please Review!!!");
            } 
            else{
            String query="insert into newmemberregistration(branch,date,accountype,individual,accountnumber,title,name,gender,maritial,dob,father,mother,gfather,gmother,hw,nationality,paddress,taddress,occupation,education,oname,oaddress,oemail,mno,mnoo,landline,email,citizenship,documentno,username,password,transaction_password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, lblbranch.getText());
   SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
    String date=sdf.format(lbldate.getDate());
    pst.setString(2,date);
    if(rsaving.isSelected()){
                accounttype= "Saving";
            }
    
    pst.setString(3, accounttype);
    individuall="Individual";
    pst.setString(4,individuall);
    pst.setString(5, lblacc.getText());
    if(rmr.isSelected()){
                title="Mr";
            }

            if(rms.isSelected()){
                title="Ms";
            }
                        if(rmrs.isSelected()){
                title="Mrs";
            }
            if(rother1.isSelected()){
                title= "Other";
            }            
             pst.setString(6, title);   
             pst.setString(7, lblname.getText());
             if(rmale.isSelected()){
                gender="Male";
            }
            if(rfemale.isSelected()){
                gender="Female";
            }
            if(rother2.isSelected()){
                gender="Other";
            }
            pst.setString(8, gender);
            if(rsingle.isSelected()){
                maritial="Single";
                             
            }
            if(rmarried.isSelected()){
                maritial="Married";
            }
            pst.setString(9, maritial);
            SimpleDateFormat sdfa= new SimpleDateFormat("yyyy-MM-dd");
            String date2=sdfa.format(lblad.getDate());
  pst.setString(10,date2);
        pst.setString(11, lblfather.getText());
            pst.setString(12, lblmother.getText());
            pst.setString(13, lblgfather.getText());
            pst.setString(14, lblgmother.getText());
            pst.setString(15, lblhw.getText());   
            pst.setString(16, lblnationality.getText());
             pst.setString(17, lblpaddress.getText());
            pst.setString(18, lbltaddress.getText());       
             pst.setString(19, lbloccupation.getText());
            pst.setString(20, lbleducation.getText());
             pst.setString(21, lbloname.getText());
            pst.setString(22, lbloaddress.getText());
             pst.setString(23, lbloemail.getText());
            pst.setString(24, lblmo1.getText());
             pst.setString(25, lblmo2.getText());
            pst.setString(26, lbllandline.getText());
            pst.setString(27, lblemail.getText());
            pst.setString(28, lblcitizenship.getText());
            pst.setString(29, lbldocument.getText()); 
            pst.setString(30, lbl_usernamee.getText()); 
            pst.setString(31, lbl_password.getText()); 
            pst.setString(32, lbl_transaction.getText()); 


        private void openNewAccount() {
            String accountType = jComboBox1.getSelectedItem().toString();
            String customerName = jTextField1.getText();
            String initialDeposit = jTextField2.getText();
            
           // pst.setBytes(30, person_image);
           //// pst.setBytes(31, person_signature);
            //pst.setBytes(32, citizenship_image);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            String quer="insert into customer_account(account_no,type,total_balance,name,username,datee,wallet_balance) values (?,?,?,?,?,?,?)";
            PreparedStatement psta= con.prepareStatement(quer);
            psta.setString(1,lblacc.getText());
            psta.setString(2,"Daily Saving");
            psta.setString(3,"0");
            psta.setString(4,lblname.getText());
            psta.setString(5,lbl_usernamee.getText());
            SimpleDateFormat sdfaa= new SimpleDateFormat("yyyy-MM-dd");
            String datee=sdfaa.format(lbldate.getDate());
            psta.setString(6,datee);
            psta.setString(7,"0");
            psta.executeUpdate();
            
            //delete query
                int row= ebankingjtable.getSelectedRow();
           String value=(ebankingjtable.getModel().getValueAt(row, 0).toString());
           String query1 = "DELETE from internet_banking_newform_registration where sno="+value;
           PreparedStatement st = con.prepareStatement(query1);
           st.executeUpdate();
      DefaultTableModel model=(DefaultTableModel)ebankingjtable.getModel();
      model.setRowCount(0);
      show_user();       
            
            
      //clear all the text fields      
lblbranch.setText("");
 lbldate.setDate(null);
               //  buttonGroup1.clearSelection();
                // buttonGroup2.clearSelection();
                // buttonGroup3.clearSelection();    
                // lblacc.setText("");
lblname.setText("");
lblad.setDate(null);
lblfather.setText("");
 lblmother.setText("");
lblgfather.setText("");
lblgmother.setText("");
lblhw.setText("");
lblnationality.setText("");
lblpaddress.setText("");
lbltaddress.setText("");
lbloccupation.setText("");
lbleducation.setText("");
lbloname.setText("");
lbloaddress.setText("");
lbloemail.setText("");
lblmo1.setText("");
lblmo2.setText("");
lbllandline.setText("");
lblemail.setText("");
lblcitizenship.setText("");
lbldocument.setText("");
lblacc.setText("");
lbl_usernamee.setText("");
lbl_password.setText("");
lbl_transaction.setText("");
//lblpassport.setText("");
//imageapplicant.setText("");
//imagesignature.setText("");
//imagecitizenship.setText("");
//customer account opening with 0 balance at first

            if (validateInput(accountType, customerName, initialDeposit)) {
                // Perform account opening logic
                // Example: createAccount(accountType, customerName, initialDeposit);
            } else {
                // Display error message to the user
                JOptionPane.showMessageDialog(this, "Invalid input. Please check the fields.");
            }
       }
      catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(internet_banking_new_account_opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(internet_banking_new_account_opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(internet_banking_new_account_opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(internet_banking_new_account_opening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new internet_banking_new_account_opening().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ebankingjtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbl_password;
    private javax.swing.JTextField lbl_transaction;
    private javax.swing.JLabel lbl_u;
    private javax.swing.JTextField lbl_usernamee;
    private javax.swing.JTextField lblacc;
    private com.toedter.calendar.JDateChooser lblad;
    private javax.swing.JTextField lblbranch;
    private javax.swing.JTextField lblcitizenship;
    private com.toedter.calendar.JDateChooser lbldate;
    private javax.swing.JTextField lbldocument;
    private javax.swing.JTextField lbleducation;
    private javax.swing.JTextField lblemail;
    private javax.swing.JTextField lblfather;
    private javax.swing.JTextField lblgfather;
    private javax.swing.JTextField lblgmother;
    private javax.swing.JTextField lblhw;
    private javax.swing.JLabel lblimagess;
    private javax.swing.JTextField lbllandline;
    private javax.swing.JTextField lblmo1;
    private javax.swing.JTextField lblmo2;
    private javax.swing.JTextField lblmother;
    private javax.swing.JTextField lblname;
    private javax.swing.JTextField lblnationality;
    private javax.swing.JTextField lbloaddress;
    private javax.swing.JTextField lbloccupation;
    private javax.swing.JTextField lbloemail;
    private javax.swing.JTextField lbloname;
    private javax.swing.JTextField lblpaddress;
    private javax.swing.JTextField lbltaddress;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    private javax.swing.JRadioButton rmarried;
    private javax.swing.JRadioButton rmr;
    private javax.swing.JRadioButton rmrs;
    private javax.swing.JRadioButton rms;
    private javax.swing.JRadioButton rother1;
    private javax.swing.JRadioButton rother2;
    private javax.swing.JRadioButton rsaving;
    private javax.swing.JRadioButton rsingle;
    // End of variables declaration//GEN-END:variables
}
        private boolean validateInput(String accountType, String customerName, String initialDeposit) {
            // Add validation logic here
            return !accountType.isEmpty() && !customerName.isEmpty() && !initialDeposit.isEmpty();
        }
