/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visão;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IMMilengo
 */
public class EmparelharSalasDisciplinas extends javax.swing.JFrame {

    /**
     * Creates new form EmparelharSalasDisciplinas
     */
    public EmparelharSalasDisciplinas() {
        initComponents();
        actualizar();
         try {
             int g=0;
           // BufferedReader lersala=new BufferedReader(new FileReader("CadastroTurmas.txt"));
           //  BufferedReader lerdisciplina=new BufferedReader(new FileReader("CadastroDisciplina.txt"));
              BufferedReader leralunos=new BufferedReader(new FileReader("CadastroAlunos.txt"));
              String combo=Cano.getSelectedItem().toString();
                if(combo.equalsIgnoreCase("Geral")){
                String linha2;
                while((linha2=leralunos.readLine())!=null){
                g++;
                }
            tot.setText(String.valueOf(g));
            }
            String linhas,linhad,linhaa;
            while((linhaa=leralunos.readLine())!=null){
            String dividir[]=linhaa.split(";");
            System.out.println(dividir[4]);
            //////////////////
          if(dividir[4].equalsIgnoreCase("1º")){y1++;
             tot.setText(String.valueOf(y1));
             }else if(dividir[4].equalsIgnoreCase("2º")){y2++;
              tot.setText(String.valueOf(y2));
            }else if(dividir[4].equalsIgnoreCase("3º")){y3++;
             tot.setText(String.valueOf(y3));
           }else if(dividir[4].equalsIgnoreCase("4º")){y4++;
            tot.setText(String.valueOf(y4));
           }else if(dividir[4].equalsIgnoreCase("5º")){y5++;
            tot.setText(String.valueOf(y5));
            }
            ////////////////
            
            
            
            }
            // lersala.close();
            // lerdisciplina.close();
            leralunos.close();
            
        } catch (Exception e) {
        }

      
    }
    public void chamar(){
      try {
             int g=0;
           // BufferedReader lersala=new BufferedReader(new FileReader("CadastroTurmas.txt"));
           //  BufferedReader lerdisciplina=new BufferedReader(new FileReader("CadastroDisciplina.txt"));
              BufferedReader leralunos=new BufferedReader(new FileReader("CadastroAlunos.txt"));
              String combo=Cano.getSelectedItem().toString();
                if(combo.equalsIgnoreCase("Geral")){
                String linha2;
                while((linha2=leralunos.readLine())!=null){
                g++;
                }
            tot.setText(String.valueOf(g));
            }
            String linhas,linhad,linhaa;
            while((linhaa=leralunos.readLine())!=null){
            String dividir[]=linhaa.split(";");
            System.out.println(dividir[4]);
            //////////////////
          if(dividir[4].equalsIgnoreCase("1º")){y1++;
             tot.setText(String.valueOf(y1));
             }else if(dividir[4].equalsIgnoreCase("2º")){y2++;
              tot.setText(String.valueOf(y2));
            }else if(dividir[4].equalsIgnoreCase("3º")){y3++;
             tot.setText(String.valueOf(y3));
           }else if(dividir[4].equalsIgnoreCase("4º")){y4++;
            tot.setText(String.valueOf(y4));
           }else if(dividir[4].equalsIgnoreCase("5º")){y5++;
            tot.setText(String.valueOf(y5));
            }
            ////////////////
            
            
            
            }
            // lersala.close();
            // lerdisciplina.close();
            leralunos.close();
            
        } catch (Exception e) {
        }

    }
int y1=0,y2=0,y3=0,y4=0,y5=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
       public void actualizar(){
     String cabecalho[] = {"Nº Matricula","Nome","Ano de Inscirção"};
                DefaultTableModel modeloTabela = new DefaultTableModel(cabecalho, 0);
                   Tabela.setModel(modeloTabela);
            }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cano = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emparelhar Salas e Disciplinas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Alocação Dinâmica das Salas");

        jButton1.setText("Realizar Alocação");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Listar Alunos");

