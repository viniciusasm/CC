/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;
import Modelo.Controle;
import javax.swing.JOptionPane;


public class frmPrincipal extends javax.swing.JDialog
{

   
    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPrimeiroNumero = new javax.swing.JLabel();
        lblSegundoNumero = new javax.swing.JLabel();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        txfPrimeiroNumero = new javax.swing.JTextField();
        txfSegundoNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPrimeiroNumero.setText("Primeiro Numero");

        lblSegundoNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSegundoNumero.setText("Segundo Numero");

        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubtrairActionPerformed(evt);
            }
        });

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrimeiroNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSegundoNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSomar)
                            .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnSubtrair)
                                .addGap(58, 58, 58)
                                .addComponent(btnDividir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMultiplicar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundoNumero)
                    .addComponent(lblPrimeiroNumero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfSegundoNumero)
                    .addComponent(txfPrimeiroNumero)
                    .addComponent(lblResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSomar)
                    .addComponent(btnSubtrair)
                    .addComponent(btnDividir)
                    .addComponent(btnMultiplicar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Executar(String op)
    {
        Controle controle = new Controle();
        controle.setNum1(txfPrimeiroNumero.getText());
        controle.setNum2(txfSegundoNumero.getText());
        controle.setOp(op);
        controle.Calcular();
        if (controle.getMensagem().equals(""))
        {
            lblResultado.setText(controle.getResultado());
        }
        else 
        {
            JOptionPane.showMessageDialog(null, 
                    controle.getMensagem());
        }
    }
    
    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomarActionPerformed
    {//GEN-HEADEREND:event_btnSomarActionPerformed
        this.Executar("+");
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubtrairActionPerformed
    {//GEN-HEADEREND:event_btnSubtrairActionPerformed
        this.Executar("-");
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDividirActionPerformed
    {//GEN-HEADEREND:event_btnDividirActionPerformed
        this.Executar("/");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicarActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicarActionPerformed
        this.Executar("*");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

  
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JLabel lblPrimeiroNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegundoNumero;
    private javax.swing.JTextField txfPrimeiroNumero;
    private javax.swing.JTextField txfSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
