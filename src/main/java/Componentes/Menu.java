package Componentes;

import Controladores.ControlProductos;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicScrollBarUI;


public class Menu extends javax.swing.JPanel {

    private ControlProductos control;

    public Menu() {
        initComponents();
        
        personalizarScrollPane(jScrollPane1);
        personalizarScrollPane(jScrollPane2);
        personalizarScrollPane(jScrollPane3);
        personalizarScrollPane(jScrollPane4);

        control = new ControlProductos();

        cargarProductos();
    }

    private void cargarProductos() {
        JPanel panelDulce = new JPanel(new GridLayout(0, 4, 15, 15));
        JPanel panelSal = new JPanel(new GridLayout(0, 4, 15, 15));
        JPanel panelIntegral = new JPanel(new GridLayout(0, 4, 15, 15));
        JPanel panelReposteria = new JPanel(new GridLayout(0, 4, 15, 15));
        
        for (Modelo.Productos p : control.getProductos()) {
            Componentes.Productos tarjeta = new Componentes.Productos();
            tarjeta.setProducto(p);
            
            switch (p.getCategoria()) {
                case PAN_DULCE:
                    panelDulce.add(tarjeta);
                    break;
                
                case PAN_DE_SAL:
                    panelSal.add(tarjeta);
                    break;
                    
                case PAN_INTEGRAL:
                    panelIntegral.add(tarjeta);
                    break;
                    
                case REPOSTERIA:
                    panelReposteria.add(tarjeta);
                    break;
            }
        }
        jScrollPane1.setViewportView(panelDulce);
        jScrollPane2.setViewportView(panelIntegral);
        jScrollPane3.setViewportView(panelSal);
        jScrollPane4.setViewportView(panelReposteria);
        
        panelDulce.setBackground(Color.WHITE);
        panelSal.setBackground(Color.WHITE);
        panelIntegral.setBackground(Color.WHITE);
        panelReposteria.setBackground(Color.WHITE);
    }
    
    private void personalizarScrollPane(javax.swing.JScrollPane scrollPane) {
        
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(8, 0)); // ancho de la barra
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            
            @Override
            protected void configureScrollBarColors() {
                // Barra que se mueve
                thumbColor = new Color(235, 191, 136);
                // Fondo de la barra
                trackColor = Color.WHITE;
            }
            
            @Override
            protected JButton createDecreaseButton(int orientation) {
                return crearBotonVacio();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return crearBotonVacio();
            }

            private JButton crearBotonVacio() {
                JButton boton = new JButton();
                boton.setPreferredSize(new Dimension(0, 0));
                return boton;
            }

        @Override
        protected void paintThumb(java.awt.Graphics g,javax.swing.JComponent c,java.awt.Rectangle thumbBounds) {

            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(235, 191, 136));
            g2.fillRoundRect(thumbBounds.x,thumbBounds.y,thumbBounds.width,thumbBounds.height,10,10);
            g2.dispose();
        }

        @Override
        protected void paintTrack(java.awt.Graphics g,javax.swing.JComponent c,java.awt.Rectangle trackBounds) {
            g.setColor(Color.WHITE);
            g.fillRect(trackBounds.x,trackBounds.y,trackBounds.width,trackBounds.height);
        }
    });

    scrollPane.getVerticalScrollBar().setUnitIncrement(16);
    scrollPane.setBorder(null);
    scrollPane.getViewport().setBackground(Color.WHITE);
}
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTPanelMenu = new javax.swing.JTabbedPane();
        jPPanDulce = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPPanSal = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPPanIntegral = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JPReposteria = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(255, 255, 255));

        JTPanelMenu.setBackground(new java.awt.Color(251, 245, 233));
        JTPanelMenu.setToolTipText("");
        JTPanelMenu.setAutoscrolls(true);
        JTPanelMenu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPPanDulce.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(215, 215, 191));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPPanDulceLayout = new javax.swing.GroupLayout(jPPanDulce);
        jPPanDulce.setLayout(jPPanDulceLayout);
        jPPanDulceLayout.setHorizontalGroup(
            jPPanDulceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPPanDulceLayout.setVerticalGroup(
            jPPanDulceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        JTPanelMenu.addTab("Pan de Dulce ", jPPanDulce);

        jPPanSal.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(215, 215, 191));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPPanSalLayout = new javax.swing.GroupLayout(jPPanSal);
        jPPanSal.setLayout(jPPanSalLayout);
        jPPanSalLayout.setHorizontalGroup(
            jPPanSalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        jPPanSalLayout.setVerticalGroup(
            jPPanSalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        JTPanelMenu.addTab("Pan de Sal", jPPanSal);

        jPPanIntegral.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(215, 215, 191));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPPanIntegralLayout = new javax.swing.GroupLayout(jPPanIntegral);
        jPPanIntegral.setLayout(jPPanIntegralLayout);
        jPPanIntegralLayout.setHorizontalGroup(
            jPPanIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        jPPanIntegralLayout.setVerticalGroup(
            jPPanIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        JTPanelMenu.addTab("Pan Integral", jPPanIntegral);

        JPReposteria.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(215, 215, 191));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout JPReposteriaLayout = new javax.swing.GroupLayout(JPReposteria);
        JPReposteria.setLayout(JPReposteriaLayout);
        JPReposteriaLayout.setHorizontalGroup(
            JPReposteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        JPReposteriaLayout.setVerticalGroup(
            JPReposteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        JTPanelMenu.addTab("Reposteria /Pasteles", JPReposteria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JTPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JTPanelMenu))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPReposteria;
    private javax.swing.JTabbedPane JTPanelMenu;
    private javax.swing.JPanel jPPanDulce;
    private javax.swing.JPanel jPPanIntegral;
    private javax.swing.JPanel jPPanSal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