        Cano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher Ano", "Geral", "1º Ano", "2º Ano", "3º Ano", "4º Ano", "5º Ano" }));
        Cano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanoActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabela);

        jLabel3.setText("          Total de Alunos");

        tot.setEnabled(false);
        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cano, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
           // BufferedReader lersala=new BufferedReader(new FileReader("CadastroTurmas.txt"));
           //  BufferedReader lerdisciplina=new BufferedReader(new FileReader("CadastroDisciplina.txt"));
              BufferedReader leralunos=new BufferedReader(new FileReader("CadastroAlunos.txt"));
            
            String linhas,linhad,linhaa;
            while((linhaa=leralunos.readLine())!=null){
            String dividir[]=linhaa.split(";");
            //////////////////
            if(dividir[4].equalsIgnoreCase("1º")){//y1++;
            BufferedWriter escreve1=new BufferedWriter(new FileWriter("1ºano",true));
            escreve1.write(dividir[0]+";"+dividir[1]+";"+dividir[4]+";\n");
            escreve1.close();
            }else if(dividir[4].equalsIgnoreCase("2º")){//y2++;
            BufferedWriter escreve2=new BufferedWriter(new FileWriter("2ºano",true));
            escreve2.write(dividir[0]+";"+dividir[1]+";"+dividir[4]+";\n");
            escreve2.close();
            }else if(dividir[4].equalsIgnoreCase("3º")){//y3++;
                BufferedWriter escreve3=new BufferedWriter(new FileWriter("3ºano",true));
                escreve3.write(dividir[0]+";"+dividir[1]+";"+dividir[4]+";\n");
                escreve3.close();
            }else if(dividir[4].equalsIgnoreCase("4º")){//y4++;
                BufferedWriter escreve4=new BufferedWriter(new FileWriter("4ºano",true));
                escreve4.write(dividir[0]+";"+dividir[1]+";"+dividir[4]+";\n");
               escreve4.close();
            }else if(dividir[4].equalsIgnoreCase("5º")){
            BufferedWriter escreve5=new BufferedWriter(new FileWriter("5ºano",true));
            escreve5.write(dividir[0]+";"+dividir[1]+";"+dividir[4]+";\n");
            escreve5.close();
            }
            ////////////////
            
            
          
            }
            // lersala.close();
            // lerdisciplina.close();
            leralunos.close();
            
        } catch (Exception e) {
        }
          chamar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanoActionPerformed
        // TODO add your handling code here:
        /*Escolher Ano
1º Ano
2º Ano
3º Ano
4º Ano
5º Ano*/
        String ano=Cano.getSelectedItem().toString();
        if(ano.equalsIgnoreCase("Geral")){
            try {
                 DefaultTableModel actualiza=(DefaultTableModel) Tabela.getModel();
                BufferedReader lerA=new BufferedReader(new FileReader("CadastroAlunos.txt"));
                String linha;
                actualiza.setRowCount(0);
                while((linha=lerA.readLine())!=null){
            String[] partir=linha.split(";");
            actualiza.addRow(partir);
            tot.setText(String.valueOf(y1));
           if(linha.isEmpty()){JOptionPane.showMessageDialog(rootPane,"Não há Alunos Matriculados Neste Ano");}

            }
            } catch (Exception e) {
            }
        }
        if(ano.equalsIgnoreCase("1º Ano")){
             try {
            DefaultTableModel actualiza=(DefaultTableModel) Tabela.getModel();
            BufferedReader ler=new BufferedReader(new FileReader("1ºano"));
            String linha;
            actualiza.setRowCount(0);
            while((linha=ler.readLine())!=null){
            String[] partir=linha.split(";");
            actualiza.addRow(partir);
            tot.setText(String.valueOf(y1));
           if(linha.isEmpty()){JOptionPane.showMessageDialog(rootPane,"Não há Alunos Matriculados Neste Ano");}

            }
        } catch (Exception e) {
        }
        }if(ano.equalsIgnoreCase("2º Ano")){
        try {
            DefaultTableModel actualiza=(DefaultTableModel) Tabela.getModel();
            BufferedReader ler=new BufferedReader(new FileReader("2ºano"));
            String linha;
            actualiza.setRowCount(0);
             while((linha=ler.readLine())!=null){
            String[] partir=linha.split(";");
            actualiza.addRow(partir);
             tot.setText(String.valueOf(y2));
            }
          //  if(linha.isEmpty()){JOptionPane.showMessageDialog(rootPane,"Não há Alunos Matriculados Neste Ano");}
        } catch (Exception e) {
        }
        }if(ano.equalsIgnoreCase("3º Ano")){
            try {
            DefaultTableModel actualiza=(DefaultTableModel) Tabela.getModel();
            BufferedReader ler=new BufferedReader(new FileReader("3ºano"));
            String linha;
            actualiza.setRowCount(0);
            while((linha=ler.readLine())!=null){
            String[] partir=linha.split(";");
            actualiza.addRow(partir);
             tot.setText(String.valueOf(y3));
            //if(linha.isEmpty()){JOptionPane.showMessageDialog(rootPane,"Não há Alunos Matriculados Neste Ano");}

            }
        } catch (Exception e) {
        }
        }if(ano.equalsIgnoreCase("4º Ano")){
            try {
            DefaultTableModel actualiza=(DefaultTableModel) Tabela.getModel();
            BufferedReader ler=new BufferedReader(new FileReader("4ºano"));
            String linha;
           actualiza.setRowCount(0);
            while((linha=ler.readLine())!=null){
            String[] partir=linha.split(";");
            actualiza.addRow(partir);
             tot.setText(String.valueOf(y4));
         // if(linha.isEmpty()){JOptionPane.showMessageDialog(rootPane,"Não há Alunos Matriculados Neste Ano");}

            }
        } catch (Exception e) {
        }
        }if(ano.equalsIgnoreCase("5º Ano")){
            try {
            DefaultTableModel actualiza=(DefaultTableModel) Tabela.getModel();
            BufferedReader ler=new BufferedReader(new FileReader("5ºano"));
            String linha;
           actualiza.setRowCount(0);
            while((linha=ler.readLine())!=null){
            String[] partir=linha.split(";");
            actualiza.addRow(partir);
             tot.setText(String.valueOf(y5));
           // if(linha.isEmpty()){JOptionPane.showMessageDialog(rootPane,"Não há Alunos Matriculados Neste Ano");}

            }
            
        } catch (Exception e) {
        }
        }
        
    }//GEN-LAST:event_CanoActionPerformed

    private void totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totActionPerformed

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
            java.util.logging.Logger.getLogger(EmparelharSalasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmparelharSalasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmparelharSalasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmparelharSalasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmparelharSalasDisciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cano;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tot;
    // End of variables declaration//GEN-END:variables
}
