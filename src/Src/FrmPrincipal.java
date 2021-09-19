 
package Src;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {

    String[] ipsec;
    boolean[] status;
    String[] erros;
    
    //Para os blocos
    String[] ipblc;
    String[] blocoGerado;
    String[] barras;
    String[] barrasblc;
    String[] erros2;
    boolean[] statusBlocos;
    
    
// D:\Usuarios\Usuario\Documents\Pingador\src
    
    public FrmPrincipal() {
        initComponents();
        this.setIconImage(new ImageIcon("..\\Pingador\\src\\imgs\\bolas_1744_Basketball_Ball.png").getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        campoBlocos = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaCMDBloco = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        botaoPingarBloco = new javax.swing.JButton();
        botaoPingarBloco2 = new javax.swing.JButton();
        checkRolagem = new javax.swing.JCheckBox();
        botaoLimparBloco = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboTema = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        botaoSair = new javax.swing.JButton();
        botaoCopiarEmUso = new javax.swing.JButton();
        botaoCopiarLivres = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        labelLivresBloco = new javax.swing.JLabel();
        labelUsoBloco = new javax.swing.JLabel();
        labelItens1 = new javax.swing.JLabel();
        labelRestantesBloco = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelBloco = new javax.swing.JLabel();
        labelPingadosBloco = new javax.swing.JLabel();
        campoPacket1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaIPsPingadosDeUmBloco = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        campoQtdBlocos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPrincipal = new javax.swing.JTable();
        campoIPs = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaCMD = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        botaoPingarIPs = new javax.swing.JButton();
        botaoPingarBloco3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelLivres = new javax.swing.JLabel();
        labelUso = new javax.swing.JLabel();
        labelItens = new javax.swing.JLabel();
        labelMili = new javax.swing.JLabel();
        campoPacket = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoQtd = new javax.swing.JTextField();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pingador 2.8 - by IMaximo");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        campoBlocos.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        campoBlocos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoBlocos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBlocosKeyReleased(evt);
            }
        });

        areaCMDBloco.setEditable(false);
        areaCMDBloco.setBackground(new java.awt.Color(153, 0, 0));
        areaCMDBloco.setColumns(20);
        areaCMDBloco.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        areaCMDBloco.setForeground(new java.awt.Color(255, 255, 0));
        areaCMDBloco.setRows(5);
        areaCMDBloco.setText("Pronto para nova tarefa...");
        jScrollPane4.setViewportView(areaCMDBloco);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoPingarBloco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/webmaster_2523_sport_basketball.png"))); // NOI18N
        botaoPingarBloco.setText("Pingar");
        botaoPingarBloco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPingarBloco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botaoPingarBlocoItemStateChanged(evt);
            }
        });
        botaoPingarBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPingarBlocoActionPerformed(evt);
            }
        });

        botaoPingarBloco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/webmaster_1700_monitor.png"))); // NOI18N
        botaoPingarBloco2.setText("Duplicar");
        botaoPingarBloco2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPingarBloco2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botaoPingarBloco2ItemStateChanged(evt);
            }
        });
        botaoPingarBloco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPingarBloco2ActionPerformed(evt);
            }
        });

        checkRolagem.setText("Rolagem automática");
        checkRolagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkRolagemItemStateChanged(evt);
            }
        });
        checkRolagem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkRolagemStateChanged(evt);
            }
        });

        botaoLimparBloco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/clean-16x16.png"))); // NOI18N
        botaoLimparBloco.setText("Limpar");
        botaoLimparBloco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoLimparBloco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botaoLimparBlocoItemStateChanged(evt);
            }
        });
        botaoLimparBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparBlocoActionPerformed(evt);
            }
        });

        jLabel7.setText("Tema:");

        comboTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matrix", "Ext. do Futuro", "Clássico", "Bios" }));
        comboTema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTemaItemStateChanged(evt);
            }
        });

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit-iloveimg-resized.png"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoCopiarEmUso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Botoes_Site_5745_Knob_Red-iloveimg-resized.png"))); // NOI18N
        botaoCopiarEmUso.setText("Copiar \"Em uso\"");
        botaoCopiarEmUso.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoCopiarEmUso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botaoCopiarEmUsoItemStateChanged(evt);
            }
        });
        botaoCopiarEmUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCopiarEmUsoActionPerformed(evt);
            }
        });

        botaoCopiarLivres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Botoes_Site_5752_Knob_Green-iloveimg-resized.png"))); // NOI18N
        botaoCopiarLivres.setText("Copiar \"Livres\"");
        botaoCopiarLivres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoCopiarLivres.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botaoCopiarLivresItemStateChanged(evt);
            }
        });
        botaoCopiarLivres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCopiarLivresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPingarBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPingarBloco2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoLimparBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(checkRolagem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(botaoCopiarEmUso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCopiarLivres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoPingarBloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPingarBloco2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLimparBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCopiarLivres, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCopiarEmUso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(botaoSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkRolagem)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contagens:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        labelLivresBloco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelLivresBloco.setForeground(new java.awt.Color(255, 0, 0));
        labelLivresBloco.setText("0 livre(s).");

        labelUsoBloco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelUsoBloco.setForeground(new java.awt.Color(0, 102, 0));
        labelUsoBloco.setText("0 em uso.");

        labelItens1.setText("0 item.");

        labelRestantesBloco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelRestantesBloco.setText("0 restante(s).");

        labelBloco.setText("Bloco: ");

        labelPingadosBloco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelPingadosBloco.setForeground(new java.awt.Color(0, 0, 255));
        labelPingadosBloco.setText("0 pingado(s).");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsoBloco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLivresBloco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelItens1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRestantesBloco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(labelBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPingadosBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelItens1)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRestantesBloco)
                .addGap(5, 5, 5)
                .addComponent(labelPingadosBloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLivresBloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsoBloco)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        campoPacket1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        campoPacket1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPacket1.setText("1400");

        jLabel3.setText("Bytes:");

        jLabel1.setText("Bloco:");

        tabelaIPsPingadosDeUmBloco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Endereço IP", "Status"
            }
        ));
        jScrollPane5.setViewportView(tabelaIPsPingadosDeUmBloco);

        jLabel6.setText("Disparos:");

        campoQtdBlocos.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        campoQtdBlocos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoQtdBlocos.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBlocos, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQtdBlocos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPacket1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoQtdBlocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoBlocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoPacket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bloco", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Endereço IP", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaPrincipal);

        campoIPs.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        campoIPs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoIPs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoIPsKeyReleased(evt);
            }
        });

        areaCMD.setEditable(false);
        areaCMD.setBackground(new java.awt.Color(0, 0, 0));
        areaCMD.setColumns(20);
        areaCMD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        areaCMD.setForeground(new java.awt.Color(0, 255, 0));
        areaCMD.setRows(5);
        jScrollPane2.setViewportView(areaCMD);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoPingarIPs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/webmaster_2523_sport_basketball.png"))); // NOI18N
        botaoPingarIPs.setText("Pingar");
        botaoPingarIPs.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPingarIPs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botaoPingarIPsItemStateChanged(evt);
            }
        });
        botaoPingarIPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPingarIPsActionPerformed(evt);
            }
        });

        botaoPingarBloco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Variados_0414_page_16.png"))); // NOI18N
        botaoPingarBloco3.setText("Duplicar");
        botaoPingarBloco3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPingarBloco3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPingarBloco3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPingarIPs, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(botaoPingarBloco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoPingarIPs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPingarBloco3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contagens:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        labelLivres.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelLivres.setForeground(new java.awt.Color(255, 0, 0));
        labelLivres.setText("0 livre(s).");

        labelUso.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelUso.setForeground(new java.awt.Color(0, 102, 0));
        labelUso.setText("0 em uso.");

        labelItens.setText("0 item.");

        labelMili.setText("0 ms.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLivres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelItens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelMili)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelItens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLivres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMili)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        campoPacket.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        campoPacket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPacket.setText("1400");

        jLabel2.setText("Bytes:");

        jLabel5.setText("IPs:");

        jLabel4.setText("Disparos:");

        campoQtd.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        campoQtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoQtd.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIPs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPacket, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoIPs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoPacket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("IP", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return true;
        }
    };
    
    public void coloreLinhaEspecifica(JTable tabela, boolean check) {
        if (check == true) {
            tabela.getRootPane().setBackground(Color.white);
            tabela.setBackground(Color.white);
        }
        if (check == false) {
            tabela.getRootPane().setBackground(Color.red);
            setBackground(Color.red);
        }
    }
    // ABA (1) dos IPs
    public void preencheTabelaIPs() {

        this.tabelaPrincipal.setModel(modelo);

        modelo.addColumn("Endereço IP");
        modelo.addColumn("Status");

        this.tabelaPrincipal.getColumnModel().getColumn(0).setPreferredWidth(30);
        this.tabelaPrincipal.getColumnModel().getColumn(1).setPreferredWidth(220);

        int t = 0;
        int f = 0;

        try {
            for (int i = 0; i < ipsec.length; i++) {
                if (String.valueOf(status[i]).equals("true")) {
                    modelo.addRow(new Object[]{ipsec[i], (Object) ("Em uso")});
//                    coloreLinhaEspecifica(tabelaPrincipal, true);
                    t++;
                } else if (String.valueOf(status[i]).equals("false")) {
                    modelo.addRow(new Object[]{ipsec[i], (Object) "Falha ao pingar"});
//                    coloreLinhaEspecifica(tabelaPrincipal, false);
                    f++;
                }

            }
        } catch (Exception e) {
            System.err.println(e);
        }

        labelLivres.setText(f + " livre(s).");
        labelUso.setText(t + " em uso.");

    }
    
    // ABA (2) dos blocos
    
    public void preencheTabelaBlocos() {
        

        this.tabelaPrincipal.setModel(modelo);

        modelo.addColumn("Endereço IP");
        modelo.addColumn("Status");

        this.tabelaPrincipal.getColumnModel().getColumn(0).setPreferredWidth(30);
        this.tabelaPrincipal.getColumnModel().getColumn(1).setPreferredWidth(220);

        int t = 0;
        int f = 0;

        try {
            for (int i = 0; i < ipsec.length; i++) {
                if (String.valueOf(status[i]).equals("true")) {
                    modelo.addRow(new Object[]{ipsec[i], (Object) ("Em uso")});
//                    coloreLinhaEspecifica(tabelaPrincipal, true);
                    t++;
                } else if (String.valueOf(status[i]).equals("false")) {
                    modelo.addRow(new Object[]{ipsec[i], (Object) "Falha ao pingar"});
//                    coloreLinhaEspecifica(tabelaPrincipal, false);
                    f++;
                }

            }
        } catch (Exception e) {
            System.err.println(e);
        }

        labelLivres.setText(f + " livre(s).");
        labelUso.setText(t + " em uso.");

    }
    
    private void geraTabelaIPsBloco() {
        this.tabelaIPsPingadosDeUmBloco.setModel(modelo);

        modelo.addColumn("Endereço IP");
        modelo.addColumn("Máscara Sub-rede");
        modelo.addColumn("Status");

        this.tabelaIPsPingadosDeUmBloco.getColumnModel().getColumn(0).setPreferredWidth(30);
        this.tabelaIPsPingadosDeUmBloco.getColumnModel().getColumn(1).setPreferredWidth(30);
        this.tabelaIPsPingadosDeUmBloco.getColumnModel().getColumn(2).setPreferredWidth(30);
    }
    
    public void preencheTabelaIPsBlocos(int inc) {

        int t = 0;
        int f = 0;
//        System.err.println("gerado "  +Arrays.toString(blocoGerado));
//        System.err.println("gerado "  +Arrays.toString(statusBlocos));
        try {
       //     for (int i = 0; i < blocoGerado.length; i++) {
                if (String.valueOf(statusBlocos[inc]).equals("true")) {
                    modelo.addRow(new Object[]{blocoGerado[inc], campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/"), (campoBlocos.getText().trim().length())), (Object) ("Em uso")});
//                    coloreLinhaEspecifica(tabelaPrincipal, true);
                    t++;
                } else if (String.valueOf(statusBlocos[inc]).equals("false")) {
                    modelo.addRow(new Object[]{blocoGerado[inc], campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/"), (campoBlocos.getText().trim().length())), (Object) "Falha ao pingar"});
//                    coloreLinhaEspecifica(tabelaPrincipal, false);
                    f++;
                }

         //   }
        } catch (Exception e) {
            System.err.println(e);
        }

//        labelLivresBloco.setText(f + " livre(s).");
//        labelUsoBloco.setText(t + " em uso.");

    }
    
    //


    private void botaoPingarIPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPingarIPsActionPerformed
        
        campoIPs.setText(campoIPs.getText() + " ");
        /* Corrige bug do total de itens */

        int j = 0;
        int corte = 0;
        int index = 0;
        for (int i = 0; i < campoIPs.getText().length(); i++) {
            if (campoIPs.getText().substring(i, i + 1).equals(" ") || campoIPs.getText().substring(i, i + 1).equals("  ") || campoIPs.getText().substring(i, i + 1).equals("   ") || campoIPs.getText().substring(i, i + 1).equals("    ") ) {
                ipsec[index] = campoIPs.getText().substring(corte, i + 1).trim();
                corte = i;
                index++;
            }
        }
        /*System.err.println(Arrays.toString(ipsec));
        System.out.println(Arrays.toString(ipsec)); */

        //////
        for (int k = 0; k < ipsec.length; k++) {
            try {
                status[k] = pingaHost(ipsec[k], campoQtd.getText());
            } catch (IOException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //System.out.println("erros "+Arrays.toString(status));
        preencheTabelaIPs();
        // barra.setValue(100);
        tabelaPrincipal.removeAll();

        long start = System.currentTimeMillis();
        // faz o trabalho a ser medido
        long elapsed = System.currentTimeMillis() - start;

        labelMili.setText((start - elapsed) / 1000d + " ms.");


    }//GEN-LAST:event_botaoPingarIPsActionPerformed

    private boolean pingaHost(String IP, String qtd) throws IOException {
        boolean retorno = false;
        try {
            Process exec = Runtime.getRuntime().exec("ping " + IP + " -n "+qtd+" -l " + campoPacket.getText());
            exec.waitFor();
            InputStream stream = exec.getInputStream();
            byte[] content = new byte[stream.available()];
            stream.read(content);
            areaCMD.setText(areaCMD.getText() + new String(content, Charset.forName("UTF-8")) + "\r\n" + "=================================================================" + "\r\n" + "=================================================================" + "\r\n" + "=================================================================" + "\r\n");
            for (int i = 0; i < new String(content, Charset.forName("UTF-8")).length(); i++) {

                String parsstr = new StringTokenizer(new String(content), "%").nextToken().trim();

//                System.err.println(">> "+parsstr.indexOf("ms"));
                
                
                if (!parsstr.endsWith("100")) { // Em uso.
                    retorno = true;
                } else if (!parsstr.endsWith("0")) { // Tempo esgotado.
                    retorno = false;
//                    System.out.println(retorno);
                }
                
                if ((!parsstr.contains("ms"))) {
                    retorno = false;
//                    System.out.println(retorno);
                }
                 
                if ((parsstr.contains("(TTL)"))) {
                    retorno = false;
//                    System.out.println(retorno);
                }
                
                /*                
                if (new String(content, StandardCharsets.UTF_8).substring(i, i+4).equals("100%")) {
                    return false;
                }
                 */
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return retorno;
    }
    
    private boolean pingaHostB(String IP, String qtd) throws IOException {
        
        
        
        boolean retorno = false;
        try {
            Process exec = Runtime.getRuntime().exec("ping " + IP + " -n " + qtd + " -l " + campoPacket1.getText());
            exec.waitFor();
            InputStream stream = exec.getInputStream();
            byte[] content = new byte[stream.available()];
            stream.read(content);
            areaCMDBloco.setText(areaCMDBloco.getText() + new String(content, Charset.defaultCharset()) + "\r\n" + "=================================================================" + "\r\n" + "=================================================================" + "\r\n" + "=================================================================" + "\r\n");
           
            
            
            for (int i = 0; i < new String(content, Charset.defaultCharset()).length(); i++) {

                String parsstr = new StringTokenizer(new String(content), "%").nextToken().trim();

                if (!parsstr.endsWith("100")) { // Em uso.
                    retorno = true;
                } else if (!parsstr.endsWith("0")) { // Tempo esgotado.
                    retorno = false;
//                    System.out.println(retorno);
                }
                
                if ((!parsstr.contains("ms"))) {
                    retorno = false;
//                    System.out.println(retorno);
                }
                 
                if ((parsstr.contains("(TTL)"))) {
                    retorno = false;
//                    System.out.println(retorno);
                }
                

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    private void campoIPsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIPsKeyReleased
        int j = 1;

        for (int i = 0; i < campoIPs.getText().length(); i++) {
            if (campoIPs.getText().substring(i, i + 1).equals(" ") || campoIPs.getText().substring(i, i + 1).equals("  ") || campoIPs.getText().substring(i, i + 1).equals("   ")) {
                j++;
            }
        }
        labelItens.setText(j + " itens.");
        if (campoIPs.getText().length() == 0) {
            labelItens.setText("0 item.");
        }

        ipsec = new String[j];
        status = new boolean[j];
        erros = new String[j];
    }//GEN-LAST:event_campoIPsKeyReleased

    private void botaoPingarIPsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botaoPingarIPsItemStateChanged
        areaCMD.setText("Pingando, aguarde...");
    }//GEN-LAST:event_botaoPingarIPsItemStateChanged

    private void campoBlocosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBlocosKeyReleased
//        int j = 1;
        defineBarra(Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim()));
        //System.out.println(defineBarra(Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim())));
        labelItens1.setText(defineBarra(Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim())) + " IPs.");

        if (campoBlocos.getText().trim().length() == 0) {
            labelItens1.setText("0 IP.");
        }
        
        statusBlocos = new boolean[defineBarra(Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim()))];
        ipblc = new String[defineBarra(Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim()))];
        barras = new String[defineBarra(Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim()))];
        erros2 = new String[defineBarra(Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim()))];
        
//        campoBlocos.setText(campoBlocos.getText().trim().trim());
        
    }//GEN-LAST:event_campoBlocosKeyReleased

    private void botaoPingarBlocoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botaoPingarBlocoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPingarBlocoItemStateChanged

    public int defineBarra(int CIDR) {

        if (CIDR == 32) {
            return 1;
        }
        if (CIDR == 31) {
            return 0;
        }
        if (CIDR == 30) {
            return 2;
        }
        if (CIDR == 29) {
            return 6;
        }
        if (CIDR == 28) {
            return 14;
        }
        if (CIDR == 27) {
            return 30;
        }
        if (CIDR == 26) {
            return 62;
        }
        if (CIDR == 25) {
            return 126;
        }
        if (CIDR == 24) {
            return 254;
        }
        if (CIDR == 23) {
            return 512;
        }
        if (CIDR == 22) {
            return 1024;
        }
        if (CIDR == 21) {
            return 2048;
        }
        if (CIDR == 20) {
            return 4096;
        }
        if (CIDR == 19) {
            return 8192;
        }
        if (CIDR == 18) {
            return 16384;
        }
        if (CIDR == 17) {
            return 32768;
        }
        if (CIDR == 16) {
            return 65536;
        }
        if (CIDR == 15) {
            return 131072;
        }
        if (CIDR == 14) {
            return 262144;
        }
        if (CIDR == 13) {
            return 524288;
        }
        if (CIDR == 12) {
            return 1048576;
        }
        if (CIDR == 11) {
            return 2097152;
        }
        if (CIDR == 10) {
            return 4194304;
        }

        return 0;
    }

    private String[] geraBloco(String bloco, int CIDR) {
//        System.out.println(bloco.substring(0, bloco.indexOf("/")) + " / " + CIDR);
        String[] blocoCompleto = new String[defineBarra(CIDR)];

        int octeto1 = 0;
        int octeto2 = 0;
        int octeto3 = 0;
        int octeto4 = 0;
        
        int corte = 0;
        int cortes[] = new int[3];
        
        for (int i = 0; i < bloco.length(); i++) {
            // 192.168.0.1
            if (bloco.substring(i, i+1).equals(".")) {
                cortes[corte] = i;
                corte++;
            }
        }
     
        octeto1 = Integer.parseInt(bloco.substring(0, cortes[0])); // 192.
        octeto2 = Integer.parseInt(bloco.substring(cortes[0]+1, cortes[1])); // 168.
        octeto3 = Integer.parseInt(bloco.substring(cortes[1]+1, cortes[2])); // 0.
        octeto4 = Integer.parseInt(bloco.substring(cortes[2]+1, bloco.indexOf("/"))); // 1
       
//        System.out.println("Cortes: "+Arrays.toString(cortes));
//        System.out.println("IP concatenado 2 -> "+octeto1+"."+octeto2+"."+octeto3+"."+octeto4);
//        System.out.println("CIDR " + CIDR + ", total de IPs: "+defineBarra(CIDR));

        // 0.0.0.0 - 255.255.255.255
        
        //  1º    2º   3º  4º
        // 192 . 168 . 0 . 1
        for (int i = 0; i < defineBarra(CIDR); i++) { // i < defineBarra(CIDR); i++)  Ex: 10.0.0.0 terminar em 255.255.255.255
            if (octeto4 < 256) {
                octeto4++;
            } 
                if (octeto4 == 255) {
                    octeto4 = 0;
                    octeto3++;
                } else {
                    if (octeto3 == 255) {
                        octeto3 = 0;
                        octeto2++;
                    } else {
                        if (octeto2 == 255) {
                            octeto2 = 0;
                            octeto1++;
                        }
                    }
                
            }
            
            blocoCompleto[i] = +octeto1+"."+octeto2+"."+octeto3+"."+octeto4;
//            System.err.println(blocoCompleto[i]);
        }
        
//        System.out.println(Arrays.toString(IPsGerados));
//        System.err.println("ip definido = "+octeto1+"."+octeto2+"."+octeto3+"."+octeto4);
System.out.println(Arrays.toString(blocoCompleto));
        return blocoCompleto;
    }
    
    private void limpar(DefaultTableModel modelo) {
        
        areaCMDBloco.setText("");
        modelo.removeTableModelListener(tabelaPrincipal);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        campoBlocos.setText("");
        String[] ipsec;
        boolean[] status;
        String[] erros;
       
        ipblc = null;
        blocoGerado = null;
        barras = null;
        barrasblc = null;
        erros2 = null;
        statusBlocos = null;
        
        labelBloco.setText("Bloco: ");
        labelItens1.setText("0 item.");
        labelLivresBloco.setText("0 livre(s).");
        labelRestantesBloco.setText("0 restante(s).");
        labelUsoBloco.setText("0 em uso.");
        
        areaCMDBloco.setText("Pronto para nova tarefa...");
    }
    
    boolean autoScroll = false;
    
    private void botaoPingarBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPingarBlocoActionPerformed
        areaCMDBloco.setText("");
        botaoLimparBloco.setEnabled(false);
//        limpar(modelo);
        botaoPingarBloco.setEnabled(false);
        
        labelBloco.setText("Bloco: "+campoBlocos.getText().trim());
        

        
        tabelaIPsPingadosDeUmBloco.removeAll();
        campoBlocos.setText(campoBlocos.getText().trim() );
        /* Corrige bug do total de itens */
        
        blocoGerado = geraBloco(campoBlocos.getText().trim(), Integer.parseInt(campoBlocos.getText().trim().substring(campoBlocos.getText().trim().indexOf("/")+1, campoBlocos.getText().trim().length()).trim()));
        
        geraTabelaIPsBloco();
        
        // Thread
        UIManager.put("ProgressBar.background", Color.blue);
        new Thread(new Runnable() {
                    public void run() {
                        
                        int u = 0;
                        int f = 0;
       
                        for (int i = 0; i < blocoGerado.length; i++) {
                            try {
//                                barra2.setValue(i);
                                statusBlocos[i] = pingaHostB(blocoGerado[i], campoQtdBlocos.getText());
                                preencheTabelaIPsBlocos(i);
                                
                                
                                if (statusBlocos[i] == true) {
                                    u++;
                                    labelLivresBloco.setText(u+" em uso.");
                                } else 
                                if (statusBlocos[i] == false) {
                                    f++;
                                    labelUsoBloco.setText(f+" livre(s).");
                                }
                                
                                labelRestantesBloco.setText(String.valueOf(statusBlocos.length-1 - i) + " restante(s).");
                                labelPingadosBloco.setText(String.valueOf((i+1) + " pingado(s)."));
//                                tabelaIPsPingadosDeUmBloco.getSelectionModel().setSelectionInterval(i, i);

                                if (autoScroll == true) {
                                    tabelaIPsPingadosDeUmBloco.scrollRectToVisible(new Rectangle(tabelaIPsPingadosDeUmBloco.getCellRect(i, 0, true)));
//                                    areaCMD1.setSelectionStart(i);
                                } 
                                
                                if (autoScroll == false);
                                

                            } catch (IOException ex) {
                                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            }
//                            System.out.println("i "+i + "blocogerado.length "+blocoGerado.length);
                            if (i == blocoGerado.length-1) {
                                botaoLimparBloco.setEnabled(true);
                            }
                            
                        }
                    }
        }).start();
        

    }//GEN-LAST:event_botaoPingarBlocoActionPerformed

    private void botaoPingarBloco2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botaoPingarBloco2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPingarBloco2ItemStateChanged

    private void botaoPingarBloco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPingarBloco2ActionPerformed
        FrmPrincipal frmPrincipal = new FrmPrincipal(); //.setVisible(true);
        frmPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoPingarBloco2ActionPerformed

    private void botaoPingarBloco3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPingarBloco3ActionPerformed
        new FrmPrincipal().setVisible(true);
    }//GEN-LAST:event_botaoPingarBloco3ActionPerformed

    private void checkRolagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkRolagemItemStateChanged
        if (autoScroll == false) {
            autoScroll = true;
//            System.err.println(autoScroll+" <<");
        } else {
            autoScroll = false;
//            System.err.println(autoScroll+" <<");
        }
    }//GEN-LAST:event_checkRolagemItemStateChanged

    private void checkRolagemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkRolagemStateChanged
        
    }//GEN-LAST:event_checkRolagemStateChanged

    private void botaoLimparBlocoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botaoLimparBlocoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoLimparBlocoItemStateChanged

    private void botaoLimparBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparBlocoActionPerformed
        limpar(modelo);
        botaoPingarBloco.setEnabled(true);
    }//GEN-LAST:event_botaoLimparBlocoActionPerformed

    private void comboTemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTemaItemStateChanged
        /*
        
        Matrix
        Ext. do Futuro
        Clássico
        Bios
        
        */
        
        if (comboTema.getSelectedItem().toString().equals("Matrix")) {
            areaCMDBloco.setBackground(Color.black);
            areaCMDBloco.setForeground(Color.green);
        }
        if (comboTema.getSelectedItem().toString().equals("Ext. do Futuro")) {
            areaCMDBloco.setBackground(new java.awt.Color(140, 0, 0));
            areaCMDBloco.setForeground(Color.yellow);
        }
        if (comboTema.getSelectedItem().toString().equals("Clássico")) {
            areaCMDBloco.setBackground(Color.white);
            areaCMDBloco.setForeground(Color.black);
        }
        if (comboTema.getSelectedItem().toString().equals("Bios")) {
            areaCMDBloco.setBackground(new java.awt.Color(0, 0, 210));
            areaCMDBloco.setForeground(Color.white);
        }
        
    }//GEN-LAST:event_comboTemaItemStateChanged

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        System.exit(this.EXIT_ON_CLOSE);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoCopiarEmUsoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botaoCopiarEmUsoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCopiarEmUsoItemStateChanged

    private void botaoCopiarEmUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCopiarEmUsoActionPerformed
        copiaClipBoard("uso");
    }//GEN-LAST:event_botaoCopiarEmUsoActionPerformed

    private void botaoCopiarLivresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botaoCopiarLivresItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCopiarLivresItemStateChanged

    private void botaoCopiarLivresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCopiarLivresActionPerformed
        copiaClipBoard("livres");
    }//GEN-LAST:event_botaoCopiarLivresActionPerformed

    public void copiaClipBoard(String tipo) {
        if (tipo.equals("livres")) {
            String text = "";
            Clipboard clipboard;
            StringSelection selection;
            for (int i = 0; i < tabelaIPsPingadosDeUmBloco.getRowCount(); i++) {
                if (tabelaIPsPingadosDeUmBloco.getValueAt(i, 2).equals("Falha ao pingar")) {
                    clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    text = text + tabelaIPsPingadosDeUmBloco.getValueAt(i, 0) + tabelaIPsPingadosDeUmBloco.getValueAt(i, 1) + " - " + tabelaIPsPingadosDeUmBloco.getValueAt(i, 2) + "\r\n";
                    selection = new StringSelection(text);
                    clipboard.setContents(selection, null);
                }

            }
            JOptionPane.showMessageDialog(null, "Copiado para a área de transferência, cole em um bloco de notas ou uma planilha!");
        } 
        
        if (tipo.equals("uso")) {
            String text = "";
            Clipboard clipboard;
            StringSelection selection;
            for (int i = 0; i < tabelaIPsPingadosDeUmBloco.getRowCount(); i++) {
                if (tabelaIPsPingadosDeUmBloco.getValueAt(i, 2).equals("Em uso")) {
                    clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    text = text + tabelaIPsPingadosDeUmBloco.getValueAt(i, 0) + tabelaIPsPingadosDeUmBloco.getValueAt(i, 1) + " - " + tabelaIPsPingadosDeUmBloco.getValueAt(i, 2) + "\r\n";
                    selection = new StringSelection(text);
                    clipboard.setContents(selection, null);
                }

            }
            JOptionPane.showMessageDialog(null, "Copiado para a área de transferência, cole em um bloco de notas ou uma planilha!");
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCMD;
    private javax.swing.JTextArea areaCMDBloco;
    private javax.swing.JButton botaoCopiarEmUso;
    private javax.swing.JButton botaoCopiarLivres;
    private javax.swing.JButton botaoLimparBloco;
    private javax.swing.JButton botaoPingarBloco;
    private javax.swing.JButton botaoPingarBloco2;
    private javax.swing.JButton botaoPingarBloco3;
    private javax.swing.JButton botaoPingarIPs;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField campoBlocos;
    private javax.swing.JTextField campoIPs;
    private javax.swing.JTextField campoPacket;
    private javax.swing.JTextField campoPacket1;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JTextField campoQtdBlocos;
    private javax.swing.JCheckBox checkRolagem;
    private javax.swing.JComboBox<String> comboTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelBloco;
    private javax.swing.JLabel labelItens;
    private javax.swing.JLabel labelItens1;
    private javax.swing.JLabel labelLivres;
    private javax.swing.JLabel labelLivresBloco;
    private javax.swing.JLabel labelMili;
    private javax.swing.JLabel labelPingadosBloco;
    private javax.swing.JLabel labelRestantesBloco;
    private javax.swing.JLabel labelUso;
    private javax.swing.JLabel labelUsoBloco;
    private javax.swing.JTable tabelaIPsPingadosDeUmBloco;
    private javax.swing.JTable tabelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
